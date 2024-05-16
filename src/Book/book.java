package Book;

public class book {

    private String name;
    private String authorName;
    private int id;
    private String ganre;

    public book( String name, String authorName, int id, String ganre) {

        this.name = name;
        this.authorName = authorName;
        this.id = id;
        this.ganre = ganre;

    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getId() {
        return id;
    }

    public String getGanre() {
        return ganre;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", id=" + id +
                ", ganre='" + ganre + '\'' +
                '}';
    }
}

