package emilianpukacz;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest{
    App app;

String przyklad ="kilka przyskladowych slow a a  aaa v s ss ddd";
String filename = "przyklad.txt";
    @Before
    public void setUp(){
        this.app = new App();
    }


    @Test
    public void testMain() throws Exception {

    }

    @Test
    public void testGetFileFromResources() throws Exception {
        assertEquals(app.getFileFromResources(filename), przyklad);
    }
    @Test
    public void testFileNotFound() throws Exception {

        //assertEquals(app.getFileFromResources("ooos"), );
    }
}
