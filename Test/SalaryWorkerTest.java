import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker w1 = new SalaryWorker("000001", "Kendall", "Roy", "Mr.", 1982, 0, 150000);
    @Test
    void getAnnualSalary() {assertEquals(150000, w1.getAnnualSalary());}

    @Test
    void setAnnualSalary() {w1.setAnnualSalary(160000);}

    @Test
    void calculateWeeklyPay() {w1.calculateWeeklyPay();}

    @Test
    void displayWeeklyPay() {w1.displayWeeklyPay();}
}