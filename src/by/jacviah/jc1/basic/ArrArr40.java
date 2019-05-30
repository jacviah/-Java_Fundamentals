/*Three conditions hold:

1. The position of next number is calculated by decrementing row number of previous number by 1, and incrementing the column number of previous number by 1. At any time, if the calculated row position becomes -1, it will wrap around to n-1. Similarly, if the calculated column position becomes n, it will wrap around to 0.

2. If the magic square already contains a number at the calculated position, calculated column position will be decremented by 2, and calculated row position will be incremented by 1.

3. If the calculated row position is -1 & calculated column position is n, the new position would be: (0, n-2)*/


package by.jacviah.jc1.basic;

import java.io.*;

public class ArrArr40 {
    // Function to generate odd sized magic squares 
    static void calculate() 
    { 
    	int n = 5;
        int[][] magicSquare = new int[n][n]; 
          
        // Initialize position for 1 
        int i = n/2; 
        int j = n-1; 
   
        // One by one put all values in magic square 
        for (int num=1; num <= n*n; ) 
        { 
            if (i==-1 && j==n) //3rd condition 
            { 
                j = n-2; 
                i = 0; 
            } 
            else
            { 
                //1st condition helper if next number  
                // goes to out of square's right side 
                if (j == n) 
                    j = 0; 
                      
                //1st condition helper if next number is  
                // goes to out of square's upper side 
                if (i < 0) 
                    i=n-1; 
            } 
              
            //2nd condition 
            if (magicSquare[i][j] != 0)  
            { 
                j -= 2; 
                i++; 
                continue; 
            } 
            else
                //set number 
                magicSquare[i][j] = num++;  
                  
            //1st condition 
            j++;  i--;  
        } 
   
        // print magic square 
        System.out.println("The Magic Square for "+n+":"); 
        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
        for(i=0; i<n; i++) 
        { 
            for(j=0; j<n; j++) 
                System.out.print(magicSquare[i][j]+" "); 
            System.out.println(); 
        } 
    } 
}
