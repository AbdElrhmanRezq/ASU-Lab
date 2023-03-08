public class tester {
    public static double avg(Vector2D vec[]){
        double avg=0;
        for (int i=0;i<vec.length;i++){
            avg+=vec[i].magnitude();
        }
        avg/=vec.length;
        return avg;
    }
}
