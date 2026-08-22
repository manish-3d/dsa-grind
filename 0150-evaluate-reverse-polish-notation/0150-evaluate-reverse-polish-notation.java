class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String ch : tokens){
            if(ch.equals("*") || ch.equals("/") || ch.equals("+") || ch.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                switch(ch) {
                case "*" -> stack.push(a*b);
                case "/" -> stack.push(a/b);
                case "-" -> stack.push(a-b);
                case "+" -> stack.push(a+b);
                }
            }
           else{
             stack.push(Integer.parseInt(ch));
           }
        }
        return stack.pop();
    }
}