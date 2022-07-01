import java.util.ArrayList;
import java.util.Scanner;

public class HospitalWorld {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Get name of hospital from user 
        System.out.println("Welcome, you are the new CEO of a major hospital. ");
        System.out.println("Start by naming the new hospital ");
        try (Scanner reader = new Scanner(System.in)) {
            Hospital hospital = new Hospital();
            hospital.name = reader.nextLine();
            System.out.println("Welcome to " + hospital.name + " Regional Clinc");
        // Create 3 doctor instances w/ names and specialities
            System.out.println("It's time to hire some doctors!");
            System.out.println("Let's add 3 doctors to the team. ");
            int doctor = 0;
            Doctor doctors = new Doctor();
            doctors.name = new ArrayList<>();
            while(doctor < 3) {
                System.out.println("Give your doctor a name ");
                doctors.name.add(reader.nextLine());
                System.out.println("Congrats! You added " + doctors.name.get(doctor) + " to the team!");
                doctor = doctor + 1;
            }
            int speciality = 0;
            doctors.speciality = new ArrayList<>();
            while(speciality < 3){
                System.out.println("Give the speciality of doctor ");
                doctors.speciality.add(reader.nextLine());
                System.out.println(doctors.name.get(speciality) + " speciality is " + doctors.speciality.get(speciality) + "!");
                speciality = speciality + 1;
            }
            System.out.println(doctors.getSpeciality());
            System.out.println("We have enough doctors now!");
        // Check Doctor is Registered 
            System.out.println("Let's register the doctors");
            if(doctors.isRegistered() == true) {
                System.out.println("Your doctor is in the system!");
            } else {
                System.out.println("We couldn't find your doctor in our system");
            }
        // Create 5 patients for the hospital 
            System.out.println("It's time to create some patients");
            System.out.println("Let's add 5 patients to the schedule");
            Patients Patient = new Patients();
            Patient.name = new ArrayList<>();
            Patient.speciality = new ArrayList<>();
            int amtOfPatients = 0;
            while(amtOfPatients <= 5){
                System.out.println("Name of patient ");
                Patient.name.add(reader.next());
                System.out.println("Which speciality are you interested in? ");
                System.out.println("1:" + doctors.speciality.get(0));
                System.out.println("2:" + doctors.speciality.get(1));
                System.out.println("3:" + doctors.speciality.get(2));
                int specialityNum = reader.nextInt();
                System.out.println(Patient.name.get(amtOfPatients) + " has been paired with " + doctors.name.get(specialityNum-1));
                amtOfPatients = amtOfPatients + 1;
            }
        // Display list of all specialities by doctors and let patients pick 

        // Match patients with doctors based on speciality

        // Give readout of Hospital name, Doctors, Patients, in a menu summary 

        }
    }
}