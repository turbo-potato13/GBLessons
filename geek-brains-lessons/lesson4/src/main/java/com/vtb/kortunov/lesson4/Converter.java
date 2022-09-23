package com.vtb.kortunov.lesson4;

public class Converter {

    public static int conversion(String[][] strArray) throws Exception {
        int sum = 0;
        for (String[] array : strArray) {
            if (array.length != 4 || strArray.length != 4) {
                throw new MyArrayException();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    String exceptionText = String.format("Ошибка в ячейке [%d][%d]", i, j);
                    throw new MyArrayDataException(exceptionText);
                }
            }
        }
        return sum;
    }
}
