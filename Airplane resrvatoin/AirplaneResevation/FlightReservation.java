package AirplaneResevation;

public class FlightReservation {

private String departureCity;
private  String arrivalCity ;
private int SeatType ;
private int departureTime ;
private int departureDate; 
private int arrivaltime ;
private int arrivalDate;
private boolean SeatConfirm;

 public FlightReservation()
{
 
}


    public void setDepartureCity(String DepC) {
        this.departureCity = DepC;
    }
    
    public String getDepartureCity() {
        return departureCity;
    }

    
    public void setArrivalCity(String ArrC) {
        this.arrivalCity = arrivalCity;
    }
    
    public String getArrivalCity() {
        return arrivalCity;
    }


    public void setDepartureTime(int DepT) {
        this.departureTime = DepT;
    }
    
     public int getDepartureTime() {
        return departureTime;
    }

    
    public void setDepartureDate(int DepD) {
        this.departureDate = departureDate;
    }
    
    public int getDepartureDate() {
        return departureDate;
    }


    

    public void setArrivaltime(int ArrT) {
        this.arrivaltime = ArrT;
    }
    
    public int getArrivaltime() {
        return arrivaltime;
    }

   

    public void setArrivalDate(int ArrD) {
        this.arrivalDate = ArrD;
    } 
    
    public int getArrivalDate() {
        return arrivalDate;
    }

   

    public void setSeatConfirm(boolean SC) {
        this.SeatConfirm = SC;
    }
    
     public boolean getisSeatConfirm() {
        return SeatConfirm;
    }

  public void setSeatType(int count){
    this.SeatType=count;
  }

 
public String SeatType( String nc){
    
    
    System.out.println("pleas select 1 or 2 to choose ur class");
   switch (this.SeatType){
    case 1:
            nc = "ecnomic class"; 
            break;
    case 2:
             nc = "first class"; 
            break;

   }
return nc;
}
    
   
}
