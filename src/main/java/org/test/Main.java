package org.test;

public class Main {
    public static void main(String[] args) {

       message("Dear user!");

        Square s = new Square(5);
        Rectangle r = new Rectangle(4,6);

        System.out.println("The Square area with side " + s.l + " cm " + "= " + s.area() + " cm");
        System.out.println("The Rectangle area with sides " + r.a + " cm and " + r.b + " cm " + "= " + r.area() + " cm");

    }

    public static void message(String somebody) {
        System.out.println(somebody + " It's some examples of primitive math tests.");
    }

}
