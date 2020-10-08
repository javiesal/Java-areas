package Areas;

public class Triangle extends GeometrycalForms {
    private double base;
    private double height;

    public Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return this.base*this.height/2;
    }

    @Override
    public String toString(){
        return "Triangle has a base of "+this.base+" and a height of "+this.height+ " and a total area of "+this.area();
    }
}
