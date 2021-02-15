package demo;

/**
 * The <code>Course</code> class represents a
 * course at a university. It consists of a
 * department code, course number, and title.
 * This is a simple example of a class of
 * immutable (there are no setters) data objects.
 */
public class Course {
  private String department;
  private int number;
  private String title;

  /**
   * Constructs a <code>Course</code> given
   * a department code, course number, and title.
   *
   * @param department a three- or four-letter department code
   * @param number a three-digit course number
   * @param title the title of the course
   */
  public Course(String department, int number, String title) {
    this.department = department;
    this.number = number;
    this.title = title;
  }

  /**
   * Gets the department code.
   *
   * @return the department code
   */
  public String getDepartment() {
    return department;
  }

  /**
   * Gets the course number.
   *
   * @return the course number
   */
  public int getNumber() {
    return number;
  }

  /**
   * Gets the course title.
   *
   * @return the course title
   */
  public String title() {
    return title;
  }

  @Override
  public String toString() {
    return department + " " + number + ", " + title;
  }
}