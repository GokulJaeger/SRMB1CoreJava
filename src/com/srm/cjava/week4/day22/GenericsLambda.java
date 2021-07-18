package day22;

interface MyGeneric<T> {
    T compute(T t);
}

public class GenericsLambda {
    public static void main(String args[]) {
        MyGeneric<String> reverse = (str) -> { 
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        MyGeneric<Integer> factorial = (Integer n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println(reverse.compute("Lambda Generic Functional Interface"));
        System.out.println(factorial.compute(7));
    }
}
