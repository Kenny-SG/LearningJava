package by.vasilina.sample;

/**
 * Created by kenny on 21.03.2017.
 */
public class Runner {
    public static void main(String[] args) {
        HelloWorldClass helloWorldClass = new HelloWorldClass("blue");
        helloWorldClass.printGreetings("Sergey");
        HelloWorldClass.printGreetingsStatic();
    }
}
