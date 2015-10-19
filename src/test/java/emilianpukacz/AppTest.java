package emilianpukacz;

import org.mockito.Mockito;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.OutputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AppTest extends Mockito{
    String przyklad ="test 1 2 3";
    String filename = "przykladTestowy.txt";
    BufferedReader input;
    OutputStream output;

    @Test
    public void testAppDefault() throws Exception {
        App app = new App();
    }
    @Test
    public void testAppParameter() throws Exception {
        BufferedReader input = mock(BufferedReader.class);
        OutputStream  output = mock(OutputStream.class);
        when(input.readLine());
        App app = new App(input, output);

    }




    /*
    Kilka komentarzy:
     - podpowiedzi: użyj Mockito by zasymulować Input i Output. Przekonfiguruj App by przyjmowała w konstruktorze
       input i output (np. BufferedReader i OutputStream) a w domyślnym konstruktorze używała domyślnych systemowych
       input i output
     - sprawdź czy na output wypisywane są odpowiednie rezultaty, czy aplikacja wypisuje na output to, co byś chciał
     - do testów użyj plików w katalogu test/resources

     */
}
