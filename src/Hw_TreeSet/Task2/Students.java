package Hw_TreeSet.Task2;

import java.util.Comparator;
import java.util.Objects;

public class Students implements Comparator<Students> {
    private int Role;
    private String Name;

    public int getRole() {
        return Role;
    }

    public String getName() {
        return Name;
    }

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.getRole(), o2.getRole());
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return getRole() == students.getRole() && Objects.equals(getName(), students.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRole(), getName());
    }

    @Override
    public String toString() {
        return "Students{" +
                "Role=" + Role +
                ", Name='" + Name + '\'' +
                '}';
    }

    public Students(int role, String Name) {
        this.Role = role;
        this.Name = Name;



    }
}
