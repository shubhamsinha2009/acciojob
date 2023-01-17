
// Question Link -- https://course.acciojob.com/idle?question=71891482-69b9-4bd3-a1ae-1945179ee04f

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void sqrt(int x) {

		  if(x == 0){
			  System.out.println(0);
            return;
        }
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid <= x/mid){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
		 System.out.println(ans);
            
    }

  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int A = sc.nextInt();
	  
    sqrt(A);
		
	}
}
