package com.OOP;

import java.util.Scanner;

public class problemnumber1 {
    public static void main(String[] args) throws Exception {
        int numItems;
        int[] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        numItems = in.nextInt();
        items = new int[numItems];
        if (items.length > 0) {

            for (int i = 0; i < items.length; ++i) {
                System.out.print("Enter the value of all items (separated by space) : ");
                items[i] = in.nextInt();
            }
        }
        String  values = "" + items[0];
        for (int i = 1; i < items.length; ++i) {
            // Print the subsequent items with a leading commas
            values = values + "," + items[i];
        }

        System.out.println("The values are: [" + values + "]");
        }
    }

