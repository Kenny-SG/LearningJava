package by.vasilina.sample;

/**
 * Created by kenny on 21.03.2017.
 */
public class HelloWorldClass {

    private String fontColor;

    public HelloWorldClass(String fontColor) {
        this.fontColor = fontColor;
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




}
