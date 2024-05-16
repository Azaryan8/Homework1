package Book;

public class App {
    public static void main(String[] args) {
        book[] books = new book[3];

        books[0] = new book("The reachest man in babylon","Kleyson",123,"Personal Finance");
        books[1] = new book("Wight nights", "Dostoevskiy",176,"Roman");
        books[2] = new book("Martin Iden","Jack London",187,"Roman");

        for (int i = 0; i < books.length; i++) {
            System.out.println("Write the book");
            System.out.println("The name of book" +  books[i]. getName());
            System.out.println("The name of Author" +  books[i]. getAuthorName());
            System.out.println("The Ganre of book" +  books[i]. getGanre());
            System.out.println("The id of the book" +  books[i]. getId());

        }

}}
