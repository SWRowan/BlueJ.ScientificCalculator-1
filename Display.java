
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
    
    public double add(double x, double y){
        return x + y;
    }
    
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
}