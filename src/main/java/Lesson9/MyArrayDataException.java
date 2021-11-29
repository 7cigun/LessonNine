package Lesson9;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int row, int column) {
        System.out.println("Неверные деанные в ячейке: " + row + " " + column);
    }

}