package com;

import java.util.Stack;

public class Postfix {

    public static int cal(int op1, char opr, int op2) {
        switch (opr) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '/': return op1 / op2;
            case '*': return op1 * op2;
            case '%': return op1 % op2;
            case '$': return (int) Math.pow(op1, op2);
        }
        return 0;
    }

    public static int postfixEvaluate(String expr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == ' ') continue;

            String num = "";
            while (i < expr.length() && expr.charAt(i) != ' ') {
                num += expr.charAt(i);
                i++;
            }

            if (Character.isDigit(num.charAt(0))) {
                st.push(Integer.parseInt(num));
            } else {
                char opr = num.charAt(0);
                int op2 = st.pop();
                int op1 = st.pop();
                int res = cal(op1, opr, op2);
                st.push(res);
            }
        }


        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "45 61 * 32 / 69 + 47 -";

        System.out.println("Postfix : " + exp);
        int result = postfixEvaluate(exp);
        System.out.println("Result : " + result);
    }
}





//package com;
//
//import java.util.Stack;
//
//public class Postfix {
//	public static int cal(int op1, char opr, int op2 ) {
//		switch(opr) {
//		case '+' : return op1+op2;
//		case '-' : return op1-op2;
//		case '/' : return op1/op2;
//		case '*' : return op1*op2;
//		case '%' : return op1%op2;
//		case '$' : return (int)Math.pow(op1, op2);
// 		}
//		return 0;
//	}
//	
//	public static int postfixEvaluate(String expr) {
//		Stack<Integer> st = new Stack<Integer>();
//		
//		for(int i = 0 ; i<expr.length() ; i++) {
//			//extract element 
//			char ele = expr.charAt(i);
//			// 1. if exp[i] = digit    -> push in stack (as int)
//			if(Character.isDigit(ele))
//				st.push(ele - '0');
//			// 2. else exp[i] = opr     -> op2 = pop & op1 = pop
//			else {
////				  -> int result = cal (op1, exp[i], op2);
//				int op2 = st.pop();
//				int op1 = st.pop();
////				  -> push(result)
//				int res = cal(op1,ele,op2);
//				st.push(res);
//			}
//		}
//		if(!st.isEmpty())
//			return st.pop();
//		
//		return 0;
//		
//	}
//	
//	public static void main(String[] args) {
//		String exp = "45 6 * 3 / + 9 + 7-";
//		
//		System.out.println("Postfix : " + exp);
//		int result = postfixEvaluate(exp);
//		System.out.println("Result : " + result);
//	}
//
//}
