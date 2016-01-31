package com.company;

import java.beans.Statement;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class Main {

    /**
     * Логика
     * 1. Чекаем, есть ли список за сегодня?
     * <p>
     * SELECT count(id) FROM dailyData
     * if count = 0 then {
     * идём дальше в пункт 2.}
     * else {
     * идём дальше в пункт 3.}
     * <p>
     * 2. Добавим список открытых на сегодня ЛО
     * INSERT INTO dailyData
     * (codeFilial,loadDate,loadStatus)
     * SELECT code_filial,now(),0 FROM filials
     * WHERE enabl=true
     * <p>
     * 3. Выбираем нужный для загрузки list
     * SELECT * FROM dailyData
     * WHERE loadStatus=0
     **/

    public static void main(String[] args) throws NoSuchMethodException, ParseException, IllegalAccessException, SQLException, InvocationTargetException, ClassNotFoundException {

        Set<importPojo> set = DButils.getList(Queries.SELECT_FILIALS_LIST_BY_ENABL,1);

        System.out.println(set.toString());


        /*

        Connection conn = null;
        PreparedStatement stmt = null;
      //  PreparedStatement stmt = null;

        try {
            stmt = connectionToMDB.getConnection().prepareStatement(Queries.SELECT_FILIALS_LIST_BY_ENABL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DButils.setParameters(stmt,true);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO Registration " +
                    "VALUES (100, 'Zara', 'Ali', 18)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration " +
                    "VALUES (101, 'Mahnaz', 'Fatma', 25)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration " +
                    "VALUES (102, 'Zaid', 'Khan', 30)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration " +
                    "VALUES(103, 'Sumit', 'Mittal', 28)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
//end main
//end JDBCExample
*/
    }
}
