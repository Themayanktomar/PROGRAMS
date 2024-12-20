package multithreadingexample;

public class DoubleLockSingleton {

    private static volatile DoubleLockSingleton instance;

    private DoubleLockSingleton()
    {

    }
    public static DoubleLockSingleton getInstance()
    {
        if (instance==null)
        {
            synchronized (DoubleLockSingleton.class)
            {
                if (instance == null)
                {
                     instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
