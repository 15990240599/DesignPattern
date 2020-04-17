package creationalPattern.singletonPattern;

import java.io.Serializable;

//反序列化导致破坏单例模式
public class SeriableSingleton implements Serializable {
    /*
     * 序列化就是吧内存中的状态通过转换成字节码的形式
     * 从而转换一个I/O流，写入其他地方（可以是磁盘、网络I/O）
     * 内存中的状态会永久保存下来
     *
     * 反序列化就是将已经持久化的字节码内容转换为I/O流
     * 通过I/O流的读取，进而将读取的内容转换为Java对象
     * 在转换过程中会重新创建对象new
     */

    //-----v1-----
    private final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    //-----v2-----
    //加此段代码可以防止序列化破坏单例
    //但是实际上还是实例化了两次，只不过新创建的对象没有被返回而已。
    private Object readResolve(){
        return INSTANCE;
    }
}
