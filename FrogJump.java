class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count =0;
        do{
            X = X+D;
            count++;
        }while(X<Y);
    return count;
    }
}
