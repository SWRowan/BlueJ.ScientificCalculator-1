
/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.InputStream; 
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Display {

    private final Scanner scanner; 
    private final PrintStream out;
    private String currentDisplay = "0";
    private String memoryValue = "0";
    private String currentDisplayMode = "decimal";
    private String currentUnitsMode = "degrees";

    public Display() {// Displaying 
        this(System.in, System.out);
    }

    public Display(InputStream inputStream, OutputStream outputStream) {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public Display(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) {
        out.format(val, args); // 
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    // This prints out a line

    public void println(String val, Object... args) {
        print(val + "\n", args); 
    }

    public Scanner getScanner(){
        return this.scanner;
    }

    public PrintStream getPrintStream(){
        return this.out;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    
    public Double getDoubleInput(String prompt, Object... args) {
        println(prompt);
        return this.scanner.nextDouble();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        println(prompt);
        return this.scanner.next();
    }

    // This gets the currentDisplay variable
    public String getCurrentDisplay(){
        return this.currentDisplay;
    }
    
    //This clears the display back to zero

    public void clearDisplay(){
        this.currentDisplay = "0";
    }
    
    // This changes the display from the current display

    public void changeDisplay(String s){
        this.currentDisplay = s;
    }
    
    
    public double add(double x, double y){
        return x + y;

    }
    
      
    // When using the Switch method is converting different operators


    public void switchDisplayMode(){
        switch(currentDisplayMode){
            case "decimal" : currentDisplayMode = "binary";
            Integer intValueBinary = (int)Math.round(Double.valueOf(currentDisplay));
            currentDisplay = Integer.toBinaryString(intValueBinary);
            print("Binary: ");
            break;

            case "binary" : currentDisplayMode = "octal";
            Integer intValueOctal = (int)Math.round(Double.valueOf(currentDisplay));
            currentDisplay = Integer.toOctalString(intValueOctal);
            print("Octal: ");
            break;

            case "octal" : currentDisplayMode = "hexadecimal";
            Integer intValueHex = (int)Math.round(Double.valueOf(currentDisplay));
            currentDisplay = Integer.toHexString(intValueHex);
            print("Hexadecimal: ");
            break;

            case "hexadecimal" : currentDisplayMode = "decimal";
            print("Decimal: ");

            break;
        }
    }

    public void switchDisplayMode(String mode){
        switch(mode){
            case "binary" : this.currentDisplayMode = "decimal";
            this.switchDisplayMode();
            break;

            case "octal" : this.currentDisplayMode = "binary";
            switchDisplayMode();
            break;

            case "hex" : this.currentDisplayMode = "octal";
            switchDisplayMode();
            break;
        }
    }

    public void setCurrentDisplayMode(String mode){
        this.currentDisplayMode = mode;
    }
   
    //Memory saves previous value from input

    public void setMemoryValue(String s){
        this.memoryValue = s;
    }
    
    // This gives back the value that was saved

    public String getMemoryValue(){
        return this.memoryValue;
    }
    
    

    public void switchUnitsMode(){
        Double doubleValue = Double.valueOf(currentDisplay);
        switch(currentUnitsMode){
            case "degrees" : this.currentUnitsMode = "radians";
            Double doubleRadians = Math.toRadians(doubleValue);
            currentDisplay = doubleRadians.toString();
            print("Radian value: ");
            break;

            case "radians" : this.currentUnitsMode = "degrees";
            Double doubleDegrees = doubleValue + Math.PI/180;
            currentDisplay = doubleDegrees.toString();
            print("Degree value: ");
            break;
        }

    }
    
    public void switchUnitsMode(String mode){
        switch(mode){
            case "degrees" : this.currentUnitsMode = "radians";
            this.switchUnitsMode();
            break;
            
            case "radians" : this.currentUnitsMode = "degrees";
            this.switchUnitsMode();
            break;
            
        }
        
    }
    
    public void setUnitsMode(String mode){
        this.currentUnitsMode = mode;

    }
    
    public String getUnitsMode(){
        return this.currentUnitsMode;
    }
     // This is all the operations
    public double subtract(double x, double y){
        return x - y;
    }
    
    public double multiply(double x, double y){
        return x * y;
    } 
    
    public double divide(double x, double y){
        return x / y;
    }
    
    public double modulous(double x, double y){
        return x % y;
    }
    
    public double exponent(double x, double y){
        return Math.pow(x, y);
    }
    
    public double squareRoot(double x){
        return Math.sqrt(x);
    }
    
    public double sin(double x){
        return Math.sin(x);
    }
    
    public double asin(double x){
        return Math.asin(x);
    }
    
    public double cos(double x){
        return Math.cos(x);
    }
    
    public double cosh(double x){
        return Math.cosh(x);
    }
    
    public double sinh(double x){
        return Math.sinh(x);
    }

    public double acos(double x){
        return Math.acos(x);
    }
    
    public double tan(double x){
        return Math.tan(x);
    }
    
    public double atan(double x){
        return Math.atan(x);
    }
    
    public double tanh(double x){
        return Math.tanh(x);
    }
    
    public double theta(double x, double y){
        return Math.atan2(y,x);
    }
    
    public double cubicRoot(double x){
        return Math.cbrt(x);
    }
     // SuperCalc is the controller and where all the operators will be assigned
    public void superCalc(){
    boolean run = true;
        Display display = new Display();
        display.println("TIME TO CALCULATE!");
        Double x = display.getDoubleInput("Enter a number");

        while (run){

            String s = display.getStringInput("\nEnter an operator");
            s = s.toLowerCase();
            
            Double result = 0.0;

            switch(s){
                case "+" : 
                case "add" : 
                case "sum" :
                case "plus": 
                double addY = display.getDoubleInput("Enter another number");
                result = display.add(x, addY);
                display.println("%f %s %f = %f", x, s, addY, result);
                display.changeDisplay(result.toString());

                break;

                case "-": 
                case "subtract": 
                case "minus":
                double subY = display.getDoubleInput("Enter another number");
                result = display.subtract(x, subY);
                display.println("%f %s %f = %f", x, s, subY, result);
                display.changeDisplay(result.toString());

                break;

                case "/":
                case "divide":
                case "divided by":
                double divY = display.getDoubleInput("Enter another number");
                result = display.divide(x, divY);
                display.println("%f %s %f = %f", x, s, divY, result);
                display.changeDisplay(result.toString());

                break;

                case "*" :
                case "times":
                case "multiply":
                double multiY = display.getDoubleInput("Enter another number");
                result = display.multiply(x, multiY);
                display.println("%f %s %f = %f", x, s, multiY, result);
                display.changeDisplay(result.toString());

                break;

                case "%" :
                case "mod":
                case "remainder":
                double modY = display.getDoubleInput("Enter another number");
                result = display.modulous(x, modY);
                display.println("%f %s %f = %f", x, s, modY, result);
                display.changeDisplay(result.toString());

                break;

                case "^" : 
                double expoY = display.getDoubleInput("Enter another number");
                result = display.exponent(x, expoY);
                display.println("%f %s %f = %f", x, s, expoY, result);
                display.changeDisplay(result.toString());

                break;

                case "sin": 
                result = display.sin(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "asin": 
                result = display.asin(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "sinh": 
                result = display.sinh(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "cos": 
                result = display.cos(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "acos": 
                result = display.acos(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "cosh": 
                result = display.cosh(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "tan": 
                result = display.tan(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "atan": 
                result = display.atan(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "tanh": 
                result = display.tanh(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "theta":
                double thetaY = display.getDoubleInput("Enter another number");
                result = display.theta(thetaY, x);
                display.println("%f %s %f = %f", thetaY, s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "sqrt":
                case "root":
                case "square root":
                result = display.squareRoot(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "cbrt":
                result = display.cubicRoot(x);
                display.println("%s %f = %f", s, x, result);
                display.changeDisplay(result.toString());

                break;

                case "changebase" : 
                while(s.equals("changebase")){
                    display.changeDisplay("" + x);
                    display.switchDisplayMode();
                    display.println(display.getCurrentDisplay() + "\n");
                    s = display.getStringInput("Enter \"changebase\" to switch mode again or enter \"back\" to go back to calculator\n");
                }
                break;

                case "binary" : 
                display.changeDisplay("" + x);
                display.switchDisplayMode(s);
                display.println(display.getCurrentDisplay() + "\n");

                break;

                case "octal" : 
                display.changeDisplay("" + x);
                display.switchDisplayMode(s);
                display.println(display.getCurrentDisplay() + "\n");

                break;

                case "hex" : 
                display.changeDisplay("" + x);
                display.switchDisplayMode(s);
                display.println(display.getCurrentDisplay() + "\n");

                break;

                case "m+" :
                display.changeDisplay("" + x);
                display.setMemoryValue(display.getCurrentDisplay());
                display.println("%s has been saved to memory.", display.getMemoryValue()); 

                break;

                case "m-" :
                display.setMemoryValue("0");
                display.println("The memory value has been reset to %s", display.getMemoryValue()); 

                break; 

                case "mrc" :
                display.changeDisplay(display.getMemoryValue());
                display.println(display.getCurrentDisplay());

                break;

                case "changeunits" :
                while (s.equals("changeunits")){
                    display.changeDisplay("" + x);
                    display.switchUnitsMode();
                    display.println(display.getCurrentDisplay() + "\n");
                    s = display.getStringInput("Enter \"changeunits\" to switch mode again or enter \"back\" to go back.\n");
                }
                break;

                case "degrees" :
                display.changeDisplay("" + x);
                display.switchUnitsMode(s);
                display.println(display.getCurrentDisplay() + "\n");

                break;

                case "radians" :
                display.changeDisplay("" + x);
                display.switchUnitsMode(s);
                display.println(display.getCurrentDisplay() + "\n");

                break;
                
                default : result = 0.0;
            }

            String m = display.getStringInput("Enter 'm+' to save the value.  Enter 'c' to clear");
            if(m.equals("m+")){
                display.setMemoryValue(display.getCurrentDisplay());
                display.println("%s has been saved to memory.", display.getMemoryValue()); 
            }
            
            String quit = display.getStringInput("Enter 'quit' to stop, 'mrc' to use saved value, or enter another number");

            
            
            if (quit.equals("quit")){
                run = false; 
            }
            
            
            if(run){
                if(quit.equals("mrc")){
                    x = Double.valueOf(display.getMemoryValue());
                    display.println(display.getMemoryValue());
                }
                else{
                    x = Double.valueOf(quit);
                }
                display.setCurrentDisplayMode("decimal");
                display.setUnitsMode("degrees");
            }
        }

    }
}