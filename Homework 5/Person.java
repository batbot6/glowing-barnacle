package velko;

public class Person {

  private final String name;
  private final int age;
  private final boolean isMan;

  public Person(String name, int age, boolean isMan) {
    this.name = name;
    this.age = age;
    this.isMan = isMan;
  }

  public void showPersonInfo() {
    System.out.println(String.format("%s is a %s at %d.", this.name, this.isMan ? "man" : "woman", this.age));
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isMan() {
    return isMan;
  }
}
