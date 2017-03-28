package by.vasilina.sample;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by kenny on 21.03.2017.
 */
public class HelloWorldClass {

    private String fontColor;

    public HelloWorldClass(String fontColor) {
        this.fontColor = fontColor;
    }

    public void readInt() {
        System.out.println("Please input number:");
        Scanner in = new Scanner(System.in);
        int num = 0;
        try {
            num = in.nextInt();
            System.out.println("You have input " + num);
        } catch (InputMismatchException e) {
            // e.printStackTrace();
            System.out.printf("that's not %d number\r\n", 12);
        }
    }

    public void readIntBase() {
        System.out.println("Please input number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("You have input " + num);
    }

    public void printGreetings(String name) {
        if (fontColor != null || fontColor.isEmpty()) {
            System.out.println("now " + fontColor + " color");
        }
        System.out.println("Hello, " + name);
        System.out.println("--------------");
    }

    public static void printGreetingsStatic() {
        System.out.println("Hello world Static");
        System.out.println("--------------");
    }

    // Task 2.1
    public void task2dot1() {
        System.out.println(" **    **   *   *");
        System.out.println("*  *  *  *  ** **");
        System.out.println("*     *     * * *");
        System.out.println("*      *    *   *");
        System.out.println("* **    *   *   *");
        System.out.println("*  *     *  *   *");
        System.out.println("*  *  *  *  *   *");
        System.out.println(" **    **   *   *");
    }

    // Task 2.2
    public static void task2dot2() {
        Random rand = new Random();
        int i = (rand.nextInt(6) + 1);
        int j = (rand.nextInt(6) + 1);
        System.out.println("First dice has " + i);
        System.out.println("Second dice has " + j);
        System.out.println("Sum of dices = " + (i + j));
        if (i == j) {
            System.out.println("Congrads!! Dices has the same value!! And number is " + i);
        }
    }

    //Task 2.3
    public static void task2dot3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello! Please, enter your name: ");
        String name1 = in.nextLine();
        System.out.println();
        String name2 = name1.toUpperCase();
        System.out.println("Hello " + name2 + "!! I'm very glad to see you again!!");
    }

    //Task 2.4
    public static void task2dot4() {
        Scanner in = new Scanner(System.in);
        System.out.print("How coins '1 cent' do you have? ");
        int k1 = in.nextInt();
        System.out.print("How coins '2 cent' do you have? ");
        int k2 = in.nextInt();
        System.out.print("How coins '5 cent' do you have? ");
        int k3 = in.nextInt();
        System.out.print("How coins '10 cent' do you have? ");
        int k4 = in.nextInt();
        System.out.print("How coins '20 cent' do you have? ");
        int k5 = in.nextInt();
        System.out.print("How coins '50 cent' do you have? ");
        int k6 = in.nextInt();
        System.out.print("How coins '1 rouble' do you have? ");
        int r1 = in.nextInt();
        System.out.print("How coins '2 rouble' do you have? ");
        int r2 = in.nextInt();
        System.out.print("How '5 roubles' banknotes do you have? ");
        int b1 = in.nextInt();
        System.out.print("How '10 roubles' banknotes do you have? ");
        int b2 = in.nextInt();
        System.out.print("How '20 roubles' banknotes do you have? ");
        int b3 = in.nextInt();
        System.out.print("How '50 roubles' banknotes do you have? ");
        int b4 = in.nextInt();
        System.out.print("How '100 roubles' banknotes do you have? ");
        int b5 = in.nextInt();
        if (b4 > 0 || b5 > 0) {
            System.out.println("RICH BITCH!!! =)");
        }
        float sum = (k1 + 2 * k2 + 5 * k3 + 10 * k4 + 20 * k5 + 50 * k6);
        sum = (sum/100) + (r1 + 2 * r2 + 5 * b1 + 10 * b2 + 20 * b3 + 50 * b4 + 100 * b5);
        if (sum < 1) {
            System.out.println("You are NISCHEBROD today!! Congrads))");
        }
        System.out.println("You have "+sum+" roubles for today.");
        System.out.print("What is exchange course for $1 today? ");
        float ex = in.nextFloat();
        System.out.println();
        System.out.println("You can change your money to " + (sum / ex) + " dollars.");
    }

    public static void task2dot5(){
        System.out.print("How many apples do you have? ");
        Scanner in = new Scanner(System.in);
        int appl = in.nextInt();
        if (appl>999){
            System.out.println("It's too many for me =( The range should be between 0 and 999");
            } else {
                if (appl<1){
                    System.out.println("You have no apples. So sad =(");
                }
                else {
                    System.out.println("You have "+(appl/100)+" hundred, "+(appl/10%10)+" dozens and "+appl%100%10+" apples");
                }
            }
    }


}