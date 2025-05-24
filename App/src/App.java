import models.Car;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Car myCar = new Car("Toyota", "Corolla", 2022);

        Car friendsCar = new Car("Honda", "Civic", 2023);
        friendsCar.displayInfo();

        myCar.displayInfo();

        // Usamos setters para inicializar
        myCar.setMake("Toyota");
        myCar.setModel("Corolla");
        myCar.setYear(2024);

        // Usamos getters para leer
        System.out.println("Make  : " + myCar.getMake());
        System.out.println("Model : " + myCar.getModel());
        System.out.println("Year  : " + myCar.getYear());
    }
}
