public class A{
    public void problem() throws RuntimeException{
        throw new RuntimeException();
    }
    public void tryThis(){
        try{
            problem();
            System.out.print("1");
        } catch (RuntimeException x){
            System.out.print("2");
        } catch (Exception x){
            System.out.print("3");
        } finally {
            System.out.print("4");
    }
    System.out.print("5");
}
public static void main (String[] args){
    A a = new A();
    a.tryThis();
    }
}