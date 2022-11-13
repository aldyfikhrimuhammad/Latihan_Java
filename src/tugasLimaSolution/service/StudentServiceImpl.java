package tugasLimaSolution.service;

import java.util.ArrayList;
import java.util.List;

import tugasLimaSolution.model.Student;

public class StudentServiceImpl implements StudentService {
    private Student student = new Student();
    private List<Student> students = new ArrayList<>();

    @Override
    public String getFullname(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
        if (getTotalSks(index) >= 144) {
            return student.getFirstName() + " " + student.getLastName() + ", S.Kom";
        } else {
            return student.getFirstName() + " " + student.getLastName();
        }
    }

    @Override
    public int getTotalSks(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
        int total = 0;
        for (int i = 0; i < student.getSks().size(); i++) {
            total += student.getSks().get(i);
        }
        return total;
    }

    @Override
    public void studentRegistration(String firstName, String lastName, String address) {
        // TODO Auto-generated method stub
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAddress(address);

        students.add(student);

        System.out.println("Registrasi atas nama " + getFullname(students.indexOf(student)) + " berhasil didaftarkan.");
        System.out.println("===================================");

        // reset student
        student = new Student();
    }

    @Override
    public void learningPlan(String mataKuliah, int sks, String room, int index) {
        // TODO Auto-generated method stub
        student = students.get(index);

        student.setLessonName(mataKuliah);
        student.setSks(sks);
        student.setRoom(room);

        System.out.println("Data KRS berhasil ditambahkan.");
        System.out.println("===================================");
    }

    @Override
    public void getSchedule(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);

        System.out.println("|\t No. \t|\t Mata Kuliah \t|\t SKS \t|\t Ruangan \t|");

        for (int i = 0; i < student.getLessonName().size(); i++) {
            System.out.println("|\t" + (i + 1) + "\t|\t" + student.getLessonName().get(i) + "\t|\t" + student.getSks().get(i)
                    + "\t|\t" + student.getRoom().get(i) + "\t|");
        }
    }

    @Override
    public void getStudents() {
        // TODO Auto-generated method stub
        int index = 0;
        for (Student student : students) {
            System.out.println("NIM: " + index);
            System.out.println("Nama lengkap: " + getFullname(index));
            System.out.println("Alamat: " + student.getAddress() + "\n");
            index += 1;
        }
    }

    @Override
    public void getStudent(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
        System.out.println("Nama lengkap: " + getFullname(index));
        System.out.println("Alamat: " + student.getAddress() + "\n");
    }

}