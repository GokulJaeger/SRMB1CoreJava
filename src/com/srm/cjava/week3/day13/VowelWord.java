package week3.day13;

public class VowelWord {
    public static void main(String[] args) {

        String word = "All Might: Go Beyond Plus Ultra";
        System.out.println(word);

        System.out.println("No of Words: " + wcount(word));
        System.out.println("No of Vowels: " + vcount(word));

    }

    public static int wcount(String string) {
        int count = 0;

        char ch[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    public static int vcount(String str2){

        int cnt = 0;

        for (int i=0 ; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
               cnt ++;
            }
         }
        return cnt;
    }
}
