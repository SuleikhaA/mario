package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number");
int number = input.nextInt();
        for(int z=0; z<=number; z++)
        {

        for(int y=0; y<z; y++)
            {
                System.out.print("#");
            }
            System.out.println("");

        }
    }
}
