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
        int n = 0;
        while (true){
            System.out.println("enter the number n: ");
            n = Integer.parseInt(scan.nextLine());
            if (n == 0) {
                System.out.println("n must not be equal to 0");
                continue;
            }
            break;
        }
        float sum = 0;
        float i = 1;
        while (i <= Math.abs(n)){
            sum += 1/i;
            i++;
        }
        if (n > 0){
            System.out.println("sum is " + sum);
        }
        else {
            System.out.println("sum is " + (-sum));
        }
    }
    public static void task3(Scanner scan){
        System.out.println("enter the number n: ");
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int i = 0;
        System.out.println("enter your numbers: ");
        while (i < n){
            sum += Integer.parseInt(scan.nextLine());
            i++;
        }
        System.out.println("your sum is "+ sum);
    }
    public static void task4(Scanner scan){
        int n = 0;
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        System.out.println("enter your numbers(last number should be 0): ");
        while(true){
            n = Integer.parseInt(scan.nextLine());
            if (n == 0){
                break;
            }
            if (small > n){
                small = n;
            }
            if (big < n){
                big = n;
            }
        }
        System.out.println("Difference between min value and max value is " + (big - small));
    }
    public static void task5(Scanner scan){
        System.out.println("enter number n: ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("enter your numbers: ");
        float number = scan.nextFloat();
        scan.nextLine();
        float avg = 0;
        if (number > n){
            return;
        }
        do{
            System.out.println(number);
            if (number > 0){
                avg += number / 2;
            }
            number = Integer.parseInt(scan.nextLine());
        }while(number < n);
        System.out.println("average of positive numbers is " + avg);
    }
    public static void task6(Scanner scan) {

    }
}
