
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
    private double currentDisplay = 0;
    

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
   
    public Double getCurrentDisplay(){
        return this.currentDisplay;
    }
    
    public void clearDisplay(){
        this.currentDisplay = 0;
    }
    
    public void changeDisplay(Double d){
        this.currentDisplay = 0;
    }
    
    
}