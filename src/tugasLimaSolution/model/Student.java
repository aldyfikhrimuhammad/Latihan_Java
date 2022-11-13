package tugasLimaSolution.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Integer> sks = new ArrayList<>();
    private List<String> room = new ArrayList<>();
    private List<String> lessonName = new ArrayList<>();

    public Student() {
    }

    public Student(List<Integer> sks, List<String> room, List<String> lessonName) {
        this.sks = sks;
        this.room = room;
        this.lessonName = lessonName;
    }

    public Student(String firstName, String lastName, String address,
                   List<Integer> sks,
                   List<String> room, List<String> lessonName) {
        super(firstName, lastName, address);
        this.sks = sks;
        this.room = room;
        this.lessonName = lessonName;
    }

    public List<Integer> getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks.add(sks);
    }

    public List<String> getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room.add(room);
    }

    public List<String> getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName.add(lessonName);
    }

}