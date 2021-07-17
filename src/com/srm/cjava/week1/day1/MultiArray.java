package week1.day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiArray {
    private static final Logger logg = Logger.getLogger(MultiArray.class.getName());
    
    public static void main(String[] args) {
        int[] arr1 = {12,34,6,3,7,95,35,24,78,313,692,62,72,3162,9134,2,4,9,12,566,7876};
        logg.log(Level.SEVERE, "The size of Array arr1 = {0}", arr1.length);

        int[] arr2 = {1324,67,5690,94,1,25667,71,678,905,3,98,2,4};

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        

    }
}
