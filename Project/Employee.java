public abstract class Employee { //abstract super class
    private String First_Name;
    private String Last_Name;
    private String Social_Security_Number;
    
    public Employee(){

    }

    public Employee(String fname , String lname ,String ssn){
    this.First_Name = fname;
    this.Last_Name = lname;
    this.Social_Security_Number = ssn;
    }

    public void setFirst_Name(String fname){
    
        this.First_Name = fname;
    }
    
    public String getFirst_Name(){
    
        return this.First_Name;
    }
    
    public void setLast_Name(String Lname){
    
        this.Last_Name = Lname;
    }
    
    public String getLast_Name(){
    
        return this.Last_Name;
    }
    
    public void setSocial_Security_Number( String SSN){
    
        this.Social_Security_Number = SSN;
    }
    
    public String get_Social_Security_Number(){
    
        return this.Social_Security_Number;
    }

    public abstract double earnings(); 

    public abstract String toString();

    public abstract String CombineNames();
}
