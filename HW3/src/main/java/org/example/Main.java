package org.example;


public class Main {

    public static void main(String[] args) {
        String[] strings = new String[]{"one", "two", "three", "four", "five"};
        Integer[] ints = new Integer[]{1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        MyArrayList<String> myArrayListStrings = new MyArrayList<String>();
        MyArrayList<Integer> myArrayListIntegers = new MyArrayList<Integer>();
        for (int i = 0; i < strings.length; i++) {
            myArrayListStrings.add(strings[i]);

        }
        for (int i = 0; i < ints.length; i++) {
            myArrayListIntegers.add(ints[i]);
        }
        myArrayListStrings.remove(2);
        myArrayListIntegers.remove(6);
        int b = myArrayListIntegers.get(6);
    }
}