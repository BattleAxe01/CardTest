import View.MainLoop;
import processing.core.PApplet;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");

        MainLoop ml = new MainLoop();
        PApplet.runSketch(new String[]{"CardGame"}, ml);
    }
}
