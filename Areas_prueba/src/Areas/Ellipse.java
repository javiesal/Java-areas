package Areas;

public class Ellipse extends GeometrycalForms {// Definir que hereda de GeometrycalForms

    private double radiusa; //Atributos de la clase Ellipse
    private double radiusb; //Atributos de la clase Ellipse

    public Ellipse (double radiusa,double radiusb){//Método para crear nueva clase tipo Ellipse
        this.radiusa = radiusa;
        this.radiusb = radiusb;
    }

    public double area(){
        return Math.PI*radiusa*radiusb;
    }

    public double getradiusa(){ //Método get para la clase Circle
        return this.radiusa;
    }

    @Override// Fuerza crear el método de nuevo
    public String toString(){// Plot de texto diciendo radios y area
        return "Ellpise has radius a and b of "+this.radiusa+" and "+this.radiusb+" and an area of "+this.area();
    }
}
