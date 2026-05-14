package Basics;

public class DataTypes_04 {
    public static void main(String[] args) {
        // data_type identifier = value
        int x = 10;
        System.out.println(x);

        /*
        ⁡⁣⁣⁢Datatypes define what kind of value a variable can store in programming.⁡
        ⁡⁢⁣⁣An identifier is the name given to variables, methods, classes, arrays, etc.⁡

        datatypes are of 2 types primitive and non-primitive

        +------------+-----------+----------------------------------+----------------------+
        | Data Type  | Size      | Description                      | Example              |
        +------------+-----------+----------------------------------+----------------------+
        | byte       | 1 byte    | Small integer values             | byte a = 10;         |
        | short      | 2 bytes   | Medium integer values            | short b = 2000;      |
        | int        | 4 bytes   | Common integer datatype          | int age = 21;        |
        | long       | 8 bytes   | Large integer values             | long num = 999999L;  |
        | float      | 4 bytes   | Decimal values (less precision)  | float pi = 3.14f;    |
        | double     | 8 bytes   | Decimal values (high precision)  | double d = 99.999;   |
        | char       | 2 bytes   | Single character (Unicode)       | char grade = 'A';    |
        | boolean    | 1 bit*    | True or False values             | boolean isOn = true; |
        +------------+-----------+----------------------------------+----------------------+
        * Size of boolean is JVM dependent internally.
        */

        float dd = 34.34f;
        System.out.println("This is a float number " + dd);

        String name = "Ritesh Patel";
        System.out.println(name);
    }
}
