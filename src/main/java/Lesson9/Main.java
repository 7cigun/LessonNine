package Lesson9;

public class Main {

    public static void main(String[] args) {

        String[][] stringArray = new String[][]{{"5", "5", "5", "5"}, {"10", "10", "10", "10"}, {"20", "20", "20", "20"}, {"15", "15", "15", "15"}};
        int sum = 0;

        try {
            sum = tryToSum(stringArray);
            System.out.println("Сумма все элементов: " + sum);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    private static int tryToSum(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length != 4 || stringArray.length != 4) {
                throw new MyArraySizeException("Размер массива не 4x4");
            }
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    sum +=Integer.parseInt(stringArray[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }


}