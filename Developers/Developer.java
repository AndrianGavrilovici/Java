package DevelopersPackage;

public abstract class Developer {
    private final String name;
    protected final double basicSalary;
    protected final int experience;
    public Developer(String name, double basicSalary, int experience){
        this.name = name;
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();
}
