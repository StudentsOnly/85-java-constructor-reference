@FunctionalInterface
interface CarFactory {
    Car create(String brand, String model, int year);
}

public class ConstructorReference {

    public static Car createCar(CarFactory factory, String brand, String model, int year){
        return factory.create(brand, model, year);
    }

    public static void main(String[] args) {
        CarFactory factory = Car::new;
        Car car = createCar(factory,"Mazda", "3 E-Skyactive", 2025);
        System.out.println(car);
    }
}
