
package helloworld;

import java.util.Scanner;



/**
 *
 * @author Tyler Buell
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String wrld = " World!";
        String name;
        int byear;
        int bmonth;
        int age;
        int monthsOld;
        
        
        
        
        System.out.println("Hello" + wrld);
        
        
        Scanner nameScan = new Scanner(System.in);
        System.out.print("Enter Your Name >> ");
        name = nameScan.nextLine();
        System.out.println("");
        System.out.println("Hello " + name);
        
        
        
        Scanner bmonthScan = new Scanner(System.in);
        System.out.println("When is your birth month number? (EX: MAY=5 DEC=12)  >> ");
        bmonth = bmonthScan.nextInt();
        
        
        
        
        Scanner byearScan = new Scanner(System.in);
        System.out.println("What year were you born? (EX: 1969 2002) >> ");
        byear = byearScan.nextInt();
        
        age = (2017 - byear);
        monthsOld = (bmonth - 9);
        
        if (monthsOld < 0) {
            monthsOld *= -1;
                    }
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("Congrats " + name + " You are " + age + " Years and "+ monthsOld + " months old!");
        System.out.println("");
        System.out.println("Thanks for your info. Goodbye");
        System.out.println("--------------------------------------------------");
       
        
        
    }
            
    
}
