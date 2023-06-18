package JavaOOP2.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private int phone;

    public Person(String name, int age, String gender, String address, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    protected void setGender(String gender) {
        this.gender = gender;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected int getPhone() {
        return phone;
    }

    protected void setPhone(int phone) {
        this.phone = phone;
    }
}
