package week1.day2;

public class NUmber {
    private double num;

    public NUmber(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public boolean zero() {
        if (this.num == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean positive() {
        if (this.num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean negative() {
        if (this.num < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean odd() {
        if (this.num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean even() {
        if (this.num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean prime() {
        int i;
        int m = 0;
        int flag = 0;
        int n = (int) this.num;
        m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    return false;
                }
            }
            if (flag == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean armstrong() {
        int b = 0;
        int a;
        int temp;
        int n = (int) this.num;
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b + (a * a * a);
        }
        if (temp == b) {
            return true;
        } else {
            return false;
        }
    }

    public double factorial() {
        int n = (int) this.num;
        long res = 1;
        for (int k = 1; k <= n; k++){
            res *= k;
        }
        return res;
    }

    public double sqrt() {
        return (Math.sqrt(this.num));
    }

    public double sqr() {
        return (this.num * this.num);
    }

    public double sumDigit() {
        int n = (int) this.num;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public double reverse() {
        int nume = (int) this.num;
        int r = 0;
        while (nume != 0) {
            int digit = nume % 10;
            r = r * 10 + digit;
            nume /= 10;
        }
        return r;
    }

    public void binary(){
        int x = (int) this.num;
        System.out.println("\nThe Binary value is: " + Integer.toBinaryString(x));
    }

    public void factor(){
        int n = (int) this.num;
        System.out.println("\nThe factors of " + n + " are: ");
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
