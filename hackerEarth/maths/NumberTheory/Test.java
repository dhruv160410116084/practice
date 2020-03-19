import java.util.*;

class Test {
 static   long d, x, y;

    public static void main(String args[]) throws Exception {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long m = scan.nextLong();

        long ans1 = exp(a,b,m);
        extendedEuclid(c, m);
        System.out.println(" exp: "+ans1+" d:"+d+" x="+((x*ans1)%m)+" y="+((y*ans1)%m));
       long ans2 = x;
        long ans = (ans1 * ans2)%m;
        System.out.println(ans);
    }

    static long exp(long x,long n,long m){
        if(n==0)
            return 1;
        else if (n%2 == 0)
            return exp((x*x)%m,n/2,m);
        else
            return (x*exp((x*x)%m,(n-1)/2,m))%m;
    }

   static  void extendedEuclid(long A, long B) {
        if(B == 0) {
            d = A;
            x = 1;
            y = 0;
        }
        else {
            extendedEuclid(B, A%B);
            long temp = x;
            x = y;
            y = temp - (A/B)*y;
        }
    }


}
//155984643