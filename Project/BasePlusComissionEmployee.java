public class BasePlusComissionEmployee extends CommissonEmployee { //sub class from Super Class CommissionEmployee- concret-concret

    private double BaseSalary;

    public BasePlusComissionEmployee(){

    }

    public BasePlusComissionEmployee(String fname , String lname , String ssn,double rate,double sale ,double basesalary){ 
        
        super(fname , lname ,ssn , rate , sale); // used in the subclass constructor

        setBaseSalary(basesalary);  
    }

    public void setBaseSalary(double bsalary){

        this.BaseSalary = (bsalary < 0.0) ? 0 : bsalary;
    }

    public double getBaseSalary(){

        return this.BaseSalary;
    }

@Override
public double earnings(){

    return BaseSalary + (super.getComission_Rate() + super.getGross_Salary());
}

@Override
public String toString(){

    return "First Name: " + super.getFirst_Name() + "\n" +
    "Last Name:" + super.getLast_Name() + "\n" + "Commission Rate: " + this.getComission_Rate() + "\n" +
    "Gross sales " + this.getGross_Salary();
}

@Override
public String CombineNames(){
    return "Full Name: " + super.getFirst_Name() + " " +  super.getLast_Name();
}
}
