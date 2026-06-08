public class OneDimensionArrayUsingEnhancedForLoop {

    public static void main(String args[]) {

        // Create a one-dimensional integer array capable of storing 500 elements.
        int num[] = new int[500];

        // Fill the array with random integers ranging from 0 to 99.
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
        }

        // Traverse the array using the enhanced for loop (for-each loop).
        // The variable 'n' receives each element of the array one by one.
        // Enhanced for loops are primarily used for reading/traversing data.
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
