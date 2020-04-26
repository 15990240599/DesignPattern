package structuralpattern.compositepattern.lucencycompositepattern;

/**
 *  透明组合模式
 *
 *  透明组合模式是吧所有公用的方法都定义在Component中，这样做的好处是客户端无需分辨是
 *  叶子（Leaf）和树枝节点（Composite），他们具备完全一致的接口。
 *
 *  缺点是叶子节点（Leaf）会集成得到一些它所不需要（管理子类操作）的方法，这与设计模式接口
 *  隔离原则想违背
 */
public class LucencyCompositePatternDemo {
    public static void main(String[] args) {
        System.out.println("==============透明组合模式===============");

        CourseComponent javaBase = new Course("java入门课程",8280);
        CourseComponent ai = new Course("人工智能",5000);

        CourseComponent packageCourse = new CoursePackage("Java架构师课程", 2);

        CourseComponent design = new Course("Java设计模式", 1500);
        CourseComponent source = new Course("源码分析", 2000);
        CourseComponent sofeSkill = new Course("软技能", 3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(sofeSkill);

        CourseComponent catalog = new CoursePackage("课程主目录", 1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();
    }
}
