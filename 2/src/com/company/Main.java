package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

            double Num = scanner.nextDouble();
            if(Num - (int)Num == 0) {
                boolean NumIsSimple = true;
                for (int i = 2; i < Num/2 + 1; i++) {
                    boolean isSimple = true;
                    for (int j = 2; j < i / 2 + 1; j++)
                        if (i % j == 0)
                            isSimple = false;

                    if (Num % i == 0 & isSimple) {
                        System.out.print(i + " ");
                        NumIsSimple = false;
                    }
                }
                if(NumIsSimple)
                    System.out.print((int)Num);

            }
            else
                System.out.print("Ошибка, введённое число не является целочичсленным значением");
    }
}
