/*
Lab 4
Partners: Andrew Kaiser and Evan Schroeder
Date: 09/22/2020
*/

import java.util.Random;

//import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    Random r = new Random(); 
    int randomInt = r.nextInt(50) + 1; 

    System.out.println("The Random number is:" + randomInt);
//if (randomInt > '0');

   for (int a = randomInt; a >= 0; a--) {
        System.out.println (a);  
  }
    if (randomInt<=25)
    {
      System.out.println ("Ahoy Mateys!"); 
    } 
    else if (randomInt>25 && randomInt<42)
   {
    System.out.println("CannonBall");
   }
   else
  {
    System.out.println("Blast Off!");
  }

  }
} 


