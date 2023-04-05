public class SalariedEmployee extends Employee{ // sub class from Super Abstract class
private double WeaklySalary;
    
    public SalariedEmployee(){
        
    }

    public SalariedEmployee(String fname , String lname , String ssn , double salary){
        super(fname , lname , ssn);
        SetWeaklySalary(salary);
    }

    public void SetWeaklySalary(double salary){
        this.WeaklySalary = (salary < 0.0 ? 0.0:salary);
    }

    public double getWeaklySalary(){
        return this.WeaklySalary;
    }

    @Override
    public double earnings(){
        return this.getWeaklySalary();
    }

    @Override
    public String toString(){

        return "First Name: " + super.getFirst_Name() + "\n" +
        "Last Name: " + super.getLast_Name() + "\n" + "WeaklySalary: " + this.getWeaklySalary();
    }

    @Override
    public String CombineNames(){
    return "Full Name: " + super.getFirst_Name() + " " + super.getLast_Name();
}
}
