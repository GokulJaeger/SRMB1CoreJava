import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class EmploComparator {
    public static void main(String[] args) {
        
        ArrayList<Emplo> emp = new ArrayList<>();


        System.out.println("Employee List: \n");
        emp.add(new Emplo(102, "Naruto", 25, "Hokage"));
        emp.add(new Emplo(254, "Sasuke", 26, "Rouge Ninja"));
        emp.add(new Emplo(872, "Deku", 22, "Hero"));
        emp.add(new Emplo(182, "Goku", 50, "Super Saint"));
        emp.add(new Emplo(452, "Eren Jaeger", 24, "Founder Titan"));
        emp.add(new Emplo(354, "Tanjiro", 25, "Deamon Slayer"));

        for (Emplo e : emp) {
            System.out.println(e);
        }


        Collections.sort(emp,new Comparator<Emplo>(){

            @Override
            public int compare(Emplo o1, Emplo o2) {
                return o1.getAge()-o2.getAge();
            }
            
        });
        System.out.println("Sorting by Age: ");
        for (Emplo e : emp) {
            System.out.println(e);
        }

        Collections.sort(emp,new Comparator<Emplo>(){

            @Override
            public int compare(Emplo o1, Emplo o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });

        System.out.println("Sorting by Name: ");

        for (Emplo m : emp) {
            System.out.println(m);
        }
    }
}
