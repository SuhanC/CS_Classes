import java.io.*;

public class ExceptionTest1 {
    public static void main(String args[]){
        int b=0;
        try{
            b = System.in.read();
        } catch (IOException ex){
            System.out.println(ex);
        }
        System.out.println((char)b);
    }
}