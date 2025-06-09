package my_project.capitulo7;

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Java Basics", 5, 1200.0);
        Course c2 = new Course("Java Basics", 5, 1200.0);
        Course c3 = new Course("Advanced Java", 3, 1500.0);

        System.out.println("c1.toString(): " + c1.toString());
        System.out.println("c1.equals(c2): " + c1.equals(c2)); 
        System.out.println("c1.equals(c3): " + c1.equals(c3)); 
        System.out.println("c1.hashCode(): " + c1.hashCode());
        System.out.println("c2.hashCode(): " + c2.hashCode());
        System.out.println("c3.hashCode(): " + c3.hashCode());
    }
}

