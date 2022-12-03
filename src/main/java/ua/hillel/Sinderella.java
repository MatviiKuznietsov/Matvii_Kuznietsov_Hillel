package main.java.ua.hillel;

import java.util.ArrayList;
import java.util.Random;

public class Sinderella {
    public static void main(String[] args) {
        Sinderella sinderellaMethods = new Sinderella();
        sinderellaMethods.divideList(sinderellaMethods.FillList());
    }
    ArrayList<Integer> list = new ArrayList();
    ArrayList<Integer> divide2 = new ArrayList<>();
    ArrayList<Integer> divide3 = new ArrayList<>();
    ArrayList<Integer> others = new ArrayList<>();

    public ArrayList<Integer> FillList() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10) + 1);
        }
        return list;
    }

    public void divideList(ArrayList<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0 && i % 3 == 0) {
                divide2.add(i);
                divide3.add(i);
            } else if (i % 2 == 0) {
                divide2.add(i);
            } else if (i % 3 == 0) {
                divide3.add(i);
            } else {
                others.add(i);
            }
        }
        System.out.println("Numbers which divide 2 - " + divide2);
        System.out.println("Numbers which divide 3 - " + divide3);
        System.out.println("Other numbers - " + others);
    }
}
