package AirplaneResevation;

public class FlightReservation {

private String departureCity;
private  String arrivalCity ;
private String SeatType ;
private int departureTime ;
private int departureDate; 
private int arrivaltime ;
private int arrivalDate;
private boolean SeatConfirm;

 public FlightReservation()
{
  System.out.println("pleas enter the seat number");
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


    
    public void setSeatType(String ST) {


        this.SeatType = ST;
    }
    
    public String getSeatType() {
        return SeatType;
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

    
   
}
