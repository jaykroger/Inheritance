import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<String> workers = new ArrayList<>();

        Worker w1 = new Worker("000001", "Greg", "Hirsch", "Mr.", 1987, 19);
        Worker w2 = new Worker("000002", "Tom", "Wamb", "Mr.", 1980, 30);
        Worker w3= new Worker("000003", "Shiv", "Roy", "Ms.", 1982, 52);

        SalaryWorker w4 = new SalaryWorker("000004", "Ken", "Roy", "Mr.", 1982, 0, 150000);
        SalaryWorker w5 = new SalaryWorker("000005", "Jess", "Jordan", "Ms.", 1979, 0, 85000);
        SalaryWorker w6 = new SalaryWorker("000006", "Roman", "Roy", "Mr.", 1985, 0, 100000);

        String w1Record = (w1.getID() + ", " + w1.getFirstName() + ", " + w1.getLastName() + ", " + w1.getTitle() + ", " + w1.getYearOfBirth() + ", " + w1.getHourlyPayRate());
        String w2Record = (w2.getID() + ", " + w2.getFirstName() + ", " + w2.getLastName() + ", " + w2.getTitle() + ", " + w2.getYearOfBirth() + ", " + w2.getHourlyPayRate());
        String w3Record = (w3.getID() + ", " + w3.getFirstName() + ", " + w3.getLastName() + ", " + w3.getTitle() + ", " + w3.getYearOfBirth() + ", " + w3.getHourlyPayRate());
        String w4Record = (w4.getID() + ", " + w4.getFirstName() + ", " + w4.getLastName() + ", " + w4.getTitle() + ", " + w4.getYearOfBirth() + ", " + w4.getHourlyPayRate() + ", " + w4.getAnnualSalary());
        String w5Record = (w5.getID() + ", " + w5.getFirstName() + ", " + w5.getLastName() + ", " + w5.getTitle() + ", " + w5.getYearOfBirth() + ", " + w5.getHourlyPayRate() + ", " + w5.getAnnualSalary());
        String w6Record = (w6.getID() + ", " + w6.getFirstName() + ", " + w6.getLastName() + ", " + w6.getTitle() + ", " + w6.getYearOfBirth() + ", " + w6.getHourlyPayRate() + ", " + w6.getAnnualSalary());

        workers.add(w1Record);
        workers.add(w2Record);
        workers.add(w3Record);
        workers.add(w4Record);
        workers.add(w5Record);
        workers.add(w6Record);


        // Variable initialization for table header
        int payPeriod = 1;
        String tableHeader = "ID#" + "      " + "First Name" + "     " + "Last Name" + "    " + "Hours" + "     " + "Pay";
        String headerSeperator = "===================================================";

        while (payPeriod != 3) {

            int hoursWorked;

            if (payPeriod == 2) {
                hoursWorked = 50;
            }
            else {
                hoursWorked = 40;
            }

            System.out.println();
            System.out.println("Pay Period " + payPeriod + ":");
            System.out.println(tableHeader);
            System.out.println(headerSeperator);

            for (String rec : workers) {


                if (workers.get(5).equals("0")) {
                    String ID = workers.get(0);
                    String firstName = workers.get(1);
                    String lastName = workers.get(2);
                    String title = workers.get(3);
                    String YOB = workers.get(4);
                    String hourlyPayRate = workers.get(5);
                    String annualSalary = workers.get(6);

                    // Parse string values from array as int
                    String formattedYOB = YOB.replace(" ", "");
                    int YOBInt = Integer.parseInt(formattedYOB);

                    String formattedHourlyPayRate = hourlyPayRate.replace(" ", "");
                    int hourlyPayRateInt = Integer.parseInt(formattedHourlyPayRate);

                    String formattedAnnualSalary = annualSalary.replace(" ", "");
                    int annualSalaryInt = Integer.parseInt(formattedAnnualSalary);

                    SalaryWorker employee = new SalaryWorker(ID, firstName, lastName, title, YOBInt, hourlyPayRateInt, annualSalaryInt);

                    System.out.printf("%-10s", employee.getID());
                    System.out.printf("%-14s", employee.getFirstName());
                    System.out.printf("%-14s", employee.getLastName());
                    System.out.printf("%-8s", hoursWorked);
                    System.out.printf("%-4s", employee.calculateWeeklyPay());
                    System.out.println();
                }
                else {
                    String ID = workers.get(0);
                    String firstName = workers.get(1);
                    String lastName = workers.get(2);
                    String title = workers.get(3);
                    String YOB = workers.get(4);
                    String hourlyPayRate = workers.get(5);

                    // Parse string values from array as int
                    String formattedYOB = YOB.replace(" ", "");
                    int YOBInt = Integer.parseInt(formattedYOB);

                    String formattedHourlyPayRate = hourlyPayRate.replace(" ", "");
                    int hourlyPayRateInt = Integer.parseInt(formattedHourlyPayRate);

                    Worker employee = new Worker(ID, firstName, lastName, title, YOBInt, hourlyPayRateInt);

                    System.out.printf("%-10s", employee.getID());
                    System.out.printf("%-14s", employee.getFirstName());
                    System.out.printf("%-14s", employee.getLastName());
                    System.out.printf("%-8s", hoursWorked);
                    System.out.printf("%-4s", employee.calculateWeeklyPay(hoursWorked));
                    System.out.println();
                }

            }



            payPeriod++;

        }


    }
}