public class Worker extends Person {
    private double hourlyPayRate;

    // Constructor for Worker
    public Worker(String ID, String firstName, String lastName, String title, int yearOfBirth, int payRate) {
        super(ID, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = payRate;
    }

    // Getters and Setters
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    // Associated methods with Worker

    // calculateWeeklyPay calculates the weekly pay before tax for input of hours worked
    // Factors in overtime compensation of 1.5x for time worked over 40 hours

    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay;
        if (hoursWorked > 40.0) {

            double overtimeRate = getHourlyPayRate() * 1.5;
            double overtimeHours = (hoursWorked - 40);
            double totalOvertimePay = (overtimeHours * overtimeRate);
            double totalRegularPay = (getHourlyPayRate() * 40);

            totalPay = totalOvertimePay + totalRegularPay;
        }
        else {
            totalPay = hoursWorked * getHourlyPayRate();
        }
        return totalPay;
    }


    // displayWeeklyPay displays number of regular hours, total regular pay, number of overtime hours, and total overtime pay
    // Takes input of hoursWorked

    public void displayWeeklyPay(double hoursWorked) {

        double overtimeRate = getHourlyPayRate() * 1.5;
        double overtimeHours = (hoursWorked - 40);
        double totalOvertimePay = (overtimeHours * overtimeRate);
        double totalRegularPay = (getHourlyPayRate() * 40);

        if (hoursWorked > 40) {
            System.out.println("Number of regular hours: 40");
            System.out.println("Total regular pay: $" + totalRegularPay);
            System.out.println("Number of overtime hours: " + overtimeHours);
            System.out.println("Total overtime pay: $" + totalOvertimePay);
        }
        else {
            System.out.println("Number of regular hours: " + hoursWorked);
            System.out.println("Total regular pay: $" + hoursWorked * getHourlyPayRate());
            System.out.println("Number of overtime hours: 0");
            System.out.println("Total overtime pay: 0");
        }
    }
}
