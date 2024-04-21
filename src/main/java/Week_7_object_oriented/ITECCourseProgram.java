package Week_7_object_oriented;

public class ITECCourseProgram {
    public static void main(String[] args) {

        ITECCourse maintenanceCourseName = new ITECCourse(
                "Microcomputer System Maintenance",1310,20);

        // We can use this format if we don't have constructor.
   //     ITECCourse maintenanceCourseName = new ITECCourse();
   //     maintenanceCourseName.name = "Microcomputer System Maintenance";
   //     maintenanceCourseName.code = 1310;
   //     maintenanceCourseName.maxStudents = 20;

        // Add some students
        maintenanceCourseName.addStudent("Anna");
        maintenanceCourseName.addStudent("Bill");
        maintenanceCourseName.addStudent("Carl");

        maintenanceCourseName.removeStudent("Carl");
        maintenanceCourseName.removeStudent("Marta");

        System.out.println();

        maintenanceCourseName.writeCourseInfo();

        System.out.println();

        ITECCourse dataMaintenanceCourseName = new ITECCourse(
                "Data Communication",1425,30);

        //  We can use this format if we don't have constructors.
    //    ITECCourse dataMaintenanceCourseName = new ITECCourse();
    //    dataMaintenanceCourseName.name =  "Data Communication";
    //    dataMaintenanceCourseName.code = 1425;
    //    dataMaintenanceCourseName.maxStudents = 30;

        dataMaintenanceCourseName.addStudent("Dave");
        dataMaintenanceCourseName.addStudent("Ed");
        dataMaintenanceCourseName.addStudent("Flore");

        dataMaintenanceCourseName.writeCourseInfo();

        System.out.println();

        ITECCourse softwareDevelopProject = new ITECCourse(
                "Software Development Project",2903,24);

        softwareDevelopProject.addStudent("Emily");
        softwareDevelopProject.addStudent("Harry");
        softwareDevelopProject.addStudent("You");
        softwareDevelopProject.addStudent("Izzy");

        int totalEnrolled = softwareDevelopProject.getSize();
        System.out.println("The " + softwareDevelopProject.getName() + " class has " + totalEnrolled);
        System.out.println("ITEC " + softwareDevelopProject.getCode() + " " + softwareDevelopProject.getName());

        softwareDevelopProject.setMaxStudents(30);
        softwareDevelopProject.writeCourseInfo();

        System.out.println();

        ITECCourse smallCourse = new ITECCourse(
                "Made up course", 1111, 3);

        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Dina");
        smallCourse.addStudent("Viva");
        smallCourse.addStudent("Erm");

        smallCourse.writeCourseInfo();

    }
}
