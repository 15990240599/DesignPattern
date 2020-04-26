package structuralpattern.compositepattern;

/**
 * 组合模式（Composite Pattern）也称为整体-部分模式（Part-Whole）模式，他的宗旨是通过将单个
 * 对象（叶子节点）和组合对象（树枝节点）用相同的接口进行表示，是的客户对单个对象和组合对象的
 * 使用具有一致性，属于结构型模式。
 *
 * 组合关系和聚合关系的区别：
 * 1、组合关系：汽车和零件，由各个零件组成了汽车（具有相同的生命周期）
 * 2、集合关系：大雁与雁群（具有不同的生命周期）
 *
 * 组合模式一般用来描述整体与部分的关系，他将对象组织到熟悉结构中，最顶层的节点被称为根节点，根节点
 * 下面可以包含树枝节点和叶子节点，树枝节点下面又可以包含树枝节点和叶子节点
 *                       =============
 *                       =   Root    =
 *                       =   根节点   =
 *                       =============
 *                     /     |       \
 *                   |/_     |       _\|
 *              ========== ========== ==========
 *              = Branch = =  Leaf  = = Branch =
 *              = 树枝节点= = 叶子节点= = 树枝节点=
 *              ========== ========== ==========
 *             /        \             /        \
 *           |/_        _\|         |/_        _\|
 *      ==========   ==========  ==========  ==========
 *      = Leaf   =   = Leaf   =  = Leaf   =  = Leaf   =
 *      = 叶子节点=   = 叶子节点=  = 叶子节点=  = 叶子节点=
 *      ==========   ==========  ==========  ==========
 *
 *  由上图可以看出，其实根节点和树枝节点本质上是同一种类型，可以作为容器使用；而叶子节点和
 *  树枝节点在语义上不属于同一种类型，但是在组合模式中，会把树枝节点和一屋子节点认为是同一种
 *  数据类型（用同一接口定义）。让他们具备一致行为。这样，在组合模式用，整个树形结构中的对象
 *  都是同一种类型，带来的一个好处就是客户端无需辨别树枝节点还是叶子节点，而是可以直接进行操
 *  作，给客户使用带来极大的便利
 *
 *  组合模式包含3个角色
 *  1、抽象根节点（Component）：定义系统各层次对象的共有方法和属性，可以预先定义一些默认
 *  行为和属性
 *  2、树枝节点（Composite）：定义树枝节点的行为，存储子节点，组合树枝节点和叶子节点形成
 *  的一个树形结构
 *  3、叶子节点（Leaf）：叶子节点对象，其下再无分支，是系统层次遍历的最小单位
 *  组合模式在代码具体实现上有两种不同的方式，分别是透明组合模式和安全组合模式
 *
 *  应用场景
 *  当子系统与其内各个对象层次呈现出树形结构时，可以使用组合模式让子系统内各个对象层次的行为
 *  操作具备一致性。客户端使用改子系统内任意一个层次对象是，无需进行区分，直接使用通用操作即可，
 *  为客户端使用带来了便捷
 *  1、希望客户端可以忽略组合对象与单个对象的差异时
 *  2、对象层次具备整体和部分、呈树形结构
 *
 *  组合模式优缺点
 *  透明模式将公共接口封装到抽象根节点（Component）中，那么系统所有节点就具备一致行为，所以如果
 *  当系统绝大多数层次具备相同的公共行为时，采用透明组合模式会更好点（代价：为剩下少出层次节点引
 *  入不需要的方法）；而如果当系统各个层次差异性行为较多或者树节点层次相对稳定（健壮）时，采用
 *  安全组合模式；
 *  优点：
 *  1、清楚的定义层次的复杂对象，表示对象的全部或者部分层次
 *  2、让客户端胡萝了层次的差异，方便对整个层次结构进行控制
 *  3、简化客户端代码
 *  4、符合开闭原则
 *  缺点：
 *  1、限制类型时会比较复杂
 *  2、使设计变得更加抽象
 *
 */
public class CompositePatternDemo {
}