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
        ArrayList<Item> items = new ArrayList<>();
        int howManyItems = scanner.nextInt();
        for (int i = 0; i < howManyItems; i++) {
            items.add(new Item(0, 0));
            items.get(items.size()-1).SetCost(scanner.nextInt());
            items.get(items.size()-1).SetSize(scanner.nextInt());
        }


        safe.Solution(items);


    }
}
