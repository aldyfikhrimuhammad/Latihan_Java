package tugasLima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variabel yang digunakan
        String fullName, domicile, id, courseName, room;
        int sks;

        // Membuka object Scanner
        Scanner inputUser = new Scanner(System.in);

        // Membuka object Person dan Student
        Person person01 = new Person();
        Student student01 = new Student();

        // Inisilisasi object List
        ArrayList<Student> dataStudent = new ArrayList<>();

        // Inisilisasi object Map
        HashMap<String, Integer> dataLearningSks = new HashMap<String, Integer>();
        HashMap<String, String> dataLearningRoom = new HashMap<String, String>();

        // Mengulang Menu
        boolean continueProgram = true;
        while (continueProgram) {

            // Main Menu
            System.out.println("""

                    === MAIN MENU ===\s
                    1. Input Student Data
                    2. Input Learning Plan
                    3. See All Data"""
            );

            // Mengambil input user
            System.out.print("Select Menu : ");
            int menu = inputUser.nextInt();
            inputUser.nextLine();

            switch (menu) {

                case 1 -> {

                    System.out.println(" === STUDENT DATA ===");

                    // Mengambil input user
                    System.out.print("Enter your full name  : ");
                    fullName = inputUser.nextLine();
                    student01.setFullName(fullName);
                    System.out.print("Enter your id         : ");
                    id = inputUser.nextLine();
                    student01.setId(id);
                    System.out.print("Enter your domicile   : ");
                    domicile = inputUser.nextLine();
                    student01.setDomicile(domicile);

                    // Add data
                    dataStudent.add(student01);
                }

                case 2 -> {

                    System.out.println(" === Learning Plan ===");

                    // Mengambil input user
                    System.out.print("Enter course name : ");
                    courseName = inputUser.nextLine();
                    student01.setCourseName(courseName);
                    System.out.print("Enter total sks   : ");
                    sks = inputUser.nextInt();
                    inputUser.nextLine();
                    student01.setSks(sks);
                    System.out.print("Enter room id     : ");
                    room = inputUser.nextLine();
                    student01.setRoom(room);

                    // Put data
                    dataLearningSks.put(student01.getCourseName(), student01.getSks());
                    dataLearningRoom.put(student01.getCourseName(), student01.getRoom());
                }
                case 3 -> {

                    System.out.println(" === All Data ===");

                    // Cetak data
                    for ( Student data : dataStudent ) {
                        data.printData();
                    }
                }

                default -> System.out.println("Menu yang anda pilih tidak tersedia! Silahkan pilih menu lain.");
            }

            // Bertanya kepada user untuk mengulangi menu atau tidak
            continueProgram = getYorN("Apakah anda ingin menghitung kembali? ");

        }

        // Menutup object Scanner
        inputUser.close();

    }

    // Method untuk melanjutkan program atau tidak
    public static boolean getYorN(String message) {

        // Membuka Object Scanner untuk memasukkan inputan user
        Scanner terminalInput = new Scanner(System.in);

        // Meminta user untuk mengulangi menu atau tidak
        System.out.println("\n" + message + "(Y/N)");
        String pilihanUser = terminalInput.nextLine();

        // Program apabila user memasukan input selain Y dan N
        while (!pilihanUser.equalsIgnoreCase("Y") && !pilihanUser.equalsIgnoreCase("N")) {

            System.err.println("\n Menu yang anda pilih tidak ada!\n Silahkan pilih Y atau N.");
            System.out.println("\n" + message + "(Y/N)");
            pilihanUser = terminalInput.nextLine();

        }

        // Mengembalikan nilai boolean berdasarkan pilihan user
        return (pilihanUser.equalsIgnoreCase("y"));

    }

}
