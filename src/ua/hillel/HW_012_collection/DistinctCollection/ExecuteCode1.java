package ua.hillel.HW_012_collection.DistinctCollection;

import java.util.ArrayList;

public class ExecuteCode1 {
    public static void main(String[] args) {
        CollectionMethods collectionMethods = new CollectionMethods();
        ArrayList<Integer> list;
        list = collectionMethods.FillList();
        System.out.println("Filled collection " + list);
        collectionMethods.DeleteRepeatElements(list);
    }
}
