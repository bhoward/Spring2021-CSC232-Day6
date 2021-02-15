import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

import demo.Course;

class Main {
  public static void main(String[] args) {
    Course csc231 = new Course("CSC", 231, "Computer Systems");
    Course csc232 = new Course("CSC", 232, "Object-Oriented Software Development");
    Course csc233 = new Course("CSC", 233, "Foundations of Computation");
    Course csc240 = new Course("CSC", 240, "Writing in Computer Science");

    csc232.getTitle();

    Collection<Course> courses = new ArrayList<>();
    courses.add(csc231);
    courses.add(csc232);
    courses.add(csc233);
    courses.add(csc240);

    Collection<Course> courses2 = new LinkedList<>();
    courses2.addAll(courses);

    for (Course course : courses) {
      System.out.println(course);
    }

    for (Course course : courses2) {
      System.out.println(course);
    }
  }
}