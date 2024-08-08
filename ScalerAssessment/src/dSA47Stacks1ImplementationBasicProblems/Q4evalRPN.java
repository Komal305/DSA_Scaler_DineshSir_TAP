package dSA47Stacks1ImplementationBasicProblems;

import java.util.Stack;

public class Q4evalRPN {
	public static void main(String[] args) {
		String[] A= {"4","13","5","/","+"};
		//"a".compareTo("aaA");
		//Character.isJavaLetterOrDigit('c');
//		System.out.println(Math.floorDiv(13,5));
//			Stack<Integer> st=new Stack<>();
//			for(String c: A){
//			    if(isOperator(c)){
//			int x=st.pop();
//			int y=st.pop();
//			int ans=operator(x,y, c);
//			st.push(ans);
//			    }else{
//			        st.push(Integer.parseInt(c));
//			    }
//			}
//			//return st.pop();
//			System.out.println(st.pop());
//			    }
//
//	private static boolean isOperator(String s) {
//		
//		return s.equals("*")||s.equals("-")||s.equals("+")||s.equals("/");
//	}
//
//	private static int operator(int a, int b, String op) {
//		 switch(op){
//         case "+": return Math.addExact(a, b);
//         case "*": return Math.multiplyExact(a, b);
//         case "-": return Math.subtractExact(a, b);
//         case "/": return Math.floorDiv(a, b);
//         default: throw new IllegalArgumentException("invalid ");
//     }
//	}
//	}
//public class Solution {
//    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> values = new Stack<Integer>();
        int first;
        int second;
        for (String str: A) {
            if (equal(str, "+")) {
                second = values.pop();
                first = values.pop();
                values.push(first + second);
            } else if (equal(str, "*")) {
                second = values.pop();
                first = values.pop();
                values.push(first * second);
            } else if (equal(str, "/")) {
                second = values.pop();
                first = values.pop();
                values.push(first / second);
            } else if (equal(str, "-")) {
                second = values.pop();
                first = values.pop();
                values.push(first - second);
            } else {
                first = Integer.parseInt(str);
                values.push(first);
            }
        }
        System.out.println(Math.abs(values.peek()));
       // return Math.abs(values.peek()); // Ensure the result is non-negative
    }

    public static boolean equal(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
}


