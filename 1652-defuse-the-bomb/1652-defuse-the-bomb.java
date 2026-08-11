class Solution {
    public int[] decrypt(int[] code, int k) {
        int sum=0;
        int n = code.length;
        int decoded[] = new int[n];
        if(k==0){
            return decoded;
        }

        for(int i=0; i<code.length; i++){
            sum=0;
            if(k>0){
                for(int j=1; j<=k;j++){
                    sum+=code[(i+j)%n];
                }
            }
            if(k<0){
                for(int j=1;j<=-k;j++)
                sum+=code[(i-j+n)%n];
            }
            decoded[i] = sum;
            }
    return decoded;
    }
}