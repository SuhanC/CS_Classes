class Circle{
    static double PI=3.14;
    double radius;
    public double getArea(){
        return this.radius*this.radius*PI;

    }
    public void display(){
        System.out.println("반지름:"+this.radius+"면적:"+this.getArea());
    }
}

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        super()
        height=1.0;
    }
    public Cylinder(double radius, double h){
        super(radius);
        this.height=h;
    }
    public couble getHeight(){
        return height;
    }
    public void setHeight(double h){
        this.height=h;

    }
    public double getArea(){
        return 2*PI*getRadius()*height+2*super.getArea()l
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    public String toString(){
        return getRadius() + height
    }
}