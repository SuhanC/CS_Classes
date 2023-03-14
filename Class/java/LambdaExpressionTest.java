interface Addable{
    int add(int a, int b);
}

public class LambdaExpressionTest{
    public static void main(String[] args){
        Addable ad1 = new Addable(){
            public int add(int a, int b){
                return(a+b);
            }
        };
        System.out.println(ad1.add(100,200));

        Addable ad2 = (int a, int b)->{
            return(a+b);
        };
        System.out.println(ad2.add(10,20));
        Addable ad3 = (a,b) ->(a+b);
        System.out.println(ad3.add(1,2));
    }
}