package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        char[] num = scanner.next().toCharArray();
        String[] rows = new String[5];
        for(int i = 0 ; i < 5; i++)
            rows[i] = "";

        int max = 0;
        for(int i = 0; i < num.length; i++)
            if(max<(int)num[i] - 48)
                max = (int)num[i] - 48;

        for(int i = 0; i < num.length; i++)
        {
            if(num[i] == '1')
                if((int)num[i] - 48 != max)
                    for(int j = 0; j < 5;j++)
                        rows[j] +="*  ";
                else
                    for(int j = 0; j < 5;j++)
                        rows[j] +="1  ";

            if(num[i] == '2')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "**   ";
                    rows[1] += "  *  ";
                    rows[2] += " *   ";
                    rows[3] += "*    ";
                    rows[4] += "***  ";
                }
                else
                {
                    rows[0] += "22   ";
                    rows[1] += "  2  ";
                    rows[2] += " 2   ";
                    rows[3] += "2    ";
                    rows[4] += "222  ";
                }

            if(num[i] == '3')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "***  ";
                    rows[1] += "  *  ";
                    rows[2] += "***  ";
                    rows[3] += "  *  ";
                    rows[4] += "***  ";
                }
                else
                {
                    rows[0] += "333  ";
                    rows[1] += "  3  ";
                    rows[2] += "333  ";
                    rows[3] += "  3  ";
                    rows[4] += "333  ";
                }

            if(num[i] == '4')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "*  *  ";
                    rows[1] += "*  *  ";
                    rows[2] += "****  ";
                    rows[3] += "   *  ";
                    rows[4] += "   *  ";
                }
                else
                {
                    rows[0] += "4  4  ";
                    rows[1] += "4  4  ";
                    rows[2] += "4444  ";
                    rows[3] += "   4  ";
                    rows[4] += "   4  ";
                }

            if(num[i] == '5')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "***  ";
                    rows[1] += "*    ";
                    rows[2] += "***  ";
                    rows[3] += "  *  ";
                    rows[4] += "***  ";
                }
                else
                {
                    rows[0] += "555  ";
                    rows[1] += "5    ";
                    rows[2] += "555  ";
                    rows[3] += "  5  ";
                    rows[4] += "555  ";
                }

            if(num[i] == '6')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "***  ";
                    rows[1] += "*    ";
                    rows[2] += "***  ";
                    rows[3] += "* *  ";
                    rows[4] += "***  ";
                }
                else
                {
                    rows[0] += "666  ";
                    rows[1] += "6    ";
                    rows[2] += "666  ";
                    rows[3] += "6 6  ";
                    rows[4] += "666  ";
                }

            if(num[i] == '7')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "****  ";
                    rows[1] += "   *  ";
                    rows[2] += "  *   ";
                    rows[3] += " *    ";
                    rows[4] += "*     ";
                }
                else
                {
                    rows[0] += "7777  ";
                    rows[1] += "   7  ";
                    rows[2] += "  7   ";
                    rows[3] += " 7    ";
                    rows[4] += "7     ";
                }

            if(num[i] == '8')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "***  ";
                    rows[1] += "* *  ";
                    rows[2] += "***  ";
                    rows[3] += "* *  ";
                    rows[4] += "***  ";
                }
                else
                {
                    rows[0] += "888  ";
                    rows[1] += "8 8  ";
                    rows[2] += "888  ";
                    rows[3] += "8 8  ";
                    rows[4] += "888  ";
                }

            if(num[i] == '9')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "***  ";
                    rows[1] += "* *  ";
                    rows[2] += "***  ";
                    rows[3] += "  *  ";
                    rows[4] += "***  ";
                }
                else
                {
                    rows[0] += "999  ";
                    rows[1] += "9 9  ";
                    rows[2] += "999  ";
                    rows[3] += "  9  ";
                    rows[4] += "999  ";
                }

            if(num[i] == '0')
                if((int)num[i] - 48 != max)
                {
                    rows[0] += "***  ";
                    rows[1] += "* *  ";
                    rows[2] += "* *  ";
                    rows[3] += "* *  ";
                    rows[4] += "***  ";
                }
                else
                {
                    rows[0] += "000  ";
                    rows[1] += "0 0  ";
                    rows[2] += "0 0  ";
                    rows[3] += "0 0  ";
                    rows[4] += "000  ";
                }
        }

        for(int i = 0 ; i < 5; i++ )
            System.out.println(rows[i]);

    }
}
