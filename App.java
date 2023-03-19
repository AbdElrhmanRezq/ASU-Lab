import java.time.LocalDate;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Digital Books count: ");
        int dBooks = input.nextInt();
        System.out.printf("\nEnter Text Books count: ");
        int tBooks = input.nextInt();
        System.out.printf("\n");
        BookStore store=new BookStore(dBooks,tBooks);
        store.printStore();
        /*System.out.println(store.retDString(0));
        System.out.println(store.retDString(1));
        System.out.println(store.retTString(0));
        System.out.println(store.retDEquals(0,1));*/
        //System.out.println(store.retTEquals(1));
    }
}
