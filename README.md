## Exercise: Constructor Reference 

### Instructions:
Create a program that challenges you to use a constructor reference. 

### Perform the following tasks:

1.	Create a class Car with fields for make, model, and year.
2.	Create a functional interface CarFactory with a single abstract method that takes three parameters (make, model, and year) and returns a Car object.
3.	Create a method createCar that takes a CarFactory implementation and uses it to create a Car object.
4.	In the main method:
    -	Use a constructor reference to pass the Car constructor to createCar.
    -	Print the details of the created car.
