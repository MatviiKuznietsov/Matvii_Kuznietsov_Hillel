package ua.hillel.HW_012_collection.DistinctCollection;

import java.util.*;

public class DistinctCollection {
    public static void main(String[] args) {
        DistinctCollection collectionMethods = new DistinctCollection();
        collectionMethods.DeleteRepeatElements(collectionMethods.FillList());
    }
    ArrayList<Integer> list = new ArrayList();

    public ArrayList<Integer> FillList() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println("Filled collection " + list);
        return list;
    }

    public void DeleteRepeatElements(List<Integer> list) {
        Set set = new LinkedHashSet(list);
        int size = list.size() - set.size();
        System.out.println("Collection with remove elements " + set);
        System.out.println("Qantity deleting numbers is - " + size);
    }

}
