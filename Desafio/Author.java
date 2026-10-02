import java.util.List;
import java.util.ArrayList;
public class Author{
    private String name;
    private List<Book>books;
    public Author(String name) {
        this.name = name;
        books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void addBook(String title,double price){
        Book b1=new Book(title,this, price);
        books.add(b1);
    }
    public List<Book> getBooks(){
        return books;
    }
    public String getName() {
        return name;
    }
}