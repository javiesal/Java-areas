package Areas;

public class Rectangle extends GeometrycalForms{
    private double base;
    private double height;
    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double area(){
        return base*height;
    }

    public double getbase(){
        return this.base;
    }
    @Override
    public String toString(){
        return "Rectangle has a base of "+this.base+" and a height of "+this.height+ " and a total area of "+this.area();
    }
}
