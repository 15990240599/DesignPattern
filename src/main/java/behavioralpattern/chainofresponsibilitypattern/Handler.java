package behavioralpattern.chainofresponsibilitypattern;

/**
 * 责任链模式与建造者模式结合使用
 * 因为责任链模式具备链式结构，而上面代码中，负责组装链式结构的角色是MemberService，
 * 当链式结构较长是，MemberService的工作会非常繁琐，并且MemberService代码相对臃肿，
 * 且后续更改处理者或者消息类型时，都必须在MemberService中进行修改，不符合开闭原则。
 * 而产生这些问题的原因就是因为链式结构的组装过于复杂，而对于复杂结构的创建，很自然
 * 就会想到建造者模式，使用建造者模式完全可以对MemberService指定的处理节点对象进行
 * 自动链式组装，客户只需指定处理节点对象，其他任何事情都无需关心，并且客户指定的处理
 * 节点对象顺序不同，构造出来的链式结构也随之不同
 */
public abstract class Handler<T> {
    protected Handler chain;

    public void next(Handler handler){
        this.chain = handler;
    }

    public abstract void doHandle(Member member);

    //--------------v2--------------------
    public static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler){
            if (this.head == null){
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build(){
            return this.head;
        }
    }
}
