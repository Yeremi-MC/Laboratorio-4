public class Main1 {
    public static void main(String[] args) {
        Author a1=new Author("Diego");
        Book b1=new Book("Noches blancas", a1, 50);
        a1.addBook(b1);
        a1.addBook("Luna de marmol", 46);
        a1.addBook("Valle de estrellas", 47);
        for(Book mostrar: a1.getBooks()){
            mostrar.getInfo();
        }
    }
}
