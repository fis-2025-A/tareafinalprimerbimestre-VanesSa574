package my_project.capitulo7;

public class Prospectus {
    private Course[] courses = new Course[50];
    private int courseCount = 0;

    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        } else {
            System.out.println("Cannot add more courses");
        }
    }

    public Course[] getCourses() {
        return courses;
    }

    public int getCourseCount() {
        return courseCount;
    }
}

