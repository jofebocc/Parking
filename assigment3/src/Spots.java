import java.util.LinkedList;
public class Spots {
        private LinkedList<CarInfo> cars = null;
        private int numero = 0;
        private int capp = 0;

        public Spots(int capp) {
            this.capp = capp;
            this.cars = new LinkedList<CarInfo>();
            this.numero = 0;
        }

        public LinkedList<CarInfo> getCars() {
            return cars;
        }

        public int getnumero() {
            return numero;
        }

        public int getcapp() {
            return capp;
        }

        public void parkACar(String carroNombre) {
            if (this.numero == this.capp) {
                System.out.println("Parking Lot full");
            } else {
                CarInfo parkingCar = new CarInfo(carroNombre);
                cars.add(parkingCar);
                System.out.println("A new car parked");
                System.out.println(parkingCar);
                this.numero++;
            }

        }
        public void leaveFromParking(CarInfo pc) {
            boolean isLeft = cars.remove(pc);
            if (isLeft) {
                this.numero--;
                System.out.println("The car having " + pc + " has left the parking lot.");
            } else {
                System.out.println("No Parking info for the car is found.");
            }

        }
    }
