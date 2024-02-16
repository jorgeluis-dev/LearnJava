public class TheIfelseIf {
    public static void main(String[] args) {
        //define age person
        int age = 12;

        //check if person is child?
        if(age < 13){
             // This block executes if the condition is true
             System.out.println("The person is a child.");
        } else if(age >= 13 && age < 18){
            // This block executes if the first condition is false and this condition is true
            System.out.println("The person is a teenager.");
        } else{
            // This block executes if all above conditions are false
            System.out.println("The person is an adult.");
        }
    }
}
