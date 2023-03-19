import java.time.LocalDate;
public class TextBook extends Book {
    private int pages;
    private int bId;
    TextBook(){
        super();
    }
    TextBook(int pages,String title, LocalDate releaseDate,  double price){
        super(title,releaseDate,price);
        this.pages=pages;
        bId=super.getId();
    }
    @Override
    public void print(){
        System.out.printf("Book type: Text\ntitle: %s\nid: %d\nReleaseDate: %s\nPrice: %f $\nPages: %d pages",title,bId,releaseDate.toString(),price,pages);
        System.out.printf("\n*********************\n\n");
    }
    public int getPages(){
        return this.pages;
    }
    public void setClass(int pages, String title, LocalDate releaseDate,  double price){
        this.title=title;
        this.releaseDate= releaseDate;
        this.price=price;
        this.pages=pages;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof TextBook){
            return(this.title==((TextBook)obj).getTitle() && this.releaseDate==((TextBook)obj).getDate() && this.pages==((TextBook)obj).getPages());
        }
        return false;
    }
    @Override
    public String toString(){
        return this.title+bId+releaseDate.toString()+this.price+this.pages ;
    }
}
