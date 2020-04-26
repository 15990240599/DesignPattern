package structuralpattern.compositepattern.safecompositepattern;

/**
 * 安全组合模式
 * 安全组合模式是只规定系统各个层次的最基础的一致行为，而把组合（树节点）本身的
 * 方法（管理子类对象的添加，删除等）放到自身当中
 *
 * 安全组合模式的好处是接口定义职责清晰，符合设计模式 单一职责原则 和接口隔离原则;
 * 缺点是客户端需要徐芬树枝节点(Composite)和叶子节点(Leaf),这样才能正确处理各个层次
 * 的操作，客户端无法依赖抽象（Component），违背这几模式依赖导致原则
 */
public class SafeCompositePatternDemo {
    public static void main(String[] args) {
        System.out.println("===========安全组合模式===========");

        File qq = new File("QQ.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("Word.exe");
        File ppt = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder wps = new Folder("金山软件",3 );
        wps.add(new File("WPS.exe"));
        office.add(wps);

        Folder root = new Folder("根目录", 1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        System.out.println("------show()方法效果-------");
        root.show();
        System.out.println("------list()方法效果-------");
        root.list();
    }
}
