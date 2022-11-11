package tugasLimaReference;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements StudentService {
    private int sks;
    private String room;
    private String mataKuliah;

    List<Object> listMataKuliah = new ArrayList<>();
    List<Object> listSks = new ArrayList<>();
    List<Object> listRoom = new ArrayList<>();
    // index-0: matakuliah, index-1: sks, index-2: room
    List<List<Object>> listSchedule = new ArrayList<>();
    // [[mat, fis, kim, bio], [3, 3, 6, 5], [A2, A3, A4, A1]]

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void getSchedule() {
        System.out.println("|\t No. \t|\t Mata Kuliah \t|\t SKS \t|\t Ruangan \t|");

        for (int i = 0; i < listSchedule.get(0).size(); i++) {
            System.out.println("|\t" + (i + 1) + "\t|\t" + listSchedule.get(0).get(i) + "\t|\t" + listSchedule.get(1).get(i)
                    + "\t|\t" + listSchedule.get(2).get(i) + "\t|");
        }
    }

    @Override
    public void studentRegistration(String firstName, String lastName, String address) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setAddress(address);

        System.out.println("Registrasi atas nama " + super.getFullname() + " berhasil didaftarkan.");
    }

    @Override
    public void learningPlan(String mataKuliah, int sks, String room) {
        setMataKuliah(mataKuliah);
        setSks(sks);
        setRoom(room);

        listMataKuliah.add(this.mataKuliah);
        listSks.add(this.sks);
        listRoom.add(this.room);

        listSchedule.add(0, listMataKuliah);
        listSchedule.add(1, listSks);
        listSchedule.add(2, listRoom);
    }

    @Override
    public String getFullname() {
        if (getTotalSks() >= 144) {
            return super.getFullname() + ", S.Kom";
        } else {
            return super.getFullname();
        }
    }

    public int getTotalSks() {
        int sum = 0;
        for (Object listSk : listSks) {
            sum += (int) listSk;
        }
        return sum;
    }

}