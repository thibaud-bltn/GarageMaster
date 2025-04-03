import java.util.*;

public class Garage {
    private String name;
    private int capacity;
    private List<Car> carList;

    public Garage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.carList = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        if (carList.size() < capacity) {
            carList.add(car);
            System.out.println("Car added.");
        } else {
            System.out.println("Garage is full.");
        }
    }

    public void printGarage() {
        System.out.println("========================================");
        System.out.println("Garage " + this.name + " (capacity : " + this.capacity + ")");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("----------------------------------------");
            System.out.println("Car #" + (i + 1) + "\n");
            carList.get(i).printCar();
        }
    }

    public void searchCar(String registration) {
        System.out.println("========================================");
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getRegistration().equals(registration)) {
                System.out.println("Car found (position #" + (i + 1) + ") :\n");
                carList.get(i).printCar();
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public void deleteCar(String registration) {
        System.out.println("========================================");
        for (Car car : carList) {
            if (car.getRegistration().equals(registration)) {
                carList.remove(car);
                System.out.println("Car removed.");
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public void deleteCar(int id) {
        System.out.println("========================================");
        if(id <= carList.size() && id > 0) {
            carList.remove(id - 1);
            System.out.println("Car removed.");
        } else {
            System.out.println("Car not found.");
        }
    }
}