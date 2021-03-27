package Jdbc;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package xorsum;

import java.util.Scanner;

public class q {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int n = readInput.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = readInput.nextInt();
        }
        int z = readInput.nextInt();
        int number;
        for (int k = 0; k < z; k++) {
            number = readInput.nextInt();
            if (checkXOR(arr, number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

    private static boolean checkXOR(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] ^ number) == 0) {
                return true;
            }
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if ((sum ^ number) == 0 | ((arr[i] + arr[j]) ^ number) == 0) {

                    return true;
                }
                System.out.print("Sum - " + sum);
            }

        }
        return false;
    }

}
