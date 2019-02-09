
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

    public Display() {
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
        out.format(val, args);
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */

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

    public String getCurrentDisplay(){
        return this.currentDisplay;
    }

    public void clearDisplay(){
        this.currentDisplay = "0";
    }

    public void changeDisplay(String s){
        this.currentDisplay = s;
    }

    public double add(double d1, double d2){
        return d1 + d2;
    }

    public int toDecimal(String s, int base){
        return Integer.parseInt(s, base);

    }

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

    public void setMemoryValue(String s){
        this.memoryValue = s;
    }

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
}