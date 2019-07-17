class Solution {
    public int[] sortedSquares(int[] A) {
        int[] a = new int[A.length];
        int low = 0;
        int high = A.length - 1;
        int index = A.length - 1;
        while (low <= high)
        {
            // if (low == high)
            // {
            //     a[index--] = A[low] * A[low];
            //     break;
            // }
            
            if (Math.abs(A[low]) > Math.abs(A[high]))
            {
                a[index--] = A[low] * A[low];
                low ++;
            }
            else
            {
                a[index--] = A[high] * A[high];
                high --;
            }
        }
        return a;
    }
}