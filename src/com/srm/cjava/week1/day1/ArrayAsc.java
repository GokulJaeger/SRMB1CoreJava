package com.srm.cjava.week1.day1;

public class ArrayAsc {
    public static void main(String[] args) {
        int[] num = {123,5643,689,54,679,8,25,80,3,42,47,0,38,83,3,85,2,7,90};
        System.out.println(num);
        System.out.println("Asscending order!");
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i]<num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int a: num){
            System.out.println(a);
        }
    }
}
