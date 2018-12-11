package com.naum.asafov;



public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();
        myList.add(8);
        myList.add(6);
        myList.add(7);
        myList.add(58);
        myList.add(9);
        myList.add(1,10);
        myList.remove(4);
        myList.set(0,25);
        for (Integer i: myList){
            System.out.println(i);
        }
        System.out.println("size " + myList.size());
    }
}
