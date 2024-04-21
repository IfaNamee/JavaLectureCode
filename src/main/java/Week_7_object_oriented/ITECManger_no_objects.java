package Week_7_object_oriented;

import java.util.ArrayList;

public class ITECManger_no_objects {

    public static void main(String[] args) {

        String maintenanceName = "Microcomputer System Maintenance";
        int maintenanceCode = 1310;
        ArrayList<String> maintenanceCourseStudentList = new ArrayList<>();
        int maintenanceCourseMaxStudent = 20;

        // Add some students.
        maintenanceCourseStudentList.add("Bill");
        maintenanceCourseStudentList.add("Anna");
        maintenanceCourseStudentList.add("Carl");

        String dataMaintenanceName = "Data Communication";
        int dataMaintenanceCode = 1425;
        ArrayList<String> dataMaintenanceCourseStudentList = new ArrayList<>();
        int dataMaintenanceCourseMaxStudent = 30;

        // Add some students.
        dataMaintenanceCourseStudentList.add("Dave");
        dataMaintenanceCourseStudentList.add("Ed");
        dataMaintenanceCourseStudentList.add("Flore");

        writeCourseInfo(maintenanceName, maintenanceCode, maintenanceCourseStudentList, maintenanceCourseMaxStudent);
        writeCourseInfo(dataMaintenanceName, dataMaintenanceCode, dataMaintenanceCourseStudentList, dataMaintenanceCourseMaxStudent);

    }

    private static void writeCourseInfo(String maintenanceName, int maintenanceCode, ArrayList<String> maintenanceCourseStudentList, int maintenanceCourseMaxStudent) {

        System.out.println("Course Name: " + maintenanceName);
        System.out.println("Course code: " + maintenanceCode);
        System.out.println("Students enrolled: ");
        for (String student : maintenanceCourseStudentList) {
            System.out.println(student);
        }
        System.out.println("There are " + maintenanceCourseStudentList.size() + " students enrolled.");
        System.out.println("The max number of students that can enroll is this course is " + maintenanceCourseMaxStudent);
        System.out.println("There is " + (maintenanceCourseMaxStudent - maintenanceCourseStudentList.size()) + " set is remains. ");
    }
}
