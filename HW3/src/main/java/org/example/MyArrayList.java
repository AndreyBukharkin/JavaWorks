package org.example;

class MyArrayList<T> {

    private Object[] array;
    private int arraySize = 0;

    public MyArrayList() {
        this.array = new Object[16];
    }

    public void add(T addElement){
        if (arraySize %16 == 0){
            Object[] changedArray = new Object[array.length + 16];
            System.arraycopy(array, 0, changedArray, 0, array.length);
            array = changedArray;
        }
        array[arraySize] = addElement;
        arraySize++;
    }

    public void remove(int numb){
        for (int i = numb; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        arraySize--;
    }

    public T get(int numb){
            return (T) array[numb];
    }

    public int size(){
        return arraySize;
    }
}