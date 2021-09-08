package java.util;

public class IllegalFormatConversionExceptionImpl extends IllegalFormatConversionException {
    /**
     * Constructs an instance of this class with the mismatched conversion and
     * the corresponding argument class.
     *
     * @param c   Inapplicable conversion
     * @param arg
     */
    public IllegalFormatConversionExceptionImpl(char c, Class<?> arg) {
        super(c, arg);
    }
}
