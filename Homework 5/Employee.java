package velko;

public class Employee extends Person {

  private final double daySalary;

  public Employee(String name, int age, boolean isMan, double daySalary) {
    super(name, age, isMan);
    this.daySalary = daySalary;
  }

  public double getDaySalary() {
    return daySalary;
  }

  public double calculateOvertime(double hours) {
    if (getAge() < 18) {
      return 0;
    }

    return hours * 1.5 * getRatePerHour();
  }

  public double getRatePerHour() {
    return daySalary / 8;
  }

  public void showEmployeeInfo() {
    System.out.println(String.format("%s is a %s at %d with day salary: %.2f.", getName(), isMan() ? "man" : "woman",
        getAge(), getDaySalary()));
  }
}
