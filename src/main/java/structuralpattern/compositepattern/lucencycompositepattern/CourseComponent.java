package structuralpattern.compositepattern.lucencycompositepattern;

/**
 * 不使用抽象方法的原因
 * 如果使用抽象方法，其子类就必须实现，这样便体现不出各子类的细微差异。因此，子类继承次抽象类
 * 后，只需要重写有差异的方法覆盖父类方法即可。
 */
public abstract class CourseComponent {
    public void addChild(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void removeChild(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }
    public double getPrice(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
