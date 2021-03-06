package behavioralpattern.interpreterpattern;

/**
 * 减法运算表达式
 */
public class SubInterpreter extends Interpreter {

    public SubInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left, right);
    }
    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
