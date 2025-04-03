public class Car {
    private String brand;
    private String model;
    private int year;
    private String registrationNumber;
    private int seats;

    public Car(String brand, String model, int year, String registrationNumber, int seats) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.seats = seats;
    }

    public void printCar() {
        System.out.println("Brand : " + this.brand + "\nModel : " + this.model + "\nYear : " + this.year + "\nRegistration : " + this.registrationNumber + "\nSeats : " + this.seats);
    }

    public String getRegistration() {
        return registrationNumber;
    }
}