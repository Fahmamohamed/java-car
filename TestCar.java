package assignment;

public class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car("AB1110", "BMW", 45);
        Car.displayCompanyName();

        System.out.println("Car info:");
        car1.displayInfo();

        car1.rent();

        car1.rent();

        car1.returnCar();

        System.out.println();

        Car car2 = new Car("AC1112", "Toyota", 40);

        System.out.println("Car info:");
        car2.displayInfo();


        car2.rent();


        car2.rent();
        car2.returnCar();

        Car.displayTotalCars();
    }
}

class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRentalRate;
    private boolean rent;
    public static String companyName = "JUST Rentals";
    public static int totalCars;

    public Car() {
        plateNumber = "Unknown";
        carModel = "Unknown";
        dailyRentalRate = 0.0;
        rent = false;
        totalCars++;
    }

    public Car(String plateNumber, String carModel, double dailyRentalRate) {
        this.plateNumber = plateNumber;
        this.carModel = carModel;

        // Validation
        if (dailyRentalRate >= 0) {
            this.dailyRentalRate = dailyRentalRate;
        } else {
            this.dailyRentalRate = 0.0;
        }

        rent = false;
        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getDailyRentalRate() {
        return dailyRentalRate;
    }

    public void setDailyRentalRate(double dailyRentalRate) {
        if (dailyRentalRate >= 0) {
            this.dailyRentalRate = dailyRentalRate;
            System.out.println("Daily rental rate changed successfully.");
        } else {
            System.out.println("Error: Rental rate cannot be negative.");
        }
    }

    public boolean isRent() {
        return rent;
    }

    public void rent() {
        if (rent) {
            System.out.println("Car " + plateNumber + " is already rented.");
        } else {
            rent = true;
            System.out.println("Car " + plateNumber + " has been rented.");
        }
    }

    public void returnCar() {
        if (rent) {
            rent = false;
            System.out.println("Car " + plateNumber + " has been returned.");
        } else {
            System.out.println("Car " + plateNumber + " is already available.");
        }
    }

    public void displayInfo() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Car Model: " + carModel);
        System.out.println("Daily Rate: " + dailyRentalRate);
        System.out.println("Rent: " + rent);
        System.out.println();
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
        System.out.println();
    }

    public static void displayTotalCars() {
        System.out.println();
        System.out.println("Total Car is: " + totalCars);
    }
}