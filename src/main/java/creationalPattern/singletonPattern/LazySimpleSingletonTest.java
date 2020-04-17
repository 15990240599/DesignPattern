package creationalPattern.singletonPattern;

public class LazySimpleSingletonTest implements Runnable {

    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new LazySimpleSingletonTest());
        Thread t2 = new Thread(new LazySimpleSingletonTest());
        t1.start();
        t2.start();
    }
}
