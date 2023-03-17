import java.beans.beancontext.BeanContextChildSupport;
import java.io.*;
public class ExInout4 {
    public static void main(String args[]) throws IOException {
    String szInputLine;
    int nValue;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader is = new BufferedReader(isr);
    System.out.print("Input a number : ");
    szInputLine = is.readLine();
    nValue = Integer.parseInt(szInputLine);
    System.out.println(nValue);
    is.close();
    }
}
