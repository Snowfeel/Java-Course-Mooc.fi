
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public int hashCode(){
        return  (this.country+this.liNumber).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }

        if (obj.getClass() != this.getClass()){
            return false;
        }
        LicensePlate match = (LicensePlate) obj;

        if (this.country.equals(match.country) && this.liNumber.equals(match.liNumber)){
            return true;
        }

        return false;
    }
}
