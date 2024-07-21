import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();

        Car car = new Car("Toyota",4);
        Bike bike = new Bike("Mountain",48);
        Truck truck = new Truck("Strong",3);
        rentedVehicles.addFirst(car);
        rentedVehicles.addFirst(bike);
        rentedVehicles.addFirst(truck);
        int number;
        do {
            System.out.println("1 - Rent a car");
            System.out.println("2 - Rent a bike");
            System.out.println("3 - Rent a truck");
            System.out.println("4 - View rented vehicles");
            System.out.println("5 - Exit");
            System.out.print("Please enter number(1-5): ");
            number = in.nextInt();
            System.out.println();
            if(number == 1)
            {
                System.out.print("Enter car model: ");
                in.nextLine();
                String s = in.nextLine();
                System.out.print("Enter rental days: ");
                int n = in.nextInt();
                rentedVehicles.addFirst(new Car(s,n));
                System.out.println("Rental details:");
                rentedVehicles.getFirst().displayDetails();
            } else if (number == 2) {
                System.out.print("Enter bike brand: ");
                in.nextLine();
                String s = in.nextLine();
                System.out.print("Enter rental hours: ");
                int n = in.nextInt();
                rentedVehicles.addFirst(new Bike(s,n));
                System.out.println("Rental details:");
                rentedVehicles.getFirst().displayDetails();
            } else if (number == 3) {
                System.out.print("Enter truck type: ");
                in.nextLine();
                String s = in.nextLine();
                System.out.print("Enter rental weeks: ");
                int n = in.nextInt();
                rentedVehicles.addFirst(new Truck(s,n));
                System.out.println("Rental details:");
                rentedVehicles.getFirst().displayDetails();
            } else if (number == 4) {
                for (int i=0;i < rentedVehicles.size();i++)
                {
                    rentedVehicles.get(i).displayDetails();
                    System.out.println("----------------------");
                }
            }
            else if (number == 5)
            {
                System.out.println("Thank you for using the vehicle rental system.");
                break;
            }
            else System.out.println("Please enter only between 1 and 5");

        }while (true);
    }
}
