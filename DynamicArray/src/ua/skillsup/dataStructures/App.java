package ua.skillsup.dataStructures;

import ua.skillsup.dataStructures.arrays.DynamicArray;

/**
 * Created by Honey on 11.10.2015.
 */
public class App {
    public static void main(String[] args) {
        DynamicArray dynamicList = new DynamicArray();
        dynamicList.add(1);
        dynamicList.add(2);
        dynamicList.add(3);
        dynamicList.add(4);
        dynamicList.add(5);

        System.out.println(dynamicList.toString());

        System.out.println(dynamicList.get(1));
        System.out.println(dynamicList.get(4));

        dynamicList.remove(5);
        dynamicList.remove(2);
        System.out.println(dynamicList.toString());

        System.out.println(dynamicList.size());

        System.out.println(dynamicList.contains(6));
        System.out.println(dynamicList.contains(4));
    }
}
