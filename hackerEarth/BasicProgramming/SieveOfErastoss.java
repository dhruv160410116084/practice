
class SieveOfErastoss{
        public static void main(String[] args) {
            int IS_PRIME = 0;
            int NOT_PRIME = 1;

            int n = 100;
            int arr[] = new int [n];
            for(int i = 2; i*i < n;i++){
                if(arr[i] == IS_PRIME){
                    for(int j=i*i;j<n;j += i){
                        arr[j] = NOT_PRIME;
                    }
                }
            }

            for(int i=2;i<n;i++){
                if(arr[i] == IS_PRIME)
                    System.out.println(i);
            }
        }
}