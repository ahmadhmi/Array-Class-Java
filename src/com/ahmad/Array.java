package com.ahmad;

public class Array {
    private int count;
    private int[] array;


    public Array(int length){

        this.count = 0;
        array = new int[length];
    }

    public void insert(int number){
        if (array.length == count){

            int[] newArray = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newArray[i]  = array[i];
            }
            array = newArray;
        }
        array[count++] = number;
    }
    
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }
    public void removeAt(int index){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            array[i] = array[i+1];

        count--;
    }
    public int indexOf(int item){
        for (int i = 0; i < count; i++)
            if (array[i] == item)
                return i;

        return -1;
    }
}
