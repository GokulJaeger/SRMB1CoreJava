package day23;

class StoreImp {

    static <T> void showData(T[] tarray) {
 
        for (T v : tarray) {
 
            System.out.print("["+v+"] ");
    }
    System.out.println();
   }
}