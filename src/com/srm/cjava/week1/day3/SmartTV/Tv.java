package week1.day3.SmartTV;

class Tv{
    public static void main(String[] args) {
        TvImp ti = new TvImp();
        ti.on();
        ti.Youtube(true);
        ti.Netflix(false);
        ti.Youtube(false);
        ti.off();
    }
    
}
