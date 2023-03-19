import java.time.LocalDate;
public class DigitalBook extends Book {
    private double length;
    private int bId;
    DigitalBook(){
        super();
    }
    DigitalBook(double length,String title, LocalDate releaseDate,  double price){
        super(title,releaseDate,price);
        this.length=length;
        bId=super.getId();
    }
    @Override
    public void print(){
        System.out.printf("Book type: Digital\ntitle: %s\nid: %d\nReleaseDate: %s\nPrice: %f $\nLength: %f Minutes",title,bId,releaseDate.toString(),price,length);
        System.out.printf("\n*********************\n\n");
    }
    public double getLength(){
        return this.length;
    }
    public void setClass(int length, String title, LocalDate releaseDate,  double price){
        
        this.length=length;
        this.releaseDate= releaseDate;
        this.price=price;
        this.length=length;
        
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof DigitalBook){
            return(this.title.equals(((DigitalBook)obj).getTitle()) && this.releaseDate.equals(((DigitalBook)obj).getDate()) && this.length==((DigitalBook)obj).getLength());
        }
        return false;
    }
    @Override
    public String toString(){
        return this.title+bId+releaseDate.toString()+this.price+this.length ;
    }
}
