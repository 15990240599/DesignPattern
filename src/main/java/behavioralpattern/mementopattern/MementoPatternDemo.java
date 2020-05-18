package behavioralpattern.mementopattern;

/**
 * 备忘录模式（MementoPattern）有称为快照模式（SnapshotPattern）或令牌模式
 * （TokenPattern），
 * 是指在不破坏封装的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态。这样以后就
 * 可以将改对象回复到原先保存的状态，属于行为型模式
 *
 *  在软件系统中，备忘录模式可以理解为我们提供的一种“后悔药”的机制，他通过存储系统各个历史
 *  状态的快照，是的我门可以在任一时刻将系统回滚到某一个历史状态。
 *  备忘录模式本质是从发起人实体类（Originator）隔离存储功能，降低实体类的职责。同时由于
 *  存储信息（Memento）独立，且存储信息的实体交由管理类（Caretaker）管理，则可以通过为
 *  管理类扩展额外的功能对存储信息进行扩展操作（比如增加历史快照功能...）
 *
 *  备忘录模式适用于一下应用场景：
 *  1、需要保存历史快照的场景
 *  2、希望在对象之外保存状态，且除了自己其他类对象无法访问状态保存具体内容
 *
 *  主要包含三种角色：
 *  发起人角色（Originator）:负责创建一个备忘录，记录自身需要保存的状态；具备状态回滚功能；
 *  备忘录角色（Memento）：用于存储Originator的内部状态，且可以防止Originator以外的对象
 *  进行访问
 *  备忘录管理员角色（Caretaker）：负责妇女出，提供管理备忘录（Memento），无法对备忘录内容
 *  进行操作和访问
 *
 *  备忘录模式的优缺点
 *  优点：
 *  1、简化发起人实体类（Originator）职责，隔离状态存储与获取，实现了信息的封装，客户端
 *  无需关心状态的保存细节；
 *  2、提供状态回滚功能
 *  缺点：
 *  1、消耗资源：如果需要保存的状态过多时，每一次保存都会消耗很多内存
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();
        Editor editor = new Editor("我是这样手写Spring的，麻雀虽小五脏俱全，", "本文节选自《Spring5核心原理与30个手写实战》一书，TOM著，电子工业出版社出版，","1561616465.png");

        ArticleMemento articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);

        System.out.println("标题：" + editor.getTitle() + "\n" +
                "内容：" + editor.getContent() + "\n" +
                "插图：" + editor.getImgs() + "\n暂存成功");

        System.out.println("==========首次修改文章=========");
        editor.setTitle("【Tom原创】我是这样手写Spring的，麻雀虽小五脏俱全");
        editor.setContent("本文节选自《Spring5核心原理与30个手写实战》一书，TOM著");

        System.out.println("+++++++++++++首次修改文章完成++++++++++++++++");

        System.out.println("完整的信息" + editor);

        articleMemento = editor.saveToMemento();

        draftsBox.addMemento(articleMemento);

        System.out.println("+++++++++++++++++保存到草稿箱++++++++++++++++++++");

        System.out.println("==========第二次修改文章=========");
        editor.setTitle("手写Spring");
        editor.setContent("本文节选自《Spring5核心原理与30个手写实战》一书，TOM著");
        System.out.println("完整的信息" + editor);

        System.out.println("==========第二次修改文章完成=========");

        System.out.println("==========第一次撤销=========");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("完整的信息" + editor);
        System.out.println("==========第一次撤销完成=========");

        System.out.println("==========第二次撤销=========");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("完整的信息" + editor);
        System.out.println("==========第二次撤销完成=========");

    }
}
