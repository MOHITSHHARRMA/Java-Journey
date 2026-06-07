
public class stringBuffer {

    public static void main(String[] args) {

        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("MOHIT SHARMA ");
        System.out.println(sb);

        // Appending data to the StringBuffer
        sb.append("is student ");
        sb.append("of age : ");
        sb.append(21);

        System.out.println(sb);

        // Returns the length of the StringBuffer
        System.out.println(sb.length());

        // Returns the character at the specified index
        System.out.println(sb.charAt(6));

        // Returns the Unicode code point of the character
        // at the specified index
        System.out.println(sb.codePointAt(8));

        // Deletes characters from index 0 to 4
        System.out.println(sb.delete(0, 5));

        // Converting StringBuffer to String
        String str = sb.toString();

        System.out.println(str);

        // Recreating a StringBuffer from the String
        // Variable 'sb' is already declared, so we reassign it
        // instead of redeclaring it.
        sb = new StringBuffer(str);

        // Adding a new line and appending additional content
        sb.append("\n");
        sb.append("The value of Pi is : ");
        System.out.println(sb.append(3.14f));

        // Ensures minimum capacity of 100 characters
        sb.ensureCapacity(100);

        // Prints current capacity
        System.out.println(sb.capacity());
    }
}

