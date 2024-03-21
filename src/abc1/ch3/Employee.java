package abc1.ch3;

public class Employee implements Measurable{
    public int salary;

    @Override
    public double getMeasure() {
        return salary;
    }

    public Employee(int salary) {
        this.salary = salary;
    }
}
