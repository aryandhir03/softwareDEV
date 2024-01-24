
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author dhira
 */
public class Arraydemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a Word");
        Scanner sc = new Scanner(System.in);
        
        String myWord = sc.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for ( int i =0;i<myLetters.length;i++){
            myLetters[i] = myWord.charAt(i);
        }
        System.out.println("Printing in Reverse");
        
        for(int i = myLetters.length -1; i>=0;i--){
            System.out.println(myLetters[i]);
        }
        for(int i = myLetters.length -1; i>=0;i--){
            System.out.print(myLetters[i]);
        }
    }
}
