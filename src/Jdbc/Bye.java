package Jdbc;

public class Bye extends Thread {

    @Override
    public void run()  {
        for (int i = 1;i<=5;i++)
        {
            System.out.println("Jdbc.Hello Baby");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}

class Tataa extends Thread {
    @Override
    public void run()  {
        for (int i = 1;i<=5;i++)
        {
            System.out.println("Jdbc.Hello Boy");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }


}

class Lalu
{
    public static void main(String[] args) throws InterruptedException {
        Bye bye = new Bye();
        Tataa tataa = new Tataa();

        bye.start();
        tataa.start();
        System.out.println("GO GOA GONE");
    }
}