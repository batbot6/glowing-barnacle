package velko;

public class Student extends Person {

  private final double score;

  public Student(String name, int age, boolean isMan, double score) {
    super(name, age, isMan);
    this.score = score;
  }

  public void showStudentInfo() {
    System.out.println(String.format("%s is a %s at %d has score: %.2f.", getName(), isMan() ? "man" : "woman", getAge(),
        getScore()));
  }

  public double getScore() {
    return score;
  }
}
