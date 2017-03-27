package by.vasilina.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

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

    public static void task2dot(){
        System.out.println(" **    **   *   *");
        System.out.println("*  *  *  *  ** **");
        System.out.println("*     *     * * *");
        System.out.println("*      *    *   *");
        System.out.println("* **    *   *   *");
        System.out.println("*  *     *  *   *");
        System.out.println("*  *  *  *  *   *");
        System.out.println(" **    **   *   *");
    }


}
