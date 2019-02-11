
import org.junit.Assert;
import org.junit.Test;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * The test class DisplayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DisplayTest {

    @Test
    public void DisplayConstructorTest(){

        // Given
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);

        // When 
        Display display = new Display(scanner, printStream);
        Scanner retrievedScanner = display.getScanner();
        PrintStream retrievedPrintStream = display.getPrintStream();

        //Then
        Assert.assertEquals(scanner, retrievedScanner);
        Assert.assertEquals(printStream, retrievedPrintStream);
    }

    
    @Test
    public void SinTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.sin(x);
        double expY = d.sin(y);
        double expZ = d.sin(z);

        // Then
        Assert.assertEquals(Math.sin(0), expX, .001);
        Assert.assertEquals(Math.sin(30), expY, .001);
        Assert.assertEquals(Math.sin(-30), expZ, .001);

    }

    @Test
    public void SinhTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.sinh(x);
        double expY = d.sinh(y);
        double expZ = d.sinh(z);

        // Then
        Assert.assertEquals(Math.sinh(0), expX, .001);
        Assert.assertEquals(Math.sinh(30), expY, .001);
        Assert.assertEquals(Math.sinh(-30), expZ, .001);
    }

    @Test
    public void AsinTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.asin(x);
        double expY = d.asin(y);
        double expZ = d.asin(z);

        // Then
        Assert.assertEquals(Math.asin(0), expX, .001);
        Assert.assertEquals(Math.asin(30), expY, .001);
        Assert.assertEquals(Math.asin(-30), expZ, .001);
    }

}
