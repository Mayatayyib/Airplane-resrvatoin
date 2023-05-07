package AirplaneResevation;


import java.util.Scanner;
public class Main {


    static Scanner scnr = new Scanner (System.in);
    public static void main( String [] args) {
/*System.out.println("welcome to our JMR fliyght compeny! \n our compeny has two classes : ecinomc n first class in every trip");
    
    int st = scnr.nextInt();
   char calss;
   if (st <= 25 ){
    System.out.println("u r in economic class ");
   }else {
    System.out.println("u r in first class");
   }
    
   
    System.out.println("ur seat is : " + st);*/


 FlightReservation ob1 = new FlightReservation();
ob1.setSeatType(2);
System.out.println("pleas select 1 or 2 to choose ur class");
String st = scnr.next();

FlightReservation ob2 = new FlightReservation();
ob2.SeatType(st);
}
}
