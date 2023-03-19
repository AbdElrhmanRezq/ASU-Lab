import java.util.Scanner;
import java.time.LocalDate;
public class BookStore {
    private int dBooksCount;
    private int tBooksCount;
    private DigitalBook[] dBooks;
    private TextBook[] tBooks;
    BookStore(){
        dBooksCount=1;
        tBooksCount=1;
    }
    BookStore(int dBooksCount,int tBooksCount){

        this.dBooksCount=dBooksCount;
        this.tBooksCount=tBooksCount;

        tBooks=new TextBook[tBooksCount];
        dBooks=new DigitalBook[dBooksCount];

        Scanner scan=new Scanner(System.in);
        System.out.printf("Digital Books count:%d , Text Book count:%d \n\n",dBooksCount,tBooksCount);
        System.out.printf("Enter Digital Books:\n");
        for(int i=0;i<dBooksCount;i++){

            System.out.printf("\nEnter Book No.:%d\n",i+1);
            System.out.printf("Enter title:\n");
            String title=new String(scan.nextLine());

            System.out.printf("Enter LocalDate in string YYYY-MM-DD :\n");
            LocalDate releaseDate=LocalDate.parse(scan.nextLine());

            System.out.printf("Enter price:\n");
            double price=scan.nextDouble();
            System.out.printf("Enter length:\n");
            double length=scan.nextDouble();
            DigitalBook test= new DigitalBook(length,title,releaseDate,price);
            dBooks[i]=test;
            scan.nextLine();
        }
        System.out.printf("\nEnter Text Books:\n");
        for(int i=0;i<tBooksCount;i++){
            System.out.printf("\nEnter Book No.:%d\n",i+1);
            System.out.printf("Enter title:\n");
            String title=scan.nextLine();

            System.out.printf("Enter LocalDate in string YYYY-MM-DD :\n");
            LocalDate releaseDate=LocalDate.parse(scan.nextLine());

            System.out.printf("Enter price:\n");
            double price=scan.nextDouble();
            System.out.printf("Enter Pages:\n");
            int pages=scan.nextInt();
            TextBook test= new TextBook(pages,title,releaseDate,price);
            tBooks[i]=test;
            scan.nextLine();
        }
        System.out.printf("\n****Finished Initializing****\n");
        scan.close();
    }
    public void printStore(){
        for(int i=0;i<dBooksCount;i++){
            dBooks[i].print();
        }
        for(int i=0;i<tBooksCount;i++){
            tBooks[i].print();
        }
    }
    //Next 4 functions just call another functions from the DigtalBook and TextBook classes
    //Except for retTEquals and retDEquals you send 2 index to them and they compare the classes if presented
    public String retDString(int index){
        return dBooks[index].toString();
    }
    public String retTString(int index){
        return tBooks[index].toString();
    }
    public boolean retDEquals(int indexMain, int indexSecond){
        if(indexMain>dBooksCount || indexSecond>dBooksCount)
        return false;
        return dBooks[indexMain].equals(dBooks[indexSecond]);
    }
    public boolean retTEquals(int indexMain, int indexSecond){
        if(indexMain>tBooksCount || indexSecond>tBooksCount)
        return false;
        return tBooks[indexMain].equals(tBooks[indexSecond]);
    }
    
}
