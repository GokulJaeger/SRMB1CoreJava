package week2.day12;
import java.util.Properties;
import java.util.Set;

public class SysProp {
    public static void main(String[] args) throws Exception {

        Properties prop = System.getProperties();
        Set set = prop.entrySet();
        System.out.println("System Properties=======================================================> ");
        prop.keySet().stream()
            .map(key -> "Key===>  " + key + "\tProp===>  " + prop.getProperty(key.toString()))
            .forEach(System.out::println);
    }
}
