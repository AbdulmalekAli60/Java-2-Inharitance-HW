public class start {

    public void start() {

        // objects for commissionEmployee
        System.out.println("CommissionEmployee:");
        CommissonEmployee commissonEmployee = new CommissonEmployee();
        CommissonEmployee commissonEmployee2 = new CommissonEmployee("Abdulmalek", "ali", "001", 123.16, 200);
        System.out.println(commissonEmployee2.toString());
        System.out.println(commissonEmployee2.CombineNames());

        System.out.println();

        // objects for SalariedEmployee
        System.out.println("SalariedEmployee:");
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("ali", "Mohammed", "002", 222.16);
        System.out.println(salariedEmployee2.toString());
        System.out.println(salariedEmployee2.CombineNames());

        System.out.println();

        System.out.println("BasePluSComissionEmployee:");
        BasePlusComissionEmployee basePlusComissionEmployee = new BasePlusComissionEmployee();
        BasePlusComissionEmployee basePlusComissionEmployee2 = new BasePlusComissionEmployee("Eyad", "ali", "22", 99.12,22, 25);
        System.out.println(basePlusComissionEmployee2.toString());
        System.out.println(basePlusComissionEmployee2.CombineNames());
    }
}
