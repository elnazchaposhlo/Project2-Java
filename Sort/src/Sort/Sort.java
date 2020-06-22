/*
 * @author Elnaz Chaposhlo
*/
import sorting.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import algorithmDesign.Sequences;

public class ass2 {
	//static long n = 100; // Question 2 part a
	//static long n = 10; //Question 3 part b
	static long t11 = 0;
	static long t12 = 0;
	static long t13 = 0;
	static long t14 = 0;
	//static long t15 = 0;
    static long t21 = 0;
    static long t22 = 0;
    static long t23 = 0;
    static long t24 = 0;
    //static long t25 = 0;
    static long avg1 = 0;
    static long avg2 = 0;
    static long avg3 = 0;
    static long avg4 = 0;
    //static long avg5 = 0;
    //static Long rK[] = new Long [100000];
    //static Long rK1[] = new Long [100000];
    //static Long rK2[] = new Long [100000];
    //static Long rK3[] = new Long [100000];
    //static Long rK4[] = new Long [100000];
    //static String[] rK = new String[100000];
    //static String[] rK1 = new String[100000];
    //static String[] rK2 = new String[100000];
    //static String[] rK3 = new String[100000];
    //static String[] rK4 = new String[100000];
    //static String[] rK5 = new String[100000];
    
    static String rW1_10;
    static String rW2_10;
    static String rW1_20;
    static String rW2_20;
    static String rW1_50;
    static String rW2_50;
    static String rW1_100;
    static String rW2_100;
    

  //create random string
  	static String randomword(int v)
  	{
  		String rs="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
  		StringBuilder str= new StringBuilder(v);
  		
  		for(int i = 0; i < v; i++)
  		{
  			int b = (int)(rs.length()*Math.random());
  			str.append(rs.charAt(b));
  		}
  		return str.toString();
  	}
	
    public static void main(String[] args) {
		//Random r = new Random( );
		
		//for(int j = 0; j < 100; j++)//Question 2
		//for(int j = 0; j < 10; j++)
		//{
			
			//for(int i = 0; i < 100000; i++)
				//{
			//Random strings of length 4. We change 4 to 6, 8, and 10 in order to do for random strings of length 6, 8, and 10. For Question 3 part c. 
				//rK1[i] = randomword(10);
				//rK2[i] = randomword(10);
				//rK3[i] = randomword(10);
				//rK4[i] = randomword(10);
				//rK5[i] = randomword(10);
					
					//rK[i] = r.nextLong();
					//rK1[i] = rK[i];
					//rK2[i] = rK[i];
					//rK3[i] = rK[i];
					//rK4[i] = rK[i];
					
			     //}
				
				//Merge sort
			    //t11 = System.currentTimeMillis();
			    //Sort.mergeSort(rK1);
			  	//t21 = System.currentTimeMillis(); 
			  	//avg1 += (t21-t11)*10000;
					  
			    //Quick sort
				//t12 = System.currentTimeMillis();
				//Sort.quicksort(rK2);
			  	//t22 = System.currentTimeMillis(); 
			  	//avg2 += (t22-t12)*10000;
				
				//Heap sort
				//t13 = System.currentTimeMillis();
				//Sort.heapsort(rK3);
			  	//t23 = System.currentTimeMillis(); 
			  	//avg3 += (t23-t13)*10000;
				
				//Dual-pivot Quick sort
				//t14 = System.currentTimeMillis();
				//Arrays.sort(rK4);
			  	//t24 = System.currentTimeMillis(); 
			  	//avg4 += (t24-t14)*10000;
			  	
			  	//Radix sort
			  	//t15 = System.currentTimeMillis();
			  	//RadixSort.radixSortA(rK5 , 10);
			  	//t25 = System.currentTimeMillis(); 
			  	//avg5 += (t25-t15)*10000;
    	for(int i = 0; i < 1000; i++)
		{		
		rW1_10 = randomword(10);
		rW2_10 = randomword(10);
		rW1_20 = randomword(20);
		rW2_20 = randomword(20);
		rW1_50 = randomword(50);
		rW2_50 = randomword(50);
		rW1_100 = randomword(100);
		rW2_100 = randomword(100);
		
		t11 = System.currentTimeMillis();
		Sequences.editDistance(rW1_10,rW2_10);
		t21 = System.currentTimeMillis();
		avg1 += (t21-t11)*10000;
		
		t12 = System.currentTimeMillis();
		Sequences.editDistance(rW1_20,rW2_20);
		t22 = System.currentTimeMillis();
		avg2 += (t22-t12)*10000;
		
		t13 = System.currentTimeMillis();
		Sequences.editDistance(rW1_50,rW2_50);
		t23 = System.currentTimeMillis();
		avg3 += (t23-t13)*10000;
		
		t14 = System.currentTimeMillis();
		Sequences.editDistance(rW1_100,rW2_100);
		t24 = System.currentTimeMillis();
		avg4 += (t24-t14)*10000;
	
		}	 
		     System.out.println("The average time for the edit distance for word of length 10 is : " + avg1/10000);
			 System.out.println("The average time for the edit distance for word of length 20 is : " + avg2/10000);
			 System.out.println("The average time for the edit distance for word of length 50 is : " + avg3/10000);
			 System.out.println("The average time for the edit distance for word of length 100 is : " + avg4/10000);
			 
			     //System.out.println("The average time for Merge sort is : " + avg1/10000*n);
				 //System.out.println("The average time for Quick sort is : " + avg2/10000*n);
				 //System.out.println("The average time for Heap sort is : " + avg3/10000*n);
				 //System.out.println("The average time for Dual-pivot Quick sort is : " + avg4/10000*n);
				 //System.out.println("The average time for Radix sort is : " + avg5/10000*n);
	}
		
	       
}