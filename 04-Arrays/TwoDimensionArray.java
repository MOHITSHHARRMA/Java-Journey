public class TwoDimensionArray {

    public static void main(String args[]) {

        // Create a two-dimensional integer array
        // with 8 rows and 10 columns.
        int num[][] = new int[8][10];

        // Fill the array with random integers
        // ranging from 0 to 9.
        for (int rows = 0; rows < num.length; rows++) {

            for (int columns = 0; columns < num[rows].length; columns++) {

                num[rows][columns] = (int) (Math.random() * 10);

            }
        }

        // Traverse and print the array using nested loops.
        // The outer loop iterates through rows,
        // while the inner loop iterates through columns.
        for (int rows = 0; rows < num.length; rows++) {

            for (int columns = 0; columns < num[rows].length; columns++) {

                System.out.print(num[rows][columns] + " ");

            }

            // Move to the next line after printing one row.
            System.out.println();
        }
    }
}
