class ExtEuc{
    static int d,x,y;
    public static void main(String[] args) {
        gcd(6,7);
        System.out.println(x);
    }

    static void gcd(int a,int b){
            if(b == 0){
                d=a;
                x=1;
                y=0;    
                return;
            }else{
                gcd(b,a%b);
                int temp = x;
                x=y;
                y = temp - (a/b)*y;
            }
            x= (x%b+b)%b;
    }
}