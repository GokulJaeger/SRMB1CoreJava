package week1.day1;

public class CountPalindrome {
    public static void main(String[] args){
        String s = "abcbaaabbaa";
        printPalindromes(s);
    }

    public static void printPalindromes(String s) {
        if (s == null || s.length() < 3)
            return;

        System.out.println("Number of Palindromes:");
        for (int i=1; i<s.length()-1; i++) {
            for (int j=i-1,k=i+1; j>=0 && k<s.length(); j--,k++) {
                if (s.charAt(j) == s.charAt(k)) {
                    if (k-j+1 >= 3)
                        System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
                }
                else
                    break;
            }
        }
        // System.out.println("Number of Pali:");
        // for (int i=1; i<s.length()-1; i++) {
        //     for (int j=i,k=i+1; j>=0 && k<s.length(); j--,k++) {
        //         if (s.charAt(j) == s.charAt(k)) {
        //             if (k-j+1 >= 3)
        //                 System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
        //         }
        //         else
        //             break;
        //     }
        // }
    }
}
