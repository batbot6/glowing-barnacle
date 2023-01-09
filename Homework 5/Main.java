package velko;

public class Main {

  public static void main(String[] args) {
    Person[] people = new Person[10];
    people[0] = new Person("Ivan Ivanov", 30, true);
    people[1] = new Person("Genka Shikerova", 25, false);
    people[2] = new Student("Gosho Petkov", 21, true, 4.55);
    people[3] = new Student("Minka Shishova", 25, false, 5.64);
    people[4] = new Employee("Petko Stoqnov", 45, true, 105.75);
    people[5] = new Employee("Ioanna Stoichkova", 17, false, 200);

    for (Person p : people) {
      if (p != null) {
        if (p instanceof Employee) {
          ((Employee) p).showEmployeeInfo();
        }
        else if (p instanceof Student) {
          ((Student) p).showStudentInfo();
        }
        else {
          p.showPersonInfo();
        }
      }
    }

    System.out.println("\n-------------------\n");
    //employees
    for (Person p : people) {
      if (p instanceof Employee) {
        System.out.println(String.format("%s will receive %.2f for 2 hours overtime.", p.getName(),
            ((Employee) p).calculateOvertime(2)));
      }
    }
  }
}
