import javafx.geometry.Point2D;
public class Line2D {
    private Point2D point;
    private Vector2D vec;

    //Empty Construcor
    Line2D(){
        point = new Point2D(0,0);
        vec = new Vector2D(0,0);
    }
    //Constructor
    Line2D(double px, double py, double vx, double vy){
        point = new Point2D(px , py);
        vec = new Vector2D(vx,vy);
    }
    public void print(){
        double px=point.getX();
        double py=point.getY();
        double vx=vec.getX();
        double vy=vec.getY();
        System.out.printf("Position: X=%f , Y=%f\nDirection: X=%f , Y=%f",px,py,vx,vy);
    }

}
