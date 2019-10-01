package Tugas;
public class No03 {
            int n;
            int top;
            String[] stack;
        No03(int total){
        n = total;
        top = -1;
        stack = new String[n];
       
    }
        void push(String c){
        top++;
        stack[top] = c;
        }
        String pop(){
        String item = stack[top];
        top--;
        return item;
    }
        String convert (String Q){
            String P = "";
            char c;
            for (int i = 0; i<n; i++){
                c= Q.charAt(i);
                if (isOperand(c))
                    push(""+c);
                if(isOperator(c)){
                    String a = pop();
                    String b = pop();
                    push("("+b+c+a+")");
                }
               
            }
            return pop();
    }
        boolean isOperand(char c){
            if ((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9') || c=='.')
                return true;
            else
                return false;
        }
        boolean isOperator(char c){
            if (c=='^' || c=='%' || c=='/' || c=='*' || c=='-' || c=='+')
                return true;
            else
                return false;
        }
}
