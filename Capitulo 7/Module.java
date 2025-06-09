package my_project.capitulo7;

public class Module {
    private String name;
    private int creditPoints;
    private String assessment;

    public Module(String name, int points, String assess) {
        this.name = name;
        this.creditPoints = points;
        this.assessment = assess;
    }

    public String getName() {
        return name;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public String getAssessment() {
        return assessment;
    }
}

