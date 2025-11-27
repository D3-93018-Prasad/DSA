package com;

import java.util.Stack;

public class Prefix {
	
	public static int cal(int op1, char op, int  op2) {
		switch (op) {
		case '+' : return op1+op2;
		case '-' : return op1-op2;
		case '*' : return op1*op2;
		case '/' : return op1/op2;
		case '%' : return op1%op2;
		}
		return 0;
	}
	
	public static int prefixEvaluate(String expr) {
        Stack<Integer> st = new Stack<>();

        // Split by spaces
        String[] parts = expr.trim().split("\\s+");
        int n = parts.length - 1;

        // Traverse from right to left
        for (int i = n; i >= 0; i--) {
            String cur = parts[i];

            //  Check if token is a number (integer)
            if (cur.matches("-?\\d+")) {
                st.push(Integer.parseInt(cur));
            } else {
                int op1 = st.pop();
                int op2 = st.pop();
                int res = cal(op1, cur.charAt(0), op2);
                st.push(res);
            }
        }

        // Final result
        return st.pop();
    }

        
	public static int prefixEva(String exp) {
		
		Stack<Integer> st = new Stack<>();
		int n = exp.length()-1;
		
		
		//traverse exp right to left 
		for(int i = n ; i >= 0 ; i--) {
			// if ele is operand push it on stack
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) st.push(ch -'0');
			else {
				int opt1 = st.pop();
				int opt2 = st.pop();
				int res = cal(opt1, ch, opt2);
				st.push(res);
			}
			
		}
		// else op2 = st.pop 
		//		op1= st.pop
		//		int res = cal (op1, ele, op2) ;
		//		st.push(res);
		
		if(st.empty()) return -1;
		return st.pop();
	}
	
	public static void main(String[] args) {
		
		String exp = "- + + 4 / * 5 6 3 9 7";
		int ans = prefixEvaluate(exp);
		
		System.out.println("The prefix Evaluation is : "+ ans);
		
	}

}
