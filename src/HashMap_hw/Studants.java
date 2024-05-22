package HashMap_hw;

import java.util.Objects;

public class Studants {
    private String name;
    private int grade;

    public Studants(String name, int grade) {
        this.name = name;
        this.grade = grade;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studants studants)) return false;
        return grade == studants.grade && Objects.equals(name, studants.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }


}
