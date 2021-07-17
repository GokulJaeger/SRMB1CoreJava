package week1.day4.b;
import week1.day4.a.ClassA;


class ClassB {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("Example of package that import another package");
        ClassA obj= new ClassA(); 
        obj.display();
    }
} 
