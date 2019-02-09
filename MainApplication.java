
public class MainApplication {

    public static void main(String[] args) {
        boolean run = true;
        Display display = new Display();
        display.println("TIME TO CALCULATE!");
        double x = display.getDoubleInput("Enter a number");

        while (run){

            String s = display.getStringInput("\nEnter an operator");
            s = s.toLowerCase();
            double result = 0;

            switch(s){
                case "+" : 
                case "add" : 
                case "sum" :
                case "plus": 
                double addY = display.getDoubleInput("Enter another number");
                result = display.add(x, addY);
                display.println("%f %s %f = %f", x, s, addY, result);

                break;

                case "-": 
                case "subtract": 
                case "minus":
                double subY = display.getDoubleInput("Enter another number");
                result = display.subtract(x, subY);
                display.println("%f %s %f = %f", x, s, subY, result);

                break;

                case "/":
                case "divide":
                case "divided by":
                double divY = display.getDoubleInput("Enter another number");
                result = display.divide(x, divY);
                display.println("%f %s %f = %f", x, s, divY, result);

                break;

                case "*" :
                case "times":
                case "multiply":
                double multiY = display.getDoubleInput("Enter another number");
                result = display.multiply(x, multiY);
                display.println("%f %s %f = %f", x, s, multiY, result);

                break;

                case "%" :
                case "mod":
                case "remainder":
                double modY = display.getDoubleInput("Enter another number");
                result = display.modulous(x, modY);
                display.println("%f %s %f = %f", x, s, modY, result);

                break;

                case "^" : 
                double expoY = display.getDoubleInput("Enter another number");
                result = display.exponent(x, expoY);
                display.println("%f %s %f = %f", x, s, expoY, result);

                break;

                case "sin": 
                result = display.sin(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "asin": 
                result = display.asin(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "sinh": 
                result = display.sinh(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "cos": 
                result = display.cos(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "acos": 
                result = display.acos(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "cosh": 
                result = display.cosh(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "tan": 
                result = display.tan(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "atan": 
                result = display.atan(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "tanh": 
                result = display.tanh(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "theta":
                double thetaY = display.getDoubleInput("Enter another number");
                result = display.theta(thetaY, x);
                display.println("%f %s %f = %f", thetaY, s, x, result);

                break;

                case "sqrt":
                case "root":
                case "square root":
                result = display.squareRoot(x);
                display.println("%s %f = %f", s, x, result);

                break;

                case "cbrt":
                result = display.cubicRoot(x);
                display.println("%s %f = %f", s, x, result);

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
                
                default : result = 0;
            }

            String quit = display.getStringInput("Enter 'quit' to stop or enter another number");

            if (quit.equals("quit")){
                run = false; 
            }
            else {
                x = Double.valueOf(quit);
                display.setCurrentDisplayMode("decimal");
                display.setUnitsMode("degrees");
            }
        }

    }
}
