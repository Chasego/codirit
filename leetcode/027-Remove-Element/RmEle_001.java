public class Solution {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        int j = 0;
        for(int i = 0;  i < len; i++){
            if(A[i] != elem){
                A[j] = A[i];
                j++;

            }
        }
        
        return j;
    }
}
