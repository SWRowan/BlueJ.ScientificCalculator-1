
import org.junit.Assert;
import org.junit.Test;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * The test class DisplayTest.
 *
 * @author Cara Eppes, Sean Rowan, Zaina King, Reese Watson
 * @version 2/11/2019
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

    @Test
    public void AdditionTest(){

        Display d = new Display();

        // Given
        double a = 10;
        double b = 3;

        // When
        double c = d.add(a, b);

        // Then
        Assert.assertEquals((int)13, (int)c);
    }

    @Test
    public void SubtractTest(){
        Display d = new Display();

        // Given
        double a = 15;
        double b = 5;

        // When
        double c = d.subtract(a, b);
        // Then
        Assert.assertEquals((int)10, (int)c);
    } 

    @Test
    public void SwitchUnitsModeTest(){
        Display d = new Display();
        Display d2 = new Display();

        // Given
        double a = 300;
        d.changeDisplay("" + a);
        d.setUnitsMode("degrees");

        double b = 0.0523599;
        d2.changeDisplay("" + b);
        d2.setUnitsMode("radians");

        // When
        d.switchUnitsMode();
        Double actual = Double.parseDouble(d.getCurrentDisplay());

        d2.switchUnitsMode();
        Double actual2 = Double.parseDouble(d2.getCurrentDisplay());

        // Then
        Assert.assertEquals(Math.toRadians(a), actual, .001);
        Assert.assertEquals("radians", d.getUnitsMode());
        Assert.assertEquals(b + Math.PI/180, actual2, .001);
        Assert.assertEquals("degrees", d2.getUnitsMode());

    }

    @Test 
    public void switchDisplayMode(){
        Display d = new Display();
        Display d2= new Display();

        //Given
        d.changeDisplay("45");
        d.setCurrentDisplayMode("decimal");

        d2.changeDisplay("101101");
        d2.setCurrentDisplayMode("binary");

        // When
        d.switchDisplayMode();
        Integer actual = Integer.parseInt(d.getCurrentDisplay());

        d2.switchDisplayMode();
        Integer actual2 = Integer.parseInt(d2.getCurrentDisplay());

        // Then
        Assert.assertEquals("101101", Integer.toBinaryString(45));
        Assert.assertEquals("101101", d.getCurrentDisplay());
    } 

    @Test
    public void MultiplicationTest(){
        Display d = new Display();

        // Given
        double a = 10;
        double b = 3;

        // When
        double c = d.multiply(a, b);

        // Then
        Assert.assertEquals((int)30, (int)c);

    } 

    @Test 
    public void DivisionTest(){
        Display d = new Display();

        //Given 
        double a = 10;
        double b = 5;

        //When
        double c = d.divide(a, b);

        //Then 
        Assert.assertEquals((int)2, (int)c);


    } 

    @Test
    public void ModulusTest(){
        Display d = new Display();

        //Given 
        double a1 = 100;
        double a2 = 10;
        double b1 = 11;
        double b2 = 2;

        //When
        double expA = d.modulus(a1, a2);
        double expB = d.modulus(b1, b2);

        //Then 
        Assert.assertEquals(0, expA, .001);
        Assert.assertEquals(1, expB, .001);
    }

    @Test 
    public void ExponentTest(){
        Display d = new Display();

        //Given 
        double a1 = 5;
        double a2 = 3;
        double b1 = 1;
        double b2 = 0;
        double c1 = -3;
        double c2 = 3;

        //When 
        double expA = d.exponent(a1, a2);
        double expB = d.exponent(b1, b2);
        double expC = d.exponent(c1, c2);

        // Then
        Assert.assertEquals(Math.pow(a1, a2), expA, .001);
        Assert.assertEquals(Math.pow(b1, b2), expB, .001);
        Assert.assertEquals(Math.pow(c1, c2), expC, .001);

    
    
    }

    @Test 
    public void SquareRootTest(){
        Display d = new Display();

        //Given 
        double a = 5;

        //When
        double b = d.squareRoot(a);

        // Then
        Assert.assertEquals(Math.sqrt(a), b, .001);
    }

    @Test 
    public void MemoryTest(){
        Display d = new Display();

        //Given 
        d.setMemoryValue("9");

        //Then
        Assert.assertEquals("9", d.getMemoryValue());
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
    public void CosTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.cos(x);
        double expY = d.cos(y);
        double expZ = d.cos(z);

        // Then
        Assert.assertEquals(Math.cos(0), expX, .001);
        Assert.assertEquals(Math.cos(30), expY, .001);
        Assert.assertEquals(Math.cos(-30), expZ, .001);

    }

    @Test
    public void CoshTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.cosh(x);
        double expY = d.cosh(y);
        double expZ = d.cosh(z);

        // Then
        Assert.assertEquals(Math.cosh(0), expX, .001);
        Assert.assertEquals(Math.cosh(30), expY, .001);
        Assert.assertEquals(Math.cosh(-30), expZ, .001);

    }

    @Test
    public void AcosTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.acos(x);
        double expY = d.acos(y);
        double expZ = d.acos(z);

        // Then
        Assert.assertEquals(Math.acos(0), expX, .001);
        Assert.assertEquals(Math.acos(30), expY, .001);
        Assert.assertEquals(Math.acos(-30), expZ, .001);

    }

    @Test
    public void TanTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.tan(x);
        double expY = d.tan(y);
        double expZ = d.tan(z);

        // Then
        Assert.assertEquals(Math.tan(0), expX, .001);
        Assert.assertEquals(Math.tan(30), expY, .001);
        Assert.assertEquals(Math.tan(-30), expZ, .001);

    }

    @Test
    public void AtanTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.atan(x);
        double expY = d.atan(y);
        double expZ = d.atan(z);

        // Then
        Assert.assertEquals(Math.atan(0), expX, .001);
        Assert.assertEquals(Math.atan(30), expY, .001);
        Assert.assertEquals(Math.atan(-30), expZ, .001);

    }

    @Test
    public void TanhTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.tanh(x);
        double expY = d.tanh(y);
        double expZ = d.tanh(z);

        // Then
        Assert.assertEquals(Math.tanh(0), expX, .001);
        Assert.assertEquals(Math.tanh(30), expY, .001);
        Assert.assertEquals(Math.tanh(-30), expZ, .001);

    }

    @Test
    public void CubicRootTest(){

        // Given
        Display d = new Display();
        double x = 0;
        double y = 30;
        double z = -30;

        // When
        double expX = d.cubicRoot(x);
        double expY = d.cubicRoot(y);
        double expZ = d.cubicRoot(z);

        // Then
        Assert.assertEquals(Math.cbrt(0), expX, .001);
        Assert.assertEquals(Math.cbrt(30), expY, .001);
        Assert.assertEquals(Math.cbrt(-30), expZ, .001);

    }

    @Test
    public void ThetaTest(){

        // Given
        Display d = new Display();
        double x = 1;
        double x2 = 1;
        double y = 0;
        double y2 = 1;
        double z = 2;
        double z2 = 0;

        // When
        double expX = d.theta(x, x2);
        double expY = d.theta(y, y2);
        double expZ = d.theta(z, z2);

        // Then
        Assert.assertEquals(Math.atan2(x2, x), expX, .001);
        Assert.assertEquals(Math.atan2(y2, y), expY, .001);
        Assert.assertEquals(Math.atan2(z2, z), expZ, .001);
    }
    
    @Test
    public void InverseTest(){
    
    // Given
    Display d = new Display();
    double x = -3;
    double y = .4;
    double z = 5;
    
    // When
    double expX = d.inverse(x);
    double expY = d.inverse(y);
    double expZ = d.inverse(z);
    
    // Then
    Assert.assertEquals(-0.333333, expX, .001);
    Assert.assertEquals(2.5, expY, .001);
    Assert.assertEquals(.2, expZ, .001);
      
    }

    @Test
    public void InvertSignTest(){
    
        // Given
        Display d = new Display();
        double x = 0;
        double y = -3;
        double z = 3;
        
        // When
        double expX = d.invertSign(x);
        double expY = d.invertSign(y);
        double expZ = d.invertSign(z);
        
        // Then
        Assert.assertEquals(0, expX, .001);
        Assert.assertEquals(3, expY, .001);
        Assert.assertEquals(-3, expZ, .001);
    }

    @Test
    public void FactorialTest(){
        
        // Given
        Display d = new Display();
        double x = 5;
        double y = 0;
        
        // When
        double expX = d.factorial(x);
        double expY = d.factorial(y);
        
        // Then
        Assert.assertEquals(120, expX, .001);
        Assert.assertEquals(1, expY, .001);
        
    }
    
    @Test
    public void GCDTest(){
        
        // Given
        Display d = new Display();
        double x1 = 123;
        double x2 = 33;
        double y1 = 1;
        double y2 = 42343;
        double z1 = 57;
        double z2 = 32;
        
        // When
        double expX = d.gcd(x1, x2);
        double expY = d.gcd(y1, y2);
        double expZ = d.gcd(z1, z2);
        
        // Then
        Assert.assertEquals(3, expX, .001);
        Assert.assertEquals(1, expY, .001);
        Assert.assertEquals(1, expZ, .001);
        
    }
    
    @Test
    public void LCMTest(){
        
        // Given
        Display d = new Display();
        double x1 = 10;
        double x2 = 5;
        double y1 = 1;
        double y2 = 50;
        double z1 = 43;
        double z2 = 53;
        
        // When
        double expX = d.lcm(x1, x2);
        double expY = d.lcm(y1, y2);
        double expZ = d.lcm(z1, z2);
        
        // Then
        Assert.assertEquals(10, expX, .001);
        Assert.assertEquals(50, expY, .001);
        Assert.assertEquals(2279, expZ, .001);
    }
  
}


    
