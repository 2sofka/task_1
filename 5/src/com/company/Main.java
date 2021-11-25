package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Case safe = new Case();
        safe.resize(scanner.nextInt());
        ArrayList<Item> items = new ArrayList<>(scanner.nextInt());
        ArrayList<Item> BestItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++)
            items.add(new Item(scanner.nextInt(),scanner.nextInt()));

        int i = 0;
        while (i<items.size())
        {
            int j = 0;
            while(j < items.size())
            {


            }




        }


    }
}
