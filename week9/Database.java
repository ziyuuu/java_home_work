package com.company;

import java.util.ArrayList;

class DataBase
{
    ArrayList<Items> db = new ArrayList<Items>();
    public void additem(Items items){
        db.add(items);
    }
    public void list()
    {
        for ( Items items : db )
        {
            System.out.println("["+items+"]");
        }
    }
}
