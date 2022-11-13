package tugasLimaReference;

public interface StudentService {
    void studentRegistration(String firstName, String lastName, String address);

    void learningPlan(String mataKuliah, int sks, String room);

    void getStudent(int index);
}