import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1 = new Worker("000001", "Kendall", "Roy", "Mr.", 1982, 50);

    @org.junit.jupiter.api.Test
    void getHourlyPayRate() {assertEquals(50, w1.getHourlyPayRate());}

    @org.junit.jupiter.api.Test
    void setHourlyPayRate() {w1.setID("000008");}

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {w1.calculateWeeklyPay(40);}

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {w1.displayWeeklyPay(40);}
}