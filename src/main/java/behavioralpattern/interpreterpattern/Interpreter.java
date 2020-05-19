package behavioralpattern.interpreterpattern;

/**
 * 中介表达式橘色
 */
public abstract class Interpreter implements IArithmeticInterpreter {

    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        this.left = left;
        this.right = right;
    }
}
