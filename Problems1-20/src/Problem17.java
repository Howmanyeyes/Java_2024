import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Problem17 {
    public static void main(String[] args) {
        String filePath = "Problems1-20/src/helpful_files/Problem17/input.txt"; 
        
        try {
            List<String> lines = readFile(filePath);
            
            int[][] matrix = convertToMatrix(lines);
            
            System.out.println("Original Matrix");
            printMatrix(matrix);
            
            int[][] transposedMatrix = transposeMatrix(matrix);
            
            System.out.println("\nTransposed Matrix");
            printMatrix(transposedMatrix);
            
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (InvalidMatrixException e) {
            System.err.println("Invalid matrix: " + e.getMessage());
        }
    }
    
    private static List<String> readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllLines(path);
    }
    
    private static int[][] convertToMatrix(List<String> lines) throws InvalidMatrixException {
        int numRows = lines.size();
        if (numRows == 0) {
            throw new InvalidMatrixException("The input file is empty.");
        }
        
        int[][] matrix = new int[numRows][];
        
        for (int i = 0; i < numRows; i++) {
            String line = lines.get(i).trim();
            if (line.length() != numRows) {
                throw new InvalidMatrixException("Row " + (i + 1) + " does not have " + numRows + " elements.");
            }
            matrix[i] = new int[numRows];
            for (int j = 0; j < numRows; j++) {
                char ch = line.charAt(j);
                if (!Character.isDigit(ch)) {
                    throw new InvalidMatrixException("Non-numeric character '" + ch + "' found at row " + (i + 1) + ", column " + (j + 1) + ".");
                }
                matrix[i][j] = Character.getNumericValue(ch);
            }
        }
        
        return matrix;
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
    private static int[][] transposeMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] transposed = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }
}

class InvalidMatrixException extends Exception {
    public InvalidMatrixException(String message) {
        super(message);
    }
}
