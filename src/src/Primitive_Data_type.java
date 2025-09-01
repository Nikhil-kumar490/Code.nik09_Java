public class Primitive_Data_type {
    public static void main(String[] args){

        byte bytevalue= 121;
        short shortValue = bytevalue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("byte is : "+bytevalue);
        System.out.println("short is : "+shortValue);
        System.out.println("int is : " +intValue);
        System.out.println("long is: "+longValue);
        System.out.println("float is :"+floatValue);
        System.out.println("double is :"+doubleValue);

        byte bytev= 126;
        short shortV = 234;
        int intV = shortValue;
        long longV = intValue;
        float floatV = longValue;
        double doubleV = floatValue;

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("short is : "+shortV);

    }
}
