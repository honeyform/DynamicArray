package ua.skillsup.dataStructures.arrays;

/**
 * Created by Honey on 11.10.2015.
 */
public interface List {
    void add(int value);
    int get(int index);
    void remove(int index);
    int size();
    boolean isEmpty();
    boolean contains(int value);
}
