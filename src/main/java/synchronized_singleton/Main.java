package synchronized_singleton;

class Main {
    public static void main(String[] args) throws InterruptedException {

       for(int i = 1; i< 7; i++){
           int finalI = i;
           Runnable runnable = new Runnable() {
               @Override
               public void run() {
                   System.out.println("Thread#" + finalI + " printing " + ConnectionSingleton.getInstance(finalI));
               }
           };
           Thread t = new Thread(runnable);
           t.start();
       }
    }
}
