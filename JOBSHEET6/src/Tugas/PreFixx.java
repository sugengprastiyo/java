package Tugas;
public class PreFixx {
           int n;
            int top;
            char[] stack;
        PreFixx(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }
        void push(char c){
        top++;
        stack[top] = c;
        }
        char pop(){
        char item = stack[top];
        top--;
        return item;
    }
        public String balik(String q){
            String balik = "";
            char a;
            for (int i = n-1; i>=0; i--){
                a = q.charAt(i);
                if (a=='('){
                    a= ')';
                    balik = balik+a;
                  
                }else if(a==')'){
                    a='(';
                    balik = balik+a;
                }else{
                    balik = balik+a;
                }    
            }
            return balik;
        }
        String convert (String Q){
            String P = "";
            char c;
            for (int i = 0; i<n; i++){
                c= Q.charAt(i);
                if (isOperand(c))
                    P = P+c;
                if (c=='(')
                    push(c);
                if(isOperator(c)){
                    while (presendence (stack[top])>= presendence(c))
                        P = P+pop();
                    push(c);
                }
                if (c==')'){
                    while (stack[top]!='(')
                        P= P+pop();
                    char temp = pop();
                }
            }
            return P;
    }
        String HasilAkhir(String q){
            String HasilAkhir = "";
            char a;
            for (int i = q.length()-1; i>=0; i--){
                a = q.charAt(i);
                HasilAkhir = HasilAkhir+a;
            }
            return HasilAkhir;
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
        int presendence (char c){
            switch(c){
                case '^' : return 3;
                case '%' : return 2;
                case '/' : return 2;
                case '*' : return 2;
                case '-' : return 1;
                case '+' : return 1;
                default : return 0;
            }
        }
}
