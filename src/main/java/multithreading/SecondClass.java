package threading;
public class SecondClass extends Thread {
         @Override
          public void run() {
           try {
             loop();
            } catch(Exception e) {
              System.out.println("exception is" + e);
              }
          }

         public void loop() throws InterruptedException {
          for(int i = 0; i <= 10; i++) {
            Thread t = Thread.currentThread();
            String threadname = t.getName();
            if(threadname.equals("First Thread")) {
               System.out.println(t.getName()); Thread.sleep(5000);
              } else {
                  System.out.println(t.getName());
            	  Thread.sleep(2200);
             }
            System.out.println("i==" + i);   
           }
         }
         
         public void run(int a){
        	 System.out.println("inside overloaded run"+a);
         }
         }