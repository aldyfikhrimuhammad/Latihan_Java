package tugasLima;

public class Student extends Person implements Services {

    // Constructor
    public Student(){
    }

    // Variabel yang digunakan
    String fullName, courseName, room, id;
    int sks;

    // Method studentRegistration
    @Override
    public void studentRegistration(String fullName, String id) {
        Services.super.studentRegistration(fullName, id);
    }

    // Method learningPlan
    @Override
    public void learningPlan(String courseName, String sks, String room) {
    }

    // Getter
    public String getFullName() {
        if (getFullSks() == 144 ) {
            return fullName + " S.T";
        } else {
            return fullName;
        }

    }
    public String getId() {
        return id;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getSks() {
        return sks;
    }
    public String getRoom() {
        return room;
    }
    public int getFullSks() {
        return sks += getSks();
    }
    @Override
    public String getDomicile() {
        return super.getDomicile();
    }

    // Setter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    @Override
    public void setDomicile(String domicile) {
        super.setDomicile(domicile);
    }

    // Method menampilkan seluruh data
    public void printData() {

        System.out.println("Full Name       : " + getFullName());
        System.out.println("ID              : " + getId());
        System.out.println("Domicile        : " + getDomicile());
        System.out.println("==========");
        System.out.println("Course Name     : " + getCourseName());
        System.out.println("Room ID         : " + getRoom());
        System.out.println("SKS Amount      : " + getSks());
        System.out.println("Total SKS       : " + getFullSks());
    }
}
