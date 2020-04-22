package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a first word: ");
        String firstWord = scanner.nextLine().toLowerCase();
        System.out.println("Write a second word: ");
        String secondWord = scanner.nextLine().toLowerCase();

        System.out.println(isAnagram(firstWord, secondWord));

    }

    private static boolean isAnagram(String first, String second){

        char firstArray[] = first.toCharArray();
        char secondArray[] = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        boolean result = false;

        if (first.length() != second.length()){
            result = false;
        } else if (new String(firstArray).equals(new String(secondArray))){
            result = true;
        }

        return result;
    }
}
