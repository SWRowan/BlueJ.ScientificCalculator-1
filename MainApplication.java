public class MainApplication {
    
    
    public static void main(String[] args) {
        
        boolean run = true;
        Display display = new Display();
        display.println("TIME TO CALCULATE!");
        
        while (run){
            
        double x = display.getDoubleInput("Enter a number");
        String s = display.getStringInput("Enter an operator");
        double y = display.getDoubleInput("Enter another number");
        String quit = display.getStringInput("Enter 'quit' to stop");
        
        if (quit.equals("quit")){
            run = false;
        
        }
    }
    }
}
