package emilianpukacz;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Scanner;

public class App 
{
    BufferedReader input;
    OutputStream output;

    public App( BufferedReader input , OutputStream output) {
        this.input = input;
        this.output = output;
        run();
    }
    public App()  {
       try{ this.input = new BufferedReader(new InputStreamReader(System.in));
       }catch (Exception e){}
        this.output = System.out;
        run();
    }


    private void run(){
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            String zawartoscPliku = IOUtils.toString(classLoader.getResourceAsStream(input.toString()));
            output.write(StringUtils.deleteWhitespace(zawartoscPliku).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
