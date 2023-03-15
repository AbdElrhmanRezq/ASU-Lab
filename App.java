public class App {
    public static void main(String[] args) throws Exception {
        //Declaring vectors
        Vector2D vec1 = new Vector2D(2.0, 3.0);
        Vector2D vec2 = new Vector2D();
        //vec2.read();
        //vec2.print();

        //Testing sub and add methods
        Vector2D vec3 = Vector2D.add(vec1,vec2);
        Vector2D vec4 = Vector2D.sub(vec1,vec2);

        //System.out.println("Vector 3 result: ");
        //vec3.print();
        //System.out.println("Vector 4 result: ");
        //vec4.print();

        Line2D line = new Line2D(1,2,3,4);
        //line.print();

        //MyStingBuffer test
        MyString strbfr1= new MyString("Hello");
        System.out.println("String is:");
        strbfr1.print();
        System.out.println("\nIndex:");
        System.out.println(strbfr1.indexOf('e'));
        System.out.println("Length:");
        System.out.println(strbfr1.length());
        MyString ms1 =strbfr1.erase(1,2);
        System.out.println("String after erase is:");
        ms1.print();
        
        System.out.println("\nString after insert is:");
        MyString ms2 = strbfr1.insert(1,"el");
        ms2.print();
    }
}
