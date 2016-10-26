import java.util.Arrays;
import java.util.Scanner;

public class TurnOneToTwoDimensionalArray {

	public static void main(String[] args) {
		       
	        Scanner scanner = new Scanner(System.in);
	        int sideSize = 0;
	        int[] normalArray;
	        int[][] matrix;
	        int numberOfInputs = 0;
	        int sum = 0;
	        System.out.print("Please, insert a number between 2 and 9 inclusive: ");
	        
	        	do {
	            sideSize = scanner.nextInt();
	            
	            if (sideSize < 2) {
	                System.out.print("Your number is lower than 2. Please, insert a number between 2 and 9 inclusive: ");
	            } else if (sideSize > 9) {
	                System.out.print("Your number is greater than 9. Please, insert a number between 2 and 9 inclusive: ");
	            } else {
	                break;
	            }
	        } while (true);
	        
	        numberOfInputs = sideSize * sideSize;
	        normalArray = new int[numberOfInputs];
	        matrix = new int[sideSize][sideSize];
	        System.out.println("Now please enter " + numberOfInputs + " numbers: ");
	        
	        for (int i = 0; i < numberOfInputs; i++) {
	            System.out.print((i + 1) + ": ");
	            normalArray[i] = scanner.nextInt();
	            sum += normalArray[i];
	        }
	        
	        System.out.println(Arrays.toString(normalArray) + " = " + sum);
	        
	        for (int i = 0; i < numberOfInputs; i++) {
	        matrix[i % sideSize][i / sideSize] = normalArray[i];
	        }
	        
	        for (int i = 0; i < sideSize; i++) {
	            System.out.println(Arrays.toString(matrix[i]));
	        }

	    }
	}