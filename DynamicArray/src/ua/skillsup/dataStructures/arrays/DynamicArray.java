package ua.skillsup.dataStructures.arrays;

import java.util.Arrays;

/**
 * Created by Honey on 11.10.2015.
 */
public class DynamicArray implements List {
    int[] array = null;

    @Override
    public void add(int value) {
        if (isEmpty()) {
            int[] temp = new int[1];
            temp[0] = value;
            array = temp;
        } else {
            int[] temp = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            temp[array.length] = value;
            array = temp;
        }
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Incorrect index " + index);
            return Integer.parseInt(null);
        } else if (isEmpty()) {
            System.out.println("Array is empty");
            return Integer.parseInt(null);
        }
        return array[index];
    }

    @Override
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Array is empty");
        } else if (index < 0 || index >= array.length) {
            System.out.println("Incorrect index " + index);
        } else if (array.length == 1) {
            array = null;
        } else {
            int[] temp = new int[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                if (i < index) {
                    temp[i] = array[i];
                } else if (i > index) {
                    temp[i - 1] = array[i];
                }
            }
            array = temp;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array == null;
    }

    @Override
    public boolean contains(int value) {
       if (isEmpty()){
           return false;
       }
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
