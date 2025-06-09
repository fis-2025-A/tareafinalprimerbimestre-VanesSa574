package my_project.capitulo7;

public class ProspectusTest {
    public static void main(String[] args) {
        Prospectus prospectus = new Prospectus();

        Course course1 = new Course("Software Testing", 5, 2000);
        course1.addModule(new Module("Unit Testing", 10, "Practicum"));
        course1.addModule(new Module("Acceptance Testing", 20, "Coursework"));

        Course course2 = new Course("Object-Oriented Programming", 8, 2500);
        course2.addModule(new Module("Encapsulation", 10, "Quiz"));
        course2.addModule(new Module("Inheritance", 15, "Exam"));

        prospectus.addCourse(course1);
        prospectus.addCourse(course2);

        for (int i = 0; i < prospectus.getCourseCount(); i++) {
            Course c = prospectus.getCourses()[i];
            System.out.println("Course: " + c.getName());
            System.out.println("Modules:");
            for (int j = 0; j < c.getModuleCount(); j++) {
                Module m = c.getModules()[j];
                System.out.println("- " + m.getName() + " (" + m.getCreditPoints() + " pts, " + m.getAssessment() + ")");
            }
            System.out.println("Total credits: " + c.getTotalCredits());
            System.out.println();
        }
    }
}
