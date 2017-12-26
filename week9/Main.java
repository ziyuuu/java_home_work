package com.company;

import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataBase db=new DataBase();
        db.additem(new Mp3("goodday","li","days",3,"nice",true));
        db.list();
    }
}
