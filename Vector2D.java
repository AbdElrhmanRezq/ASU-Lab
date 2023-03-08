public class Vector2D {
    private double x;
    private double y;

    //Empty constructor
    Vector2D(){
        x=0.0;
        y=0.0;
    }

    //Constructor
    Vector2D(double x, double y){
        this.x=x;
        this.y=y;
    }

    //X setter
    void setX(double x){
        this.x=x;
    }

    //Y setter
    void setY(double y){
        this.y=y;
    }

    //X getter
    double getX(){
        return x;
    }

    //Y getterr
    double getY(){
        return y;
    }

    //Method to compute magnitude
    double magnitude(){
        return Math.pow(x, 2) + Math.pow(y,2);
    }

    //Method to compute angle
    double angle(){
        return Math.atan(y/x);
    }

    //print function with 2 forms 
    void print(){
        //created 2 var one for magnitude and other for angle
        double mag =magnitude();
        double angle = angle();
        System.out.printf("Form 1: %f i + %f j \nForm 2: Mag= %f , Angle= %f(rad)\n", x , y , mag, angle);
    }
    
    //Method for adding vec with current vec2
    Vector2D add(Vector2D vec2){
        Vector2D resultVec = new Vector2D();

        //get method will be used here
        resultVec.setX(this.x + vec2.getX());
        resultVec.setY(this.y + vec2.getY());
        return resultVec;
    }

    //Method for subtracting vec with vec2
    Vector2D sub(Vector2D vec2){
        Vector2D resultVec = new Vector2D();

        //get method will be used here
        resultVec.setX(this.x - vec2.getX());
        resultVec.setY(this.y - vec2.getY());
        return resultVec;
    }



}
