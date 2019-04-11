package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        printSquareStar(8);
    }

    static public void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }


        for (int i = 0; i < number; i++) {
            //row
            System.out.println();

            for (int j = 0; j < number; j++) {
                //column

                if ((i == 0) || (i == number - 1)) {
                    System.out.print('*');
                } else if ((j == 0) || (j == number - 1)) {
                    System.out.print('*');
                } else if (j == i) {
                    System.out.print('*');
                } else if (j == (number - (i + 1))) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }

            }

        }
    }
}
