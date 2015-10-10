package emilianpukacz;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AppTest{
    App app;

    String przyklad ="kilka przyskladowych slow a a  aaa v s ss ddd";
    String filename = "przyklad.txt";

    @Before
    public void setUp(){
        this.app = new App();
    }

    @Test
    public void testGetFileFromResources() throws Exception {
        assertNull("file not found", app.getFileFromResources("ooos"));
        assertEquals(app.getFileFromResources(filename), przyklad);
    }

    /*
    Kilka komentarzy:
     - po pierwsze, twoja App ma metodę main(), która woła po kolei wszystkie metody, zbiera dane z klawiatury
      lub wypisuje zawartość na ekran. A nie jest testowana w ogóle
     - metoda main jedyne co powinna robić to tworzyć instancję App i uruchamiać ją (np. metoda process, run itp.)
     - metodę, którą testujesz, czyli getFileFromResources zrobiłeś publiczną by móc ją testować. To nie jest dobry
      pomysł by zmieniać enkapsujację tylko z powodu testu
     - nie testujesz tego co aplikacja robi, bo jedynie sprawdzasz czy pobiera się zawartość pliku
     - podpowiedzi: użyj Mockito by zasymulować Input i Output. Przekonfiguruj App by przyjmowała w konstruktorze
       input i output (np. BufferedReader i OutputStream) a w domyślnym konstruktorze używała domyślnych systemowych
       input i output
     - sprawdź czy na output wypisywane są odpowiednie rezultaty, czy aplikacja wypisuje na output to, co byś chciał
     - do testów użyj plików w katalogu test/resources

     */
}
