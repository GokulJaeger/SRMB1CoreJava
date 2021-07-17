package Assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studList = new ArrayList<>();


        studList.add(new Student(8, "Goku"));
        studList.add(new Student(14, "ChiChi"));
        studList.add(new Student(20, "Vegeta"));
        studList.add(new Student(21, "Bolma"));
        studList.add(new Student(10, "Gohan"));
        studList.add(new Student(5, "Trunks"));

        

        for (Student s1 : studList) {
            System.out.println(s1);
        }
        System.out.println("\nEnter the student is to remove from list:");
        int nid = sc.nextInt();

        Iterator<Student> itr = studList.iterator();

        while(itr.hasNext()){
            Student ss= (Student) itr.next();
            if(ss.getSid()==nid){
                itr.remove();
            }
        }

        System.out.println("After Romoving.....");
        for (Student s1 : studList) {
            System.out.println(s1);
        }


        sc.close();

    }
}
