public class Payroll  {
    

    public static void main(String[] args){


        //create an array with 3 employees
        Employee[] array ={new HourlyEmployee("david",
                                                "melnik",
                                                109,
                                                30,
                                                80.5f),

                            new CommissionEmployee("gad",
                                                    "bad",
                                                    556,
                                                    76.7f,
                                                    34),

                            new BasePlusCommissionEmployee("menachem",
                                                            "rappaport",
                                                            177,32.6f,
                                                            89,
                                                            65.2f)
                            };

        // print all employee's properties
        for (Employee employee:array) {
            if(employee instanceof BasePlusCommissionEmployee) //add 10% to the BasePlusCommissionEmployee
                System.out.println(
                        employee.toString().replaceFirst("earning="+employee.earnings(),
                                "earning="+String.format("%.2f",employee.earnings()*1.1)));
            else
                System.out.println(employee.toString());
        }


    }
}
