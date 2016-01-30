package com.company;

public class Main {

/**
    Логика
 1. Чекаем, есть ли список за сегодня?

 SELECT count(id) FROM dailyData
 if count = 0 then {
 идём дальше в пункт 2.}
 else {
 идём дальше в пункт 3.}

 2. Добавим список открытых на сегодня ЛО
 INSERT INTO dailyData
 (codeFilial,loadDate,loadStatus)
 SELECT code_filial,now(),0 FROM filials
 WHERE enabl=true

 3. Выбираем нужный для загрузки list
 SELECT * FROM dailyData
 WHERE loadStatus=0
**/

    public static void main(String[] args) {
	// write your code here
    }
}
