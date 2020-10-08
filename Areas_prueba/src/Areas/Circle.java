package Areas;

public class Circle extends Ellipse {

    public Circle (double radius){

        super(radius,radius);
    }

    @Override
    public String toString(){
        return "Circle has radius "+ this.getradiusa()+" and a total area of "+super.area();
    }
}
