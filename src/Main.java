public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Renault", "Clio", 2022, "GS-249-HQ", 5);
        Car car2 = new Car("Peugeot", "2008", 2019, "KP-834-JT", 5);

        Garage garage1 = new Garage("Ecelerate", 5);
        garage1.addCar(car1);
        garage1.addCar(car2);
        garage1.addCar(car1);

        garage1.printGarage();
        garage1.searchCar("KP-834-JT");

        garage1.deleteCar(1);
        garage1.printGarage();
    }
}