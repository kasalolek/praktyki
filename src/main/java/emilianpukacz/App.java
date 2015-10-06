package emilianpukacz;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput = new Scanner(System.in);
        String filename = keyboardInput.nextLine();

        App obj = new App();
        String zawartoscPliku = obj.getFileFromResources(filename);
        System.out.println("oryginal: "+zawartoscPliku);
        String zawartoscPlikuBezSpacji = StringUtils.deleteWhitespace(zawartoscPliku);
        System.out.println("bez spacji: "+zawartoscPlikuBezSpacji);
    }

    private String getFileFromResources(String filename){
        ClassLoader classLoader = getClass().getClassLoader();
        String zawartoscPliku = "";
        try {
            zawartoscPliku = IOUtils.toString(classLoader.getResourceAsStream(filename));

        }catch(FileNotFoundException fe){System.out.println("nie znaleziono pliku: "+ filename );}
        catch(Exception e){
            // FIXME: Wypisanie wyjątku na konsolę jest kiepskim ruchem - w przypadku testu czy aplikacji
            // bez konsoli spowoduje, że nie będziesz wiedzieć co się stało - wyjątek zostanie 'połknięty'
            // To samo w sumie tyczy się wyjątku powyżej
            e.printStackTrace();
        }
        return zawartoscPliku;
    }
}
