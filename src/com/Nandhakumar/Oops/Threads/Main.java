package com.Nandhakumar.Oops.Threads;
// creating class
// now extend thread class, when we extend thread class with we create the class that is thread class
// thread class compulsory had a public run method
class MorningGym extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Morning gym");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.fillInStackTrace();
            }
        }
    }
}
// creating class
// now extend thread class, when we extend thread class with we create the class that is thread class
// thread class compulsory had a public run method
class EveningGym extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Evening gym");
            // we can delay to pause the method using via sleep() in thread
            // sleep() we need to surround try catch block because it give InterruptedException
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.fillInStackTrace();
            }
        }
    }
}
// important notes for threads
// without threads not run multiple methods at the same time
public class Main {
    public static void main(String[] args) {
        // creating object for thread classes
        MorningGym morningGym = new MorningGym();
        EveningGym eveningGym = new EveningGym();
        // now call the thread class run() using start()
        // now we can set priority to which task is most if you want can set that task priority
        morningGym.setPriority(1); // low priority means low chances of thread working
        eveningGym.setPriority(10); // high priority means high chances of thread working
        morningGym.start();
        eveningGym.start();
    }
}
