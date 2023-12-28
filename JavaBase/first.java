import java.util.*; //Scanner package
public class first{
    public static void main(String arg[]){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        

        /*
         * Memory consumtion of each data type in Java : 
         * Byte  - 1 Byte
         * short - 2 Byte
         * char - 2 Byte
         * boolean - 1 Byte
         * int - 4 Byte
         * float - 4 Byte
         * double - 8 Byte
         * long - 8 Byte
         * 
         */



        /* 
         * 
         * Default Java supports widenning conversion. i.e; Destination data type while 
         * type conversion has to greater and compatible with the source data type.
         *  
         * byte (1) -> Short(2) -> int(4) -> float(4) -> long(8) -> double(8)
         *
         * Opposite is not allower via conversion(few cases can be Casted), called LOSSY Conversion.
         */

        // Type Casting
        float f = 3.14f;
        long c = (long)f;
        System.out.println(c);

        //variable name can start wit '_' and can be $
        int $= 5;
        
        System.out.println($);
    }
}