package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> city = new HashMap<String, Integer>();
        int i=0;
        while(true){
            String s=in.next();
            if (s.equals("###"))
            {
                break;
            }
            city.put(s,i);
            i++;
        }
        int[][] miles =new int[city.size()][city.size()];
        for (int j=0;j<city.size();j++)
        {
            for (int k=0;k<city.size();k++)
            {
                miles[j][k]=in.nextInt();
            }
        }
        int first = city.get(in.next());
        int second = city.get(in.next());
        System.out.println(miles[first][second]);

    }
}
