package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        int count = 1;

        while (count != 6) {
            System.out.println("Count " + count);
            count++;
        }

        count = 1;

        do {
            System.out.println("Count " +  count);
            count++;
        } while (count <= 10);

//
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count " + count);
//            count++;
//        }
        System.out.println("-----------------------------------");

        int number = 22;
        count = 1;
        int evens = 0;

        while (count <= number && evens != 5) {
            if (isEvenNumber(count)) {
                System.out.println(count + " is even.");
                evens++;
            }

            count++;
        }

        System.out.println(evens + " even numbers found.");
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }

        return false;
    }
}
