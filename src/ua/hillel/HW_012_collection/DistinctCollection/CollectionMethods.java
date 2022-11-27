package ua.hillel.HW_012_collection.DistinctCollection;

import java.util.*;

public class CollectionMethods {
    ArrayList<Integer> list = new ArrayList();

    public ArrayList<Integer> FillList() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(50));
        }
        return list;
    }

    public void DeleteRepeatElements(List<Integer> list) {
        Set set = new LinkedHashSet(list);
        int size = list.size() - set.size();
        System.out.println("Collection with remove elements " + set);
        System.out.println("Qantity deleting numbers is - " + size);
    }

}
