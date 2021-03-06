package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> strings = new ArrayList<>();
        strings.add('а');strings.add('и');strings.add('о');strings.add('ё');strings.add('е');
        strings.add('у');strings.add('ы');strings.add('э');strings.add('я');strings.add('ю');

        String[] str = scanner.nextLine().split(" ");
        int[] nums = new int[str.length];

        for(int i =0; i < str.length;i++)
        {
            boolean NeedToUpper = true;
            char[] chars = str[i].toCharArray();
            nums[i] = 0;
            str[i] = "";
            for(int j = 0; j < chars.length;j++) {
                if (strings.contains(chars[j]))
                    if (NeedToUpper) {
                        chars[j] = Character.toUpperCase(chars[j]);
                        nums[i]++;
                        NeedToUpper = false;
                    } else
                        nums[i]++;

                    str[i]+=chars[j];
            }
        }

        for (int i = 0; i < str.length;i++)
            for(int j = i; j < str.length;j++)
                if(nums[i] < nums[j])
                {
                    int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                    String b = str[j];
                    str[j] = str[i];
                    str[i] = b;
                }

        for (int i = 0; i < str.length;i++)
            System.out.println(str[i] + " " + nums[i]);
    }
}
