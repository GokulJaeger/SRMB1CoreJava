package day23;

public class GenericsMethd {

    static <T> void callShowData(Store<T> daobj, T[] tarray) {

        daobj.myStore(tarray);
    }

    public static void main(String[] args) {

        Integer[] ivals = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        String[] svals = { "Ten", "Twenty", "Thirty", "Forty", "Fifty" };

        callShowData(StoreImp::<Integer>showData, ivals);
        callShowData(StoreImp::showData, ivals);

        callShowData(StoreImp::<String>showData, svals);
        callShowData(StoreImp::showData, svals);
    }
}