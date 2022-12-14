package ua.hillel.HW_012_collection.BuyGoods;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodQuantity {
    public static void main(String[] args) {
        GoodQuantity collectionMtethods = new GoodQuantity();
        collectionMtethods.fillGoods();
        collectionMtethods.summQuntityGoods();
    }
    Map<String, Integer> goods = new HashMap<>();

    public void fillGoods() {
        String answer = "Y";
        while (answer.equals("Y")) {
            System.out.println("Input name of goods");
            String name = new Scanner(System.in).next();
            System.out.println("Input quantity of goods");
            int key = new Scanner(System.in).nextInt();
            this.goods.put(name, key);
            System.out.println("Would you like to add something else Y/N");
            answer = new Scanner(System.in).next();
        }
    }

    public void summQuntityGoods() {
        int summ =0;
        for (int i : goods.values()) {
            summ=summ+i;
        }
        System.out.println("Quantity of goods = " + summ);
    }
}
