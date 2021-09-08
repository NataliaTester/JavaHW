package package1;

import package1.package2.BaseClass;
import package1.package2.paskage3.Child1;

public class MainClass {

    public MainClass() {
        System.out.println("I'm Natalia!");
        System.out.println("Nataliaa");
        System.out.println("Mandatory!!!");
    }


    public static void main(String[] args) {
        System.out.println("Demo!!");

        MainClass object = new MainClass();
        object.variables();
        object.dataTypes();
        object.typeCasting();
        object.strings();
        object.conditions();
        object.loops();
        object.arrays();
        object.arraysCalculateCarsMethod();
        int[] sum = {1, 2, 3, 4, 5};
      //  System.out.println(String.format("Sum2 is : %d"));


        BaseClass base = new BaseClass();
        base.setSize(2);
        System.out.println(base + " " + base.calculate () + " " + base.getSize());
        //Shild1
        Child1 child1 = new Child1();
        child1.setSize(2);
        System.out.println(child1 + " " + child1.calculate () + " " + child1.getSize());
    }

    public int sum1(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        }
        return sum;
    }

    private void arrays() {
    }

    private void variables() {
        int i = 1_000_000;
        System.out.println(i);
    }

    private void dataTypes() {
        byte b = 127;
        short s = 32_700;
        long l = 11L;
        System.out.println(s + " " + b);
    }

    private void typeCasting() {
        short s = 127;
        float f = s + 7.0007f;
        System.out.println(f);
        int a = 3 % 2;
        System.out.println(a);
        int b = 5;
        System.out.println(b++ + " " + --b);

        long l = 32_000_000_788L;
        int i = (int) l;
        System.err.println(i);
    }

    private void strings() {
        String s = "Myy string!!!!";
        System.out.println(s + " \\-/f " + s.length());
        String i = "Nata nata 'locate' nata!";
        System.out.println(s.indexOf("locate"));
        String firstName = "Natalia";
        String lastName = "Chorii";
        System.out.println(firstName + " " + lastName);
        String l = "Nata nata Chh \\ is name";
        System.out.println(l);
        System.out.println(String.format(l, 1, 2));
    }

    private void conditions() {
        boolean b = true;
        if (b) {
            System.out.println("111");
        } else if (1 == 1) {
            System.out.println("2222");
        } else {
        }

        int a = 10;
        switch (a) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println(2);
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
        }
    }

    private void loops() {
        int l = 3;
        int ifn = 1;
        ifn = 1 == 3 ? 4 : 5;
        System.out.println("kjhgc" + ifn);


        int[] cars = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            if (i == 2) break;
            sum += cars[i];
        }

        System.out.println(String.format("Sum is : %d", sum));

        sum = 0;
        for (int v : cars) {
            if (v == 3) break;
            sum += v;
        }
        System.out.println(String.format("Sum2 is : %d", sum));

        int w = 0;
        while (w < 4) {
            System.out.println(cars[w]);
            w++;
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    private void arraysMethod() {
        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(car[3] + " " + car.length);
    }

    private void arraysCalculateCarsMethod() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }


    {
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars2[0] = "Opel";
        System.out.println(cars2[0]);
    }
}
// Base Class



