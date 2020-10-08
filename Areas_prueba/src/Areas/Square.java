package Areas;

public class Square extends Rectangle{

    public Square(double side){
        super(side,side);
    }

    @Override
    public String toString(){
        return "Square has a side of "+this.getbase()+ " and a total area of "+ super.area();
    }
}
