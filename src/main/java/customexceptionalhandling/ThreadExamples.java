package customexceptionalhandling;

public class ThreadExamples extends Thread{

    @Override
    public void run()
    {
        System.out.println("thread 1 executed...");
    }
}


class Mayank extends Thread
{
    @Override
    public void run()
    {
        System.out.println("thead 2 is executed..");
    }
}


class Mail{

    public static void main(String[] args) throws InterruptedException {

        ThreadExamples threadExamples = new ThreadExamples();
        Mayank mayank = new Mayank();




        mayank.setPriority(Thread.MAX_PRIORITY);
        threadExamples.start();

        mayank.start();
    }
}