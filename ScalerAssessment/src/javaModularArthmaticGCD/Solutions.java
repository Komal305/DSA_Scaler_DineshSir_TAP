package javaModularArthmaticGCD;


public class Solutions {

    // Function to compute the GCD of two numbers using the Euclidean algorithm
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // Function to compute prefix GCDs
    public static int[] prefixGCD(int[] A) {
        int n = A.length;
        int[] pre = new int[n];
//        Arrays.fill(pre, 0);
        int val = A[0];
        for (int i = 0; i < n; i++) {
            pre[i] = gcd(val, A[i]);
            val = pre[i];
        }
        for(int p:pre)System.out.print(p+" ");
       
    System.out.println();
    return pre;
}
    // Function to compute suffix GCDs
    public static int[] suffixGCD(int[] A) {
        int n = A.length;
        int[] back = new int[n];
        //Arrays.fill(back, 0);
        int val = A[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            back[i] = gcd(val, A[i]);
            val = back[i];
        }
       
        for(int b:back)System.out.print(b+" ");
        return back;
    }

    // Main function to solve the problem
    public static int solve(int[] A) {
        int n = A.length;
        int[] pre = prefixGCD(A);
        int[] back = suffixGCD(A);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0)
                ans = Math.max(ans, back[i + 1]);
            else if (i == n - 1)
                ans = Math.max(ans, pre[i - 1]);
            else
                ans = Math.max(ans, gcd(pre[i - 1], back[i + 1]));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {3,9,6,8,3}; // Example input
        System.out.println("The result is: " + solve(A));
    }
}
