package week2.day8;

public class CustomList {
  
    int val;
    CustomList next;
  
    CustomList() {}
    CustomList(int val) { this.val = val; }
  
    CustomList(int val, CustomList next)
    {
        this.val = val;
        this.next = next;
    }
}
