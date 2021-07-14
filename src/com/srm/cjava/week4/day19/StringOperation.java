package day19;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperation {
    public static void main(String[] args) {

        System.out.println("Split....");
        String s1 = "Goku Deku Eren Levi Naruto Natsu Thanjiro";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("\nFinding.... (SRM) \n");

        String regex = "SRM";
        Pattern pattern = Pattern.compile(regex);
        String str1 = "SRMTechnologiesPrivateLimitedChennaiTamilNaduIndia.";
        Matcher matcher = pattern.matcher(str1);
        System.out.println(matcher.find());

        System.out.println("\nGrouping.... (SRM) \n");

        String regex1 = "\\b(?<SRM>[A-Za-z\\s]+)";
        Pattern pattern1 = Pattern.compile(regex1);
        String str2 = "SRM Technologies Private Limited, Chennai, Tamil Nadu, India.";
        Matcher matcher1 = pattern1.matcher(str2);
        MatchResult result = matcher1.toMatchResult();
        System.out.println("Current Matcher: " + result);
        while (matcher1.find()) {
            System.out.println(matcher1.group("SRM"));
        }
    }
}
