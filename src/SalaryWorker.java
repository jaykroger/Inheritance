public class SalaryWorker extends Worker{

    private double annualSalary;

    // Constructor for SalaryWorker
    public SalaryWorker(String ID, String firstName, String lastName, String title, int yearOfBirth, int payRate, double annualSalary) {
        super(ID, firstName, lastName, title, yearOfBirth, payRate);
        this.annualSalary = annualSalary;
    }

    // Getters and Setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay() {
        double weeklyPay = (getAnnualSalary() / 52);
        return weeklyPay;
    }

    public void displayWeeklyPay() {
        double weeklyPay = (getAnnualSalary() / 52);
        System.out.println();
        System.out.print("Weekly pay: $");
        System.out.printf("%.2f", weeklyPay);
        System.out.print(" (1/52 of annual salary)");
    }



}
