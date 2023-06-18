package JavaOOP2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Nguyen Thi A");
        person.setAge(20);
        person.setGender("Nu");
        person.setAddress("125 nguyen trai");
        person.setPhone(8258775);

        System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getAddress() + ", " + person.getGender() + ", " + person.getPhone());
    }
}
