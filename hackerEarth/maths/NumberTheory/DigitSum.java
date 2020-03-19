import java.util.*;

class DigitSum{
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // long t = s.nextLong();
        long d =   Long.valueOf("900000000000");
        long dec = Long.valueOf("100000000000");
        long a = Long.valueOf("199999999999");
        StringBuilder sb = new StringBuilder();
        long temp_d = d;
        int ctr = 0;
        for(long i =0;i<20;i++){
            System.out.println(" i:"+i);
            if(ctr<=11){
                temp_d = temp_d/10;
                System.out.println("temp : "+temp_d);
                 a = a+temp_d;
                sb.append(a+"\n");
                ctr++;
            }else{
                d = d-dec;
                temp_d =d;
                ctr =0;
                a++;
                
            }

            
        }


        System.out.println(sb);  
    }
}


