package JavaOOP2.company;

import JavaOOP2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Tran Thi B", 18, "Nu", "125 ACGRE", 999999);
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getGender());

    }
}
