package TugasDua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Membuka object Scanner
        Scanner inputUser = new Scanner(System.in);

        // Membuka object Person
        Person person01 = new Person();

        // Membuka object Education
        Education education01 = new Education();

        // Variabel yang diperlukan
        String firstName, lastName, domicile, yearOfBirth;
        String primarySchool, juniorHighSchool, seniorHighSchool, college;

        // Mengulang Menu
        boolean continueProgram = true;
        while (continueProgram){

            // Main Menu
            System.out.println("""

                            === MAIN MENU ===\s
                            1. Input Data Person
                            2. Input Data Education
                            3. See Data Student
                            4. See Data Education"""
                    );

            // Mengambil input user
            System.out.print("Select Menu : ");
            int menu = inputUser.nextInt();
            inputUser.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.println("=== Input Data Person ===");

                    // Mengambil input user
                    System.out.print("Enter your first name\t\t: ");
                    firstName = inputUser.nextLine();
                    person01.setFirstname(firstName);
                    System.out.print("Enter your last name\t\t: ");
                    lastName = inputUser.nextLine();
                    person01.setLastName(lastName);
                    System.out.print("Enter your domicile\t\t\t: ");
                    domicile = inputUser.nextLine();
                    person01.setDomicile(domicile);
                    System.out.print("Enter your year of birth\t: ");
                    yearOfBirth = inputUser.nextLine();
                    person01.setYearOfBirth(Integer.parseInt(yearOfBirth));
                    System.out.println("Data added successfully!");
                }
                case 2 -> {
                    System.out.println("=== Input Data Education ===");

                    // Mengambil input user
                    System.out.print("Primary School\t\t: ");
                    primarySchool = inputUser.nextLine();
                    education01.setPrimarySchool(primarySchool);
                    System.out.print("Junior High School\t: ");
                    juniorHighSchool = inputUser.nextLine();
                    education01.setJuniorHighSchool(juniorHighSchool);
                    System.out.print("Senior High School\t: ");
                    seniorHighSchool = inputUser.nextLine();
                    education01.setSeniorHighSchool(seniorHighSchool);
                    System.out.print("College\t\t\t\t: ");
                    college = inputUser.nextLine();
                    education01.setCollege(college);
                    System.out.println("Data added successfully!");
                }
                case 3 ->

                    // Memanggil method untuk mencetak data
                        person01.printDataPerson();
                case 4 ->

                    // Memanggil method untuk mencetak data
                        education01.printDataEducation();
                default -> System.out.println("The menu you entered is not available. Please choose another menu!");
            }

            // Bertanya kepada user untuk mengulangi menu atau tidak
             continueProgram = getYorN("Do you want to continue the program? ");

        }
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

            System.err.println("\n Pilihan tidak ada!\n Silahkan pilih Y atau N.");
            System.out.println("\n" + message + "(Y/N)");
            pilihanUser = terminalInput.nextLine();

        }

        // Mengembalikan nilai boolean berdasarkan pilihan user
        return (pilihanUser.equalsIgnoreCase("y"));

    }

}
