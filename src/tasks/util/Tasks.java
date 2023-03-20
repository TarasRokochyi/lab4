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

    }
    public static void task4(Scanner scan){

    }
    public static void task5(Scanner scan){

    }
    public static void task6(Scanner scan) {

    }
}
