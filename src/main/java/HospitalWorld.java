import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

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
            final Pattern pattern = Pattern.compile("^[A-Za-z, ]++$");
            if (!pattern.matcher(hospital.name).matches()) {
                throw new IllegalArgumentException("Invalid String");
            }
            System.out.println("Your hospital will now be called " + hospital.name);
        // Create 3 doctor instances w/ names and specialities
            System.out.println("It's time to hire some doctors!");
            System.out.println("Let's add 3 doctors to the team. ");
            int doctor = 0;
            Doctor doctors = new Doctor();
            doctors.name = new ArrayList<>();
            while(doctor < 3) {
                System.out.println("Give your doctor a name ");
                doctors.name.add(reader.nextLine());
                if (!pattern.matcher(doctors.name.get(doctor)).matches()) {
                    throw new IllegalArgumentException("Invalid String");
                }
                System.out.println("Congrats! You added " + doctors.name.get(doctor) + " to the team!");
                doctor = doctor + 1;
            }
            int speciality = 0;
            doctors.speciality = new ArrayList<>();
            while(speciality < 3){
                System.out.println("Give your doctor a speciality ");
                doctors.speciality.add(reader.next());
                if (!pattern.matcher(doctors.speciality.get(speciality)).matches()) {
                    throw new IllegalArgumentException("You typed in an Invalid String");
                }
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
        // Display list of all specialities by doctors and let patients pick 
        // Match patients with doctors based on speciality
            System.out.println("It's time to create some patients");
            System.out.println("Let's add 5 patients to the schedule");
            Patients Patient = new Patients();
            Patient.name = new ArrayList<>();
            Patient.speciality = new ArrayList<>();
            Patient.pairList = new ArrayList<>();
            int amtOfPatients = 0;
            while(amtOfPatients < 3){
                System.out.println("Name of patient ");
                Patient.name.add(reader.next());
                if (!pattern.matcher(Patient.name.get(amtOfPatients)).matches()) {
                    throw new IllegalArgumentException("Invalid String");
                }
                System.out.println("Which speciality are you interested in? ");
                System.out.println("1: " + doctors.speciality.get(0));
                System.out.println("2: " + doctors.speciality.get(1));
                System.out.println("3: " + doctors.speciality.get(2));
                int specialityNum = reader.nextInt();
                String pairings = Patient.name.get(amtOfPatients) + " paired with " + doctors.name.get(specialityNum-1);
                Patient.pairList.add(pairings);
                System.out.println(pairings);
                amtOfPatients = amtOfPatients + 1;
            }
        // Give readout of Hospital name, Doctors, Patients, in a menu summary 
                System.out.println("We now have everything we need to start the simulation...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Welcome to " + hospital.name + " Regional Clinic!");
                System.out.println("We currently have " + doctors.name.size() + " doctors on our team");
                int docTotal = 0;
                while(docTotal < 3) {
                System.out.println("Our doctors are " + doctors.name.get(docTotal));
                docTotal = docTotal + 1;
                }
                System.out.println("We also have " + doctors.speciality.size() + " specialities in the Clinc" );
                docTotal = 0;
                while(docTotal < 3) {
                    System.out.println("Our specialities " + doctors.speciality.get(docTotal));   
                    docTotal = docTotal + 1;
                }
                System.out.println("We had " + Patient.name.size() + " Patients in our system");
                docTotal = 0;
                while(docTotal < 3) {
                    System.out.println("Our patient's name " + Patient.name.get(docTotal));
                    docTotal = docTotal + 1;
                }
                System.out.println("Today we treated a few of our patients");
                docTotal = 0;
                while(docTotal < 3){
                    System.out.println(Patient.pairList.get(docTotal));
                    docTotal = docTotal + 1;
                }

        } catch(InputMismatchException E) {
            System.out.print("Check your inputs. System is expecting different type");
        } catch (IndexOutOfBoundsException E) {
            System.out.print("Pick a number within range. You are out of bound.");
        }
    }
}