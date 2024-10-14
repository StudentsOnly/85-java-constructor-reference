@FunctionalInterface
public interface CarFactory {
    Car makeCar(String make, String model, int year);
}
