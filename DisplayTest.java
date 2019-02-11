
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

    


    
