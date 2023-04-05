public class CommissonEmployee extends Employee { // sub class from Super Abstract class

    private double Commission_Rate;
    private double Gross_Salary;


public CommissonEmployee(){

}

public CommissonEmployee(String fname, String lname, String ssn, double rate,double sale){
    super(fname , lname , ssn);
    setCommission_Rate(rate);
    setGross_Sale(sale);
}

public void setGross_Sale(double sale ){

    this.Gross_Salary = (sale < 0.0)? 0.0 : sale;
}

public double getGross_Salary(){

    return this.Gross_Salary;
}

public void setCommission_Rate(double rate){

    this.Commission_Rate = (rate > 0.0 && rate < 1.0)? 0.0 : rate;
}

public double getComission_Rate(){

    return this.Commission_Rate;
}


@Override
public double earnings(){

    return (this.getComission_Rate() * this.getGross_Salary());
}

@Override
public String toString(){

    return "First Name: " + super.getFirst_Name() + "\n" +
    "Last Name:" + super.getLast_Name() + "\n" + "Commission Rate: " + this.getComission_Rate() + "\n" +
    "Gross sales " + this.getGross_Salary();
}

@Override
public String CombineNames(){
    return "Full Name: " + super.getFirst_Name() + " " + super.getLast_Name();
}

}

