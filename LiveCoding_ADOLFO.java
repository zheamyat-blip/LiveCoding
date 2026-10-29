/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding_adolfo;

/**
 *
 * @author Admin
 */
public class LiveCoding_ADOLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
          int number = EvenorOdd(12);
        
        System.out.println(number);
        
        int check = classifyTriangle(1, 0, 1);

        System.out.println(check);

    }

    // Problem No. 1
    static int EvenorOdd(int number) {

        if (number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    // Problem No. 2
    static int classifyTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }
        else if (a == b && b == c) {
            return 1;
        }
        else if (a == b || a == c || b == c) {
            return 2;
        }else {
        return 3;
    }
}
}
        
        
        
        
        
        
        
        
 
    

