class Main{
    public static void main(String[] args) {

        Car car1 = createCar("some model", "BMW", 2007, Car::new);
        System.out.println(car1);
    }

    static Car createCar(String model, String make, int year, CarFactory factory){
        return factory.makeCar(make, model, year);
    }
}
