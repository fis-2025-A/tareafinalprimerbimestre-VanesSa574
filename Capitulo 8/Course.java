package my_project.capitulo8;
import java.util.Objects;

public class Course {
    private String name;
    private int numberOfDays;
    private double pricePerPerson;

    public Course(String name, int numberOfDays, double pricePerPerson) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.pricePerPerson = pricePerPerson;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', days=" + numberOfDays + ", price=" + pricePerPerson + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Course other = (Course) obj;
        return numberOfDays == other.numberOfDays &&
               Double.compare(pricePerPerson, other.pricePerPerson) == 0 &&
               Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfDays, pricePerPerson);
    }
}
