package com.naum.asafov;


public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();
        myList.add(8);
        myList.add(6);
        myList.add(7);
        myList.remove(1);
        myList.set(0,25);
        for (Integer i: myList){
            System.out.println(i);
        }

        System.out.println("size " + myList.size());
        System.out.println("After comparato");
        myList.sort((o1, o2) -> o1-o2);
        for (Integer i: myList){
            System.out.println(i);
        }
    }
}
