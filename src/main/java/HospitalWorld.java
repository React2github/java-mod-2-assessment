import java.util.Scanner;

public class HospitalWorld {
    public static void main(String[] args) {
        
        // Get name of hospital from user 
        System.out.println("Welcome, you are the new CEO of a major hospital. ");
        System.out.println("Start by naming the new hospital ");
        try (Scanner reader = new Scanner(System.in)) {
            Hospital hospital = new Hospital();
            hospital.name = reader.nextLine();
            System.out.println("Name of the hospital is " + hospital.name);
        // Create 3 doctor instances w/ names and specialities
            System.out.println("It's time to hire some doctors!");
            int doctor = 1;
            while(doctor < 4) {
                System.out.println("Give the name of doctor " + doctor);
                Doctor doctors = new Doctor();
                doctors.name = reader.nextLine();
                System.out.println("Your doctor's name is " + doctors.name);
                doctor = doctor + 1;
            }
            int speciality = 1;
            while(speciality < 4){
                System.out.println("Give the speciality of doctor " + speciality);
                Doctor doctors = new Doctor();
                doctors.speciality = reader.nextLine();
                System.out.println("Your doctor's speciality is " + doctors.speciality);
                speciality = speciality + 1;
            }
            System.out.println("We have enough doctors now!");
        // Check Doctor is Registered 
            System.out.println("Let's register the doctors");
            Doctor doctors = new Doctor();
            if(doctors.isRegistered == true) {
                System.out.println("Your doctor is in the system!");
            } else {
                System.out.println("We couldn't find your doctor in our system");
            }
        // Create 5 patients for the hospital 
            System.out.println("It's time to create some patients");
            Patients Patient = new Patients();
            int amtOfPatients = 1;
            while(amtOfPatients < 6){
                System.out.println("Name of patient " + amtOfPatients);
                Patient.name = reader.nextLine();
                System.out.println("You patient's name is " + Patient.name);
                amtOfPatients = amtOfPatients + 1;
            }
        // Match patients with doctors
            // if(doctors.amtOfPatients < 3) {

            // }

        // Give readout of Hospital name, Doctors, Patients, in a menu summary 

        }
    }
}