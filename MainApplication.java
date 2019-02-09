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

            switch(s){
                case "+" : result = display.add(x, y);
                break;

                case "-" : result = display.subtract(x, y);
                break;

                case "/" : result = display.divide(x, y);
                break;

                case "*" : result = display.multiply(x, y);
                break;

                case "%" : result = display.modulous(x, y);
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
