package behavioralpattern.interpreterpattern;

/**
 * 除法运算表达式
 */
public class DivInterpreter extends Interpreter {

    public DivInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left, right);
    }
    @Override
    public int interpret() {
        return this.left.interpret() / this.right.interpret();
    }
}
