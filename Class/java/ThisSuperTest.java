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
class CSuper{
    public double x;
}

class CSub extends CSuper{
    public double x;
    public CSub(double new_x){
        this.x=new_x;
        super.x=new_x*10;  
    }
    public double getSuper(){
        return super.x;
    }
    public double getSub(){
        return this.x;
    }
}

public class ThisSuperTest{
    public static void main(String args[]){
        CSub sub = new CSub(10.0);
        System.out.println(sub.x);
        System.out.println(sub.getSuper());
        System.out.println(sub.getSub());
    }
}
