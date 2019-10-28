import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\jofeb\\Documents\\Software engi\\assigment3\\src\\test4");
        Scanner st = new Scanner(file);
        List<String> superlist = new ArrayList<>();
        int capacity = 0;
        while (st.hasNextLine()) {
            superlist.add(st.next());
        }
        capacity = Integer.parseInt(superlist.get(0));
        int s = superlist.size();
        int newcpp = s - 1;

        Spots cars = new Spots(capacity);
        for (int j = 1; j <= newcpp; j++) {
            System.out.println("capacity of the parking lot" + " " + capacity);
            System.out.println("Parking car #" + " " + (cars.getnumero() + 1));
            cars.parkACar(superlist.get(j));
            if (cars.getnumero() == capacity) {
                Random r = new Random();
                int index = r.nextInt(cars.getnumero() + 1);
                CarInfo pc = cars.getCars().get(index);
                System.out.println("\nCar trying to leave the parking.............");
                cars.leaveFromParking(pc);

            }
        }
    }
}
