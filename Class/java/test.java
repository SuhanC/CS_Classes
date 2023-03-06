import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    String[] productsName = new String[]{"bag", "mouse","note"};

    Arrays.sort(productsName);

    for(int i =0;i < productsName.length; i++){
      System.out.println(productsName[i]+ " ");
    }
  }
}