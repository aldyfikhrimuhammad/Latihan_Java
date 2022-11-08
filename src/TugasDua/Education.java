package TugasDua;

public class Education extends Person {

    // Variabel yang digunakan
    private String primarySchool, juniorHighSchool, seniorHighSchool, college;

    // Setter
    public void setPrimarySchool(String primarySchool) {
        this.primarySchool = primarySchool;
    }
    public void setJuniorHighSchool(String juniorHighSchool) {
        this.juniorHighSchool = juniorHighSchool;
    }
    public void setSeniorHighSchool(String seniorHighSchool) {
        this.seniorHighSchool = seniorHighSchool;
    }
    public void setCollege(String college) {
        this.college = college;
    }

    //Method untuk mencetak data
    public void printDataEducation() {
        System.out.println("=== Data Education ===");
        System.out.println("Primary School\t\t: " + this.primarySchool);
        System.out.println("Junior High School\t: " + this.juniorHighSchool);
        System.out.println("Senior High School\t: " + this.seniorHighSchool);
        System.out.println("College\t\t\t\t: " + this.college);
    }

}
