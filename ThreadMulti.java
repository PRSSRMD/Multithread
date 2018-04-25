/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest2_SO_10516085;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ITAdmin
 */
 public class ThreadMulti implements Runnable {
    private final view VIEW = new view();  
    public static int INCREMENT = 1;
    public static int DECREMENT = 10;
    private int type;
    
    
    ThreadMulti(int type)
    {
       this.type = type;
    }


    @Override
    public void run() {
      
        if (this.type == 0) {
            Inc();
        //} else if (this.type == 1) {
            //Dec();
        }
        
    }
    
    public void Inc() {
       String x =  VIEW.getThread1().getText() + " \n Writing Thread 1 Index Of ";
       for(int i = INCREMENT; INCREMENT <= 10; INCREMENT++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadMulti.class.getName()).log(Level.SEVERE, null, ex);
            }
            INCREMENT++;
            System.out.println("Writing Thread 1 Index Of - " +i);
            VIEW.getThread1().setText(x + " : " +i);
            setTime();
            Dec();
           
        }  
    }
   
 
    public void Dec() {
        String x =  VIEW.getThread2().getText() + " \n Writing Thread 2 Index Of ";   
        for(int i = DECREMENT; DECREMENT >= 1; DECREMENT--)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadMulti.class.getName()).log(Level.SEVERE, null, ex);
            }
            DECREMENT--;
            System.out.println("Writing Thread 2 Index Of - " +i);
            VIEW.getThread2().setText(x + " : " +i);
            setTime();
            Inc();
           
        }
         
    }
    
    public void setTime() {
        long time = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");    
        Date result = new Date(time);
        VIEW.getSecond().setText("Waktu : "+ sdf.format(result));
        System.out.println("Waktu : "+ sdf.format(result));
    }


  }
