package Hw_listArrey.Students;

public class StudentsName {
    private String name;

    public StudentsName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentsName{" +
                "name='" + name + '\'' +
                '}';
    }
}

