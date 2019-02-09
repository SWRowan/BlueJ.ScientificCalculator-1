public class MainApplication {

    public static void main(String[] args) {
        boolean run = true;
        Display display = new Display();
        display.println("TIME TO CALCULATE!");

        while (run){

            double x = display.getDoubleInput("Enter a number");
            String s = display.getStringInput("Enter an operator");
            double y = display.getDoubleInput("Enter another number");
            double result;
            
            /**switch(s){
                case "sin": result = display.sin(x);
                break;
                
                case "cos": result = display.cos(x);
                break;
                
                case "tan": result = display.tan(x);
                break;
                
                case "atan": result = display.atan(x);
                break;
                
                default: result = 0;
            }*/

            switch(s){
                case "+" : 
                case "add" : 
                case "sum" :
                case "plus":
                case "Plus": result = display.add(x, y);
                break;

                case "-": 
                case "subtract": 
                case "Subtract":
                case "minus":
                case "Minus": result = display.subtract(x, y);
                break;

                case "/":
                case "divide":
                case "Divide": result = display.divide(x, y);
                break;

                case "*" :
                case "times":
                case "Times":
                case "multiply":
                case "Multiply": result = display.multiply(x, y);
                break;

                case "%" :
                case "mod":
                case "Mod":
                case "remainder":
                case "Remainder": result = display.modulous(x, y);
                break;

                case "^" : result = display.exponent(x, y);
                break;

                default : result = 0;
                break;

            }
            display.println("%f %s %f = %f", x, s, y, result);

            String quit = display.getStringInput("Enter 'quit' to stop");

            if (quit.equals("quit")){
                run = false;

            }
        }
    }
}
