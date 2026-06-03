package java8features.functionalInterface;

public class MainMethod {

    public static void main(String[] args){

//        Vehicle vehicle = new Vehicle();  // we can't create object of vehicle interface


//        1 - way of doing things by create separate class and then create object then call

//         Vehicle vehicle = new Car();
//         vehicle.start();
//
//         Vehicle vehicle1 = new Bike();
//         vehicle1.start();


//          2 - way of doing things by annonymous inner classes

//             Vehicle v1 = new Vehicle() {
//                 @Override
//                 public void start() {
//                     System.out.println("Bike engine started !!! ");
//                 }
//             };
//              v1.start();
//
//
//              Vehicle v2 = new Vehicle() {
//                  @Override
//                  public void start() {
//                      System.out.println("Car engine started !!!");
//                  }
//              };
//              v2.start();
//

//         3 - way of doing thing by using lambda expressions.

           Vehicle v1 = () -> System.out.println("Bike engine Started !!!");
           v1.start();

           Vehicle v2 = () -> System.out.println("Car engine started !!!");
           v2.start();



    }
}
