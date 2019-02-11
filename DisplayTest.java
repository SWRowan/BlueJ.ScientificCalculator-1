
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
        d.changeDisplay("300");
        d.setUnitsMode("degrees");
        
        d2.changeDisplay("0.0523599");
        d2.setUnitsMode("radians");

        // When
        d.switchUnitsMode();
        Double actual = Double.parseDouble(d.getCurrentDisplay());
        
        d2.switchUnitsMode();
        Double actual2 = Double.parseDouble(d2.getCurrentDisplay());
        
        // Then
        Assert.assertEquals((int)5.23599, (int)Math.round(actual * 100000) / 100000);
        Assert.assertEquals("radians", d.getUnitsMode());
       
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
       
        
        
        
        
        
        
    
   
    } @Test
    public void MultiplactionTest(){
        Display d = new Display();

        // Given
        double a = 10;
        double b = 3;

        // When
        double c = d.multiply(a, b);

        // Then
        Assert.assertEquals((int)30, (int)c);
        
    } @Test 
    public void DivisionTest(){
    Display d = new Display();
    
    //Given 
    double a = 10;
    double b = 5;
    
    //When
    double c = d.divide(a, b);
    
    //Then 
    Assert.assertEquals((int)2, (int)c);
    
    

} @Test
public void ModulousTest(){
    Display d = new Display();
    
    //Given 
    double a = 100;
    double b = 10;
    
    //When
    double c = d.modulous(a, b);
    
    //Then 
    Assert.assertEquals((int)0.000000, (int)c);
}@Test 
public void ExponentTest(){
    Display d = new Display();
    
    //Given 
    double a = 5;
    
   
    //When 
    double b = d.cos(a);
    
    
    // Then
    Assert.assertEquals((int)5, (int)a);
    
   
    
    
    
    
    
}@Test 
public void SquareRootTest(){
    Display d = new Display();
    
    //Given 
    double a = 5;
    
    //When
    double b = d.squareRoot(a);
    
    // Then
    Assert.assertEquals((int)5, (int)a);
}@Test 
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



}

    


    
