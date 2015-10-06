package emilianpukacz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

// FIXME: Ten test kompletnie nic nie robi. Poszukaj czym są w ogóle unit testy i jak
    // testuje się kod z użyciem biblioteki Mockito
    // Nie przechodź dalej jeśli nie napiszesz poprawnych testów
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
