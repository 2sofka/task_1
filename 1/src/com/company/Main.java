package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);list.add(0);
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        int Summ = 0;

        for(int i =0; i < chars.length;i++)
            if(list.contains((int)(chars[i])-48))
                Summ += chars[i]-48;

        System.out.print(Summ);
    }
}
