public class App {
    public static void main(String[] args) throws Exception {
        Vector2D vec= new Vector2D();
        vec.setX(1.0);
        vec.setY(2.0);
        Vector2D vec2= new Vector2D(3,4);
        Vector2D vec3 =vec.add(vec2);
        vec3.print();

        Vector2D vecArr[]={vec,vec2,vec3};

        System.out.printf("The Magnitude avg will be:");
        System.out.println(tester.avg(vecArr));
        

    }
}
