class BinExp{
    public static void main(String[] args) {
        long a = 20;
        long n = 2147483000;
        // System.out.prlongln(expRec(a, n));
        System.out.println(expItr(a, n));

    }

    static long expRec(long a,long n){
        // System.out.prlongln("call :a="+a+" n: "+n);
        if(n==0){
            return 1;
        }
        else if(n%2 == 0){
            // System.out.prlongln("      even  a*a"+(a*a)+" n="+(n/2));
            return expRec(a*a,n/2);
        }
        else{
            // System.out.prlongln("      odd a*a"+(a*a)+" n="+((n-1)/2));
            return a*expRec(a*a,(n-1)/2);
        }
    }


    static long expItr(long a,long b){

        long res = 1;
        while(b>0){
            // System.out.prlongln("in loop  a="+a+" b= "+b+"res ="+res);
            if((b & 1) == 1){
                res = res * a;

            }
            a = a*a;
            b>>=1;
            // System.out.prlongln(" b>>1   "+(b));
        }
        return res%10;
    }
    

}