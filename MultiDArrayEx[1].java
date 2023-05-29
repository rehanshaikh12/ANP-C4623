package Array;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArrayEx
{

	public static void main(String[] args)
	{
		//Get the dimensions of the array from the user...
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();
			//create the array with the user specified dimension...
	        System.out.print("Enter the number of columns: ");
	        int numCols = scanner.nextInt();
			//Get the values for the array from the user...
	        int[][] array = new int[numRows][numCols];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }
	        //create integers sumrows and sumcolumns to create objectentered
	        int[] rowSums = new int[numRows];
	        int[] colSums = new int[numCols];

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                rowSums[i] += array[i][j];
	                colSums[j] += array[i][j];
	            }
	        }

	        System.out.println("The sum of each row is:");
	        //Print out the array elements using System.out.println(Arrays.deepToString(array)).
	        System.out.println(Arrays.toString(rowSums));

	        System.out.println("The sum of each column is:");
	        System.out.println(Arrays.toString(colSums));
	    }
	}