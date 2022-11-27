package ua.hillel.HW_012_collection.Cinderella;

import java.util.ArrayList;

public class HelpSinderella {
    public static void main(String[] args) {
        SinderellaMethods sinderellaMethods = new SinderellaMethods();
        ArrayList<Integer> list = sinderellaMethods.FillList();
        System.out.println("Filled list " + list);
        sinderellaMethods.divideList(list);
    }
}
