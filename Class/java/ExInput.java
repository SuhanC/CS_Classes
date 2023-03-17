import java.io.*;
public class ExInput {
    public static void main(String args[]) throws IOException{
        char cInput=0;
        int i;
        System.out.print("Input a character: ");
        cInput = (char)System.in.read();
        System.out.println(cInput);
        i = System.in.read();
        System.out.println(i);
        i = System.in.read();
        System.out.println(i);
        System.out.println(System.in.available());
    }
}
