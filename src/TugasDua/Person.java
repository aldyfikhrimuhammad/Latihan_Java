package TugasDua;

import java.util.Date;

public class Person {

    // Variabel yang digunakan
    private String firstname, lastName, domicile;
    private int yearOfBirth;

    // Setter
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    //Method untuk mencetak data
    public void printDataPerson() {
        Date d = new Date();
        int year = d.getYear();
        int currentYear = year + 1900;
        System.out.println("=== Data Student ===");
        System.out.println("Fullname\t\t: " + this.firstname + " " + this.lastName);
        System.out.println("Domicile\t\t: " + this.domicile);
        System.out.println("Age\t\t\t\t: " + (currentYear - this.yearOfBirth) + " years old");
    }

}
