import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("000001", "Greg", "Hirsch", "Mr.", 1987, 19));
        workers.add(new Worker("000002", "Tom", "Wamb", "Mr.", 1980, 30));
        workers.add(new Worker("000003", "Shiv", "Roy", "Ms.", 1982, 52));

        workers.add(new SalaryWorker("000004", "Ken", "Roy", "Mr.", 1982, 0, 150000));
        workers.add(new SalaryWorker("000005", "Jess", "Jordan", "Ms.", 1979, 0, 85000));
        workers.add(new SalaryWorker("000006", "Roman", "Roy", "Mr.", 1985, 0, 100000));


        // Variable initialization for table header
        int payPeriod = 1;
        String tableHeader = "ID#" + "      " + "First Name" + "     " + "Last Name" + "    " + "Hours" + "     " + "Pay";
        String headerSeperator = "=====================================================";



        while (payPeriod < 4) {
            int hoursWorked;
            if (payPeriod == 2) {
                hoursWorked = 50;
            }
            else {
                hoursWorked = 40;
            }

            System.out.println();
            System.out.println("Pay Period " + payPeriod + ": ");
            System.out.println(tableHeader);
            System.out.println(headerSeperator);

        for (Worker worker : workers)
        {
            System.out.printf("%-10s", worker.getID());
            System.out.printf("%-14s", worker.getFirstName());
            System.out.printf("%-14s", worker.getLastName());
            System.out.printf("%-8s", hoursWorked);

                if (worker instanceof SalaryWorker)
                {
                    double weeklySalary = ((SalaryWorker) worker).calculateWeeklyPay();
                    System.out.printf("%-4.2f", weeklySalary);
                }
                else
                {
                    System.out.printf("%-4.2f", worker.calculateWeeklyPay(hoursWorked));
                }
                System.out.println();
            }

        System.out.println();
        payPeriod++;

        }
    }
}