package behavioralpattern.interpreterpattern;

/**
 * 乘法运算表达式
 */
public class MultiInterpreter extends Interpreter {

    public MultiInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left, right);
    }
    @Override
    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }
}
