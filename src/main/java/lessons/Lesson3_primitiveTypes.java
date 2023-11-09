package lessons;

/**
 * Declarations and initialization of primitive types.
 * There are also some examples of wrong declarations and initialization
 */
public class Lesson3_primitiveTypes {

    // integral types
    byte varByte = 1;
    int varInt1 = 2;
    short varShort = 4;
    long varLong = 5;

    // floating point types
    float varFloat = 10.54f;
    double varDouble = 11.5;

    // Constants
    final int NUMBER_OF_MONTHS = 12;

    // Wrong declarations
    //int varInt1 = 1; varInt2 = 2;
    //string varString;
    //float varFloat = 10.54;

    @Override
    public String toString() {
        // NUMBER_OF_MONTHS = 13; // wrong, it's final, can't be changed

        String breakLine = "\n";
        StringBuilder strReturn = new StringBuilder("--------------------------------").append(breakLine);
        strReturn.append("Primitive types:").append(breakLine);
        strReturn.append("byte = ").append(varByte).append(breakLine);
        strReturn.append("int = ").append(varInt1).append(breakLine);
        strReturn.append("short = ").append(varShort).append(breakLine);
        strReturn.append("long = ").append(varLong).append(breakLine);
        strReturn.append("float = ").append(varFloat).append(breakLine);
        strReturn.append("double = ").append(varDouble).append(breakLine);
        strReturn.append("constant (number of months) = ").append(NUMBER_OF_MONTHS).append(breakLine);
        strReturn.append("--------------------------------");

        return strReturn.toString();
    }
}