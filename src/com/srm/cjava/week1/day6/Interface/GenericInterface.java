package com.srm.cjava.week1.day6.Interface;

class GenericInterface {
    public static void main(String[] args) {
        Integer arr[] = { 3, 6, 2, 8, 6 };
        FunctionalClass<Integer> obj1 = new FunctionalClass<Integer>(arr);
        System.out.println("Minimum value: " + obj1.min());
        System.out.println("Maximum value: " + obj1.max());
    }
}
