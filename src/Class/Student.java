package Class;

import java.util.List;
import java.util.Set;

public class Student {
    private String name;
    private List<String> booksRead;


    public Student(String name) {
        this.name = name;
        this.booksRead = booksRead;
    }

    public String getName() {
        return name;
    }

    public List<String> getBooksRead() {
        return booksRead;
    }

    public void addBook(String book) {
        this.booksRead.add(book);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", booksRead=" + booksRead +
                '}';
    }
}
