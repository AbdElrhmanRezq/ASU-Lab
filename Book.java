import java.time.LocalDate;
public abstract class Book {
    static protected int id;
    protected String title;
    protected LocalDate releaseDate;
    protected double price;
    Book(){
        id++;
    }
    Book(String title,LocalDate releaseDate, double price){
        this.title=title;
        this.releaseDate= releaseDate;
        this.price=price;
        id++;
    }
    abstract public void print();
    abstract public boolean equals(Object book);
    abstract public String toString();
    public int getId(){
        return Book.id;
    }
    public String getTitle(){
        return this.title;
    }
    public LocalDate getDate(){
        return this.releaseDate;
    }
    public double getPrice(){
        return this.price;
    } 
}
