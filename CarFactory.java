@FunctionalInterface
public interface CarFactory {

  Car newCar(String make, String model, int year);
}
