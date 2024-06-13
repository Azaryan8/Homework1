package Collections.Students.students;

import java.util.Comparator;
import java.util.Objects;

public class StudentsName {
    String name;

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




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentsName that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}



