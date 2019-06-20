package lesson2.HW.exception;

/**
 * @author Anatoly Yakovlev
 */
public class MyArrayDataException extends CustomException {

    public MyArrayDataException(int row, int col) {
        super(String.format("Parse to int exception in array[%d, %d]", row, col));
    }
}