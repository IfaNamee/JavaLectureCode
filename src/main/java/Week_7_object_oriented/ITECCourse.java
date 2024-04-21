package Week_7_object_oriented;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // Data - fields - instance variables.

    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0) {
            return;
        }
        this.maxStudents = maxStudents;
    }

    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }
    public void addStudent(String studentName) {
        //  We can use this format if we don't have constructor.
    //    if (students == null) {
    //        students = new ArrayList<>();
    //    }
        if (students.size() == maxStudents) {
            System.out.println("Course is fully, can't add to " + studentName + " to class, the size of class is " + getSize());
        } else {
            students.add(studentName);
        }
    }
    public void writeCourseInfo() {

        System.out.println("Course Name: " + name);
        System.out.println("Course code: " + code);
        System.out.println("Students enrolled: ");
        for (String student : students) {
            System.out.println("    - " + student);
        }
        System.out.println("There are " + students.size() + " students enrolled.");
        System.out.println("The max number of students that can enroll is this course is " + maxStudents);
        System.out.println("There is " + (maxStudents - students.size()) + " set is remains. ");
    }

    public int getSize() {

        return students.size();
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
           students.remove(studentName);
           System.out.println(studentName + " was un-enrolled from " + name);
        } else {
            System.out.println(studentName + " was not found in " + name);
        }
    }
}
