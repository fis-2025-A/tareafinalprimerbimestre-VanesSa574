package my_project.capitulo6;

/**
 * The Course class represents a training course.
 * @author Vanessa Pujos
 * @version 1.0
 */
public class Course {
    private String name;
    private int numberOfDays;
    private double pricePerPerson;
    private int maximumParticipants;

    private static int numberOfCoursesCreated = 0;
    public static final String COMPANY_NAME = "Mega awesome corp";

    public Course() {
        this("Unnamed Course", 3, 1000.0, 10);
    }

    public Course(String name, int days, double price, int maxParticipants) {
        setName(name);
        setNumberOfDays(days);
        setPricePerPerson(price);
        setMaximumParticipants(maxParticipants);
        numberOfCoursesCreated++;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumberOfDays() { return numberOfDays; }
    public void setNumberOfDays(int days) {
        if (days >= 1 && days <= 10)
            this.numberOfDays = days;
    }

    public double getPricePerPerson() { return pricePerPerson; }
    public void setPricePerPerson(double price) {
        this.pricePerPerson = price;
    }

    public int getMaximumParticipants() { return maximumParticipants; }
    public void setMaximumParticipants(int max) {
        if (max > 0 && max <= 100) // lógica simple
            this.maximumParticipants = max;
    }

    public static int getNumberOfCoursesCreated() {
        return numberOfCoursesCreated;
    }
    
    // Ejercicio 6.2 agregar metodo discountedCostPerPerson
    public double discountedCostPerPerson(int percentDiscount) {
        return pricePerPerson * (1 - percentDiscount / 100.0);
    }
    
    // Ejercicio 6.4 Metodo estatico para calcular el costo por cabeza
    public static double flatRatePerHead(double flatRate, int participants) {
        return flatRate / participants;
    }


}

