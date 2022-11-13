package tugasLimaSolution.service;

public interface StudentService {
    String getFullname(int index);

    int getTotalSks(int index);

    void studentRegistration(String firstName, String lastName, String address);

    void learningPlan(String mataKuliah, int sks, String room, int index);

    void getSchedule(int index);

    void getStudents();

    void getStudent(int index);

}