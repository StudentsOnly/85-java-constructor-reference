public class Main {

  public static void main(String[] args) {

    System.out.println(createCar("Ford", "Mustang Fastback", 1967, Car::new));
  }

  public static Car createCar(String make, String model, int year, CarFactory carFactory) {
    return carFactory.newCar(make, model, year);
  }
}
