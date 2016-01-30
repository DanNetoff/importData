package com.company;

/**
 * Created by DanNetoff on 30.01.2016.
 */
public class Queries {

    public static final String SELECT_FILIALS_LIST_BY_ENABL= "SELECT number_filial, code_filial WHERE enabl = ?";

    public static final String IMPORT_INTO_DAILY_DATA_FROM_FILIALS = "INSERT INTO dailyData (codeFilial,loadDate,loadStatus) " +
            "SELECT code_filial,now(),0 FROM filials " +
            " WHERE enabl=true";

    public static final String SELECT_COUNT_ = "SELECT count(id) FROM dailyData WHERE loadDate = ?" +
            " if count = 0 then { " +
            " идём дальше в пункт 2.}\n" +
            " else {\n" +
            " идём дальше в пункт 3.}"
}
