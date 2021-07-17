package day23;

public class StaticMethod {
        static int a = 10;
        static int b = 20;
        static void initlize(int x, int y)
        {
            a = x;
            b = y;
        }
        void showData()
        {
            System.out.println("Values : "+ a + ", "+ b);
        }
        
        
        public static void main(String arg[])
        {
            System.out.println("A:" + a + " B: " + b);
            initlize(5, 6);
            StaticMethod obj = new StaticMethod();
            obj.showData();
            System.out.println();
        }
    }
