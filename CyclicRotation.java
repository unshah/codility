class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int l = A.length; // define the array length
        
        int[] Temp = new int[l];
        int[] rev = new int[l];
        for (int i = 0; i < l; i++){
            Temp[i] = A[i];
            rev[i] = A[i];
        }
        int maxb =0;
        
        if(K>l){
            K = K-l;
        }
    
        if(K <= l){
            for(int i = l-1; i>=0; i-- ){
                int a = i+K; // set plus position
                int b = a-l; // new position
                if(b>maxb){
                    maxb = b;
                }
                if(b<0){
                    b = a;
                }
                A[b] = Temp[i];
            }
        }   
    return A; 
    }
}
