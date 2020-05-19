package behavioralpattern.interpreterpattern;

import java.util.Stack;

public class GPCalculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<IArithmeticInterpreter>();

    public GPCalculator(String expression){
        this.parse(expression);
    }

    private void parse(String expression){
        String[] elemtns = expression.split(" ");
        IArithmeticInterpreter left,right;

        for (int i = 0; i < elemtns.length; i++){
            String operator = elemtns[i];
            if (OperatorUtil.isOperator(operator)){
                left = this.stack.pop();
                right = new NumInterpreter(Integer.valueOf(elemtns[++i]));
                System.out.println("出栈" + left.interpret() + "和" + right.interpret());
                this.stack.push(OperatorUtil.getInterpreter(left, right, operator));
                System.out.println("应用运算符：" + operator);
            }else {
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elemtns[i]));
                this.stack.push(numInterpreter);
                System.out.println("入栈:" + numInterpreter.interpret());
            }
        }
    }

    public int calculate(){
        return this.stack.pop().interpret();
    }
}
