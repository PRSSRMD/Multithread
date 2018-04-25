/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest2_SO_10516085;
/**
 *
 * @author ITAdmin
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO public static void main(String arg[])
        (new Thread(new ThreadMulti(0))).start();
        //(new Thread(new ThreadMulti(1))).start();
    }
}
