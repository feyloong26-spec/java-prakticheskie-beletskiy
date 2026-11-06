package ru.beletskiy.part4.objects;
/** ПР4.1, задание 4. */
public class Matrix {
    private final int rows, columns;
    private final double[][] data;
    public Matrix(double[][] values) {
        if (values.length == 0 || values[0].length == 0) throw new IllegalArgumentException("Пустая матрица");
        rows = values.length; columns = values[0].length;
        data = new double[rows][columns];
        for (int r = 0; r < rows; r++) {
            if (values[r].length != columns) throw new IllegalArgumentException("Неровная матрица");
            System.arraycopy(values[r], 0, data[r], 0, columns);
        }
    }
    public Matrix add(Matrix other) {
        if (rows != other.rows || columns != other.columns) throw new IllegalArgumentException("Размеры не совпадают");
        double[][] result = new double[rows][columns];
        for (int r = 0; r < rows; r++) for (int c = 0; c < columns; c++) result[r][c] = data[r][c] + other.data[r][c];
        return new Matrix(result);
    }
    public Matrix multiply(double factor) {
        double[][] result = new double[rows][columns];
        for (int r = 0; r < rows; r++) for (int c = 0; c < columns; c++) result[r][c] = data[r][c] * factor;
        return new Matrix(result);
    }
    public Matrix multiply(Matrix other) {
        if (columns != other.rows) throw new IllegalArgumentException("Столбцов слева должно быть столько же, сколько строк справа");
        double[][] result = new double[rows][other.columns];
        for (int r = 0; r < rows; r++) for (int c = 0; c < other.columns; c++)
            for (int k = 0; k < columns; k++) result[r][c] += data[r][k] * other.data[k][c];
        return new Matrix(result);
    }
    public double get(int row, int column) { return data[row][column]; }
    public void print() {
        for (double[] line : data) {
            for (double value : line) System.out.printf("%9.2f", value);
            System.out.println();
        }
    }
}
