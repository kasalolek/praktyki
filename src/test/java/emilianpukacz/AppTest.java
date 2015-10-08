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

}
