/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivosread;

/**
 *
 * @author Edgard Lamounier JR
 */
public class JaArquivosRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ReadTextFile application = new ReadTextFile();

      application.openFile();
      application.readRecords();
      application.closeFile();
    } // end  main
} // end class JaArquivosRead
