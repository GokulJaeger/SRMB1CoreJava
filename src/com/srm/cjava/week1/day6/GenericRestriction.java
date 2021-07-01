package com.srm.cjava.week1.day6;

class RestrictClass<T extends Number> {
    T ob;
    T vals[];
  
    RestrictClass(T o, T[] nums) {
      this.ob = o;
      this.vals = nums;
    }
    void disp(){
        System.out.println(this.ob + " : " +this.vals );
    }
  }
  
  public class GenericRestriction {
    public static void main(String args[]) {
      Integer n[] = { 1 };
      RestrictClass<Integer> iOb = new RestrictClass<Integer>(50, n);
        iOb.disp();
      RestrictClass<?> gens[] = new RestrictClass<?>[10];
      System.out.println(gens);
    }
  }


