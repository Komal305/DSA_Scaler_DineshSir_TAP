package javaBitManipulation2;

public class AQ1StrangeEquality {

	public static void main(String[] args) {
		int A=5;
		int bit = 0, x = 0;
        //int originalA = A;  // Store the original value of A
 
        // x is equal to the summation of unset bits in A
        while (A != 0) {
            if (A % 2 == 0) {  // Check if the bit is unset
                x = x | (1 << bit);  // Set the corresponding bit in x
            }
            A /= 2;  // Move to the next bit
            bit++;
        }

        // y equals the power of 2 just greater than originalA
        int y = (1 << bit);

        // Return the XOR of x and y
        System.out.println(x^y);
    }
	}
