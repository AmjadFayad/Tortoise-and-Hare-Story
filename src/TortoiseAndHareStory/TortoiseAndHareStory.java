
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TortoiseAndHareStory;

/**
 *
 * @author AmjadFayad
 * @version 1.0
 */
public class TortoiseAndHareStory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Thread tortoise = new Race();         
        tortoise.start();                         
        for (int a = 1; a < 51; a++) {

            System.out.println("Distance covered by HARE      = " + (a)+ "m");
        }

        System.out.println("!!!!!!!!!!!!!!!HARE IS GOING TO SLEEP!!!!!!!!!!!!!!!!!!!!!");   

        try {
            Thread.sleep(3000);                           
        } catch (InterruptedException ie) {

        }

        System.out.println("!!!!!!!!!!!!!!HARE AGAIN STARTED THE RACE !!!!!!!!!!!!!!!!");          

        for (int b = 51; b < 101; b++) {
            System.out.println("Distance covered by HARE      =  " + (b) + "m");
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!HARE HAS COMPLETED THE  RACE !!!!!!!!!!!!!!!!!!!");

    }
}

class Race extends Thread {

    public void run() {
        for (int c = 1; c < 101; c++) {
            System.out.println("Distance covered by TORTOISE =  " + c + "m");
        }
        System.out.println("!!!!!!!!!!!!!!!!TORTOISE HAS WON THE RACE !!!!!!!!!!!!!!!!!!!!!");     

    }

}
