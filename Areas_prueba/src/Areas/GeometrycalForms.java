package Areas;

public abstract class GeometrycalForms implements Comparable<GeometrycalForms>{
    public abstract double area();
    public int compareTo(GeometrycalForms f){
        return (int)(this.area()-f.area());
    }
}
