import java.util.*;
import java.lang.Math;
import java.math.*;

//solved

class CHEFINSQ{
        public static void main(String args[]){
            try {
                Scanner scan = new Scanner(System.in);
                int T = scan.nextInt();
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<T;j++){
                    int N = scan.nextInt();
                    int K = scan.nextInt();
                    int arr[] = new int[N];
                    for(int i=0;i<N;i++){
                        arr[i] = scan.nextInt();
                    }
                       long ans =  solve(arr,K);
                      sb.append(ans+"\n");
                }
                System.out.println(sb);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }


       static long solve(int arr[] ,int k){
           Arrays.sort(arr);
           int count_till_k = 0;
           int count_after_k = 0; 

           for(int i=0;i<arr.length;i++){
                if(i<k && arr[i] == arr[k-1])
                    count_till_k++;
                 if(i>=k && arr[i] == arr[k-1])
                    count_after_k++;
           }

        //    System.out.println(count_till_k+" "+count_after_k);
           long ans = ncr(count_till_k+count_after_k,count_till_k);
           return ans;
       }

 static long ncr(int n, int r) { 
        long p = 1, k = 1; 
        if (n - r < r)
        { 
            r = n - r; 
        } 
  
        if (r != 0) { 
            while (r > 0) { 
                p *= n; 
                k *= r; 
  
                long m = __gcd(p, k); 
                p /= m; 
                k /= m; 
  
                n--; 
                r--; 
            } 
  
        } else { 
            p = 1; 
        } 
        return p;
    } 
  
    static long __gcd(long n1, long n2) { 
        long gcd = 1; 
  
        for (int i = 1; i <= n1 && i <= n2; ++i) { 
           
            if (n1 % i == 0 && n2 % i == 0) { 
                gcd = i; 
            } 
        } 
        return gcd; 
    }
}