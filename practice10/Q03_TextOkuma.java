package practiceAdvanced.practice10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q03_TextOkuma {
    ////Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.

    public static void main(String[] args) throws IOException {

        BufferedReader file=new BufferedReader(new FileReader("src/main/java/practiceAdvanced/practice10/hello"));

        file.readLine();
        file.readLine();
        String line3=file.readLine();
        String [] arr=line3.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        //Son satırı okutma...
        String line = null;
        while (file.readLine() != null) {
            line = file.readLine();
        }
        System.out.println(line);
    }
}
