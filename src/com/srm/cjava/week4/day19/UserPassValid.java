package com.srm.cjava.week4.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPassValid {
    private static Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");

    public static boolean checkPassword(String userName) {

        Matcher mtch = pswNamePtrn.matcher(userName);
        if (mtch.matches()) {
            return true;
        }
        return false;
    }

    private static Pattern usrNamePtrn = Pattern.compile("^[a-z0-9_-]{6,14}$");

    public static boolean checkUser(String userName) {

        Matcher mtch = usrNamePtrn.matcher(userName);
        if (mtch.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String a[]) {
        System.out.println("vn589vs w: " + checkUser("vn589vs w"));
        System.out.println("klvrt034964bhj df: " + checkUser("klvrt034964bhj df"));
        System.out.println("gokuljaeger: " + checkUser("gokuljaeger"));
        System.out.println("5424 m432xli.,.x: " + checkUser("5424 m432xli.,.x"));
        System.out.println("Deku1531" + checkUser("Deku1531"));

        System.out.println("vn589vs w: " + checkPassword("vn589vs w: "));
        System.out.println("klvrt034964bhj df: " + checkPassword("klvrt034964bhj df"));
        System.out.println("Gokul0864@32g: " + checkPassword("Gokul0864@32gs"));
        System.out.println("5424 m432xli.,.x: " + checkPassword("5424 m432xli.,.x"));
    }

}