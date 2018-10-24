
// A simple Java program to  
//count pairs with difference k 
import java.util.*; 
import java.io.*; 

public class GFG { 
  
    static int countPairsWithDiffK(int arr[],  
                                    int n, int k) 
    { 
        int count = 0; 
  
        // Pick all elements one by one 
        for (int i = 0; i < n; i++)  
        { 
            // See if there is a pair 
            // of this picked element 
            for (int j = i + 1; j < n; j++) 
                if (arr[i] + arr[j] == k || 
                    arr[j] + arr[i] == k) 
                    count++; 
        } 
        return count; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 5, 3, 4, 8 ,7, 2 ,6 }; 
        int n = arr.length; 
        int k = 10; 
        System.out.println("Count of pairs with given sum is "
                        + countPairsWithDiffK(arr, n, k)); 
    } 
} 
