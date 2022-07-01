import java.util.Arrays;
import java.util.List;

public class Doctor {
    public List <String> name;
    public List <String> speciality;
    public int amtOfPatients;
    
    public String getSpeciality() {
        return Arrays.toString(speciality.toArray());
    }

    public boolean isRegistered(){
        return true;
    }
  
}