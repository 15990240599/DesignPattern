package creationalPattern.abstractFactoryPattern;

public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
