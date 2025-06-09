package my_project.capitulo7;

public class Course {
    private String name;
    private Module[] modules = new Module[20];
    private int moduleCount = 0;

    public Course(String name, int days, double price) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addModule(Module m) {
        if (moduleCount < modules.length) {
            modules[moduleCount++] = m;
        }
    }

    public Module[] getModules() {
        return modules;
    }

    public int getModuleCount() {
        return moduleCount;
    }

    public int getTotalCredits() {
        int total = 0;
        for (int i = 0; i < moduleCount; i++) {
            total += modules[i].getCreditPoints();
        }
        return total;
    }
}
