// Example of using the do while loop in Java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        
        // Control variable initialization
        int i = 0;
        
        // Executes the code block at least once
        do {
            // Code block executed
            System.out.println("Value of i: " + i);
            
            // Control variable update
            i++;
        } while(i < 5); // Checks the condition after executing the loop
    }
}
