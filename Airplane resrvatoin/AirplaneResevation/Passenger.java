package AirplaneResevation;
public class passenger {


 // كتبت كل المتغيرات 
    private int ID;
    private int age;
    private String name;
    private String male;
    private String female;
    private String mobile;
    private String email;
   
  // كونستراكتر

    public Passenger(){

    }
   
  //كونستراكتر مع براميتر 

    public Passenger( int d,int G, String n,String m, String F,String E, String M ){
        ID = d;
        age = G;
        name = n;
        male = m;
        female = F;
        mobile = E;
        email = M;

    }

    // ميثودات سيت وقيت 
   

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
   

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
   

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setMale(String male) {
        this.male = male;
    }

    public String getMale() {
        return male;
    }

    
    public void setFemale(String female) {
        this.female = female;
    }

    public String getFemale() {
        return female;
    }
   
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }




   


    

    
}
