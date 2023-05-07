package AirplaneResevation;


import java.util.Scanner;
public class Main {


    static Scanner scnr = new Scanner (System.in);
    public static void main( String [] args) {
System.out.println("welcome to our JMR fliyght compeny! \n our compeny has two classes : ecinomc n first class in every trip");
    FlightReservation ob1 = new FlightReservation();
    int st = scnr.nextInt();
   char calss;
   if (st <= 25 ){
    System.out.println("u r in economic class ");
   }else {
    System.out.println("u r in first class");
   }
    
    

    
    System.out.println("ur seat is : " + st);

System.out.println("pleas enter the class");


    }
}
