import java.util.Arrays;
import java.util.List;

public class Patients {
    public List <String> name;
    public List <String> speciality;
    public List <String> pairList;

    public String getSpeciality() {
        return Arrays.toString(speciality.toArray());
    }
}