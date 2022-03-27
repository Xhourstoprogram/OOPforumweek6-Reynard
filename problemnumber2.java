package com.OOP;

import java.util.Scanner;

public class problemnumber2 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number of item: ");
        int numItems = in.nextInt();
        int[] items = new int[numItems];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; i++) {
            items [i] = in.nextInt();
        }
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < items[i]; j++) {
                System.out.print("*");
            }
            System.out.println("(" + items[i] + ")");
        }
    }
}
