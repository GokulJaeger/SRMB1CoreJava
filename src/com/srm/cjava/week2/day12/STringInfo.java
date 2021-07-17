package week2.day12;

public class STringInfo {
    public static void main(String[] args) {
        

        String str = "GOKUL";

        System.out.println(str);

        String str2 = str.toLowerCase();

        System.out.println(str2);

        int a=2;
        int j=3;
        
        int x = addInt(a,j);
        System.out.println(x);

        Bingo b1 = new Bingo();

        b1.SumBingo();
    }

    public static int addInt(int x, int y){
        return x+y;

    }
}
