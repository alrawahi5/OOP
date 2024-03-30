public class Book {


    private String title;
    private String author;
    private Integer publicationYear;

    public Book(){}

    public String getTitle() {
        return title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String [] args ){
        Book book = new Book();
        book.author = "Abdullah";
        book.title = "My journey";
        book.publicationYear = 2024;

        System.out.println("One of the greatest books of: " + book.getAuthor() + " that was publised early in:  "+ book.getPublicationYear() + ". the book is under the title: "+  book.getTitle());

    }

}
