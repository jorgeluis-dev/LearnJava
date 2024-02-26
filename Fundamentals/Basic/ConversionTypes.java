public class ConversionTypes {
    public static void main(String[] args) {
        
        int valueInt = 10;        
        System.out.println("Value Integer: "+valueInt);
        

        //example Implicit conversion
        double valueConvertedToAnotherType = valueInt;
        System.out.println("Value Converted Type Implicit: "+valueConvertedToAnotherType);

        //example Explicit conversion
        int valueConvertedToint = (int) valueConvertedToAnotherType;
        System.out.println("Value Converted Type Explicit: "+valueConvertedToint);

    }
}
