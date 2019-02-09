
public class MainApplication {
    
    
    public static void main(String[] args) {
        
        boolean run = true;
        Display display = new Display();
        display.println("TIME TO CALCULATE!");
        double x = display.getDoubleInput("Enter a number");
        
        while (run){
            
        String s = display.getStringInput("Enter an operator");
        
        double result = 0;
        
        switch(s){
            case "+" : double y = display.getDoubleInput("Enter another number");
            result = display.add(x, y);
            display.println("%f %s %f = %f", x, s, y, result);
            
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
            
            case "M+" :
            display.changeDisplay("" + x);
            display.setMemoryValue(display.getCurrentDisplay());
            display.println("%s has been saved to memory.",display.getMemoryValue()); 
            
            break;
            
            case "M-" :
            display.setMemoryValue("0");
            display.println("The memory value has been reset to %s", display.getMemoryValue()); 
            break; 
            
            case "MRC" :
            display.changeDisplay(display.getMemoryValue());
            display.println(display.getCurrentDisplay());
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
        }
    }
    }
}
