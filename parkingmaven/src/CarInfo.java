import java.sql.Timestamp;
public class CarInfo {
    private String carroNombre;
    private Timestamp timestamp;
    public CarInfo(String carroNombre){
        this.carroNombre = carroNombre;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else{
            CarInfo other = (CarInfo) obj;
            if(this.carroNombre.equals(other.carroNombre) && this.timestamp.equals(other.timestamp)){
                return true;
            }else{
                return false;
            }
        }
    }
    public String getcarroNombre() {
        return carroNombre;
    }
    public void setcarroNombre(String carroNombre) {
        this.carroNombre = carroNombre;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    @Override
//toString method
    public String toString() {
        return "CarInfo [carroNombre=" + carroNombre + ", timestamp=" + timestamp + "]";
    }
}
