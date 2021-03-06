package week2.day10;

public class PhoneDirectory {
    private String name;
    private long phone;
    public PhoneDirectory(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "PhoneDirectory [Name=" + name + ", Phone=" + phone + "]";
    }

    
}
