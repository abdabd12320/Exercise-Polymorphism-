public class Truck implements Vehicle {

    private String type;
    private int week;

    public Truck() {
        this(null,0);
    }

    public Truck(String type, int days) {
        this.type = type;
        this.week = days;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car model: " + type);
        System.out.println("Weekly rental rate: $" + 500.0);
        System.out.println("Rental cost: $" + calculateRentalCost());
    }
}
