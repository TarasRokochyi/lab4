package tasks.util;

import java.util.Scanner;

public class Tasks {
    public static void task1(Scanner scan){
        System.out.println("Exchange rate of the dollar in the hryvnia?");
        float rate = scan.nextFloat();
        scan.nextLine();
        int n = 1;
        while (n < 11){
            System.out.println(n + " usd = " + (n * rate) + " grn");
            n++;
        }
    }
    public static void task2(Scanner scan) {

    }
    public static void task3(Scanner scan){

    }
    public static void task4(Scanner scan){

    }
    public static void task5(Scanner scan){

    }
    public static void task6(Scanner scan) {

    }
}
