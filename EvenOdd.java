class EvenOdd { 
    public static void main(String[] args) { 
            Runnable r = new Runnable1(); 
            Thread t = new Thread(r); 
            Runnable r2 = new Runnable2(); 
            Thread t2 = new Thread(r2); 
            t.start(); 
            t2.start();} 
    } 
    class Runnable2 implements Runnable { 
        public void run() { 
            System.out.println("thread 1"); 
            System.out.println("odd numbers"); 
           { for (int i = 1; i <= 11; i += 2) 
                System.out.println(i);}} 
    } 
    class Runnable1 implements Runnable { 
        public void run() { 
            System.out.println("thread 2"); 
            System.out.println("even numbers"); 
           { for (int i = 0; i < 11; i += 2) 
                System.out.println(i);} } 
    } 