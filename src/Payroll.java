public class Payroll  {
    

    public static void main(String[] args){

        Employee[] array ={new HourlyEmployee("david","melnik", 109,30,80.5f),
                new BasePlusCommissionEmployee("menchem","rapaport",177,32.6f,89,65.2f),
                new CommissionEmployee("gad","bad",556,76.7f,34)};

        for (Employee employee:array
             ) {
            if(employee instanceof BasePlusCommissionEmployee)
                System.out.println(employee.toString().replaceFirst("earning="+String.valueOf(employee.earnings()),"earning="+String.format("%.2f",employee.earnings()*1.1)));
            else
                System.out.println(employee.toString());
        }


    }
}
