package creationalpattern.singletonpattern.registrationtypesingleton;

public class ThreadLocalSingletonDemo {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ThreadLocalSingleton.getInstance());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ThreadLocalSingleton.getInstance());
            }
        });

        t1.start();
        t2.start();
        System.out.println("end");
    }
}
