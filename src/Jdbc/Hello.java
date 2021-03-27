package Jdbc;

public class Hello extends Thread {
    @Override
    public void run() {






            for (int i = 1; i <= 5; i++) {
                System.out.println("Jdbc.Hello");

                try {
                    Thread.sleep(100);
                }catch(InterruptedException e)
                {e.printStackTrace();}
            }
        }




}


class Hiii extends Thread {
    @Override
    public void run() {






        for (int i = 1; i <= 5; i++) {
            System.out.println("Hiiii");

            try {
                Thread.sleep(100);
            }catch(InterruptedException e)
            {e.printStackTrace();}
        }
    }




}

 class HiiHello {

    public static void main(String[] args)
    {

        Hiii hii = new Hiii();
        Hello hello = new Hello();

        hii.start();
        hello.start();
    }
}
