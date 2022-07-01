import java.util.ArrayList;
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
            Doctor doctors = new Doctor();
            doctors.name = new ArrayList<>();
            while(doctor < 4) {
                System.out.println("Give the name of doctor " + doctor);
                doctors.name.add(reader.nextLine());
                System.out.println("Your doctor's name is " + doctors.name);
                doctor = doctor + 1;
            }
            int speciality = 1;
            doctors.speciality = new ArrayList<>();
            while(speciality < 4){
                System.out.println("Give the speciality of doctor " + speciality);
                doctors.speciality.add(reader.nextLine());
                System.out.println("Your doctor's speciality is " + doctors.speciality);
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
            Patients Patient = new Patients();
            Patient.name = new ArrayList<>();
            int amtOfPatients = 1;
            while(amtOfPatients < 3){
                System.out.println("Name of patient " + amtOfPatients);
                Patient.name.add(reader.nextLine());
                System.out.println("You patient's name is " + Patient.name);
                amtOfPatients = amtOfPatients + 1;
            }
        // Match patients with doctors based on speciality
            System.out.println("Which department does ur patient need? ");
            Patient.speciality = reader.nextLine();
            System.out.println(doctors.getSpeciality());
            // if(Patient.speciality == doctors.speciality) {
            //     System.out.println(Patient.name + "should be paired with " + doctors.name);
            // } else {
            //     System.out.println("No Match found!");
            // }

        // Give readout of Hospital name, Doctors, Patients, in a menu summary 

        }
    }
}