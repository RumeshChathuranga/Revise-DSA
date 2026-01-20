package Q875;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length==0) return 0;
        int right = 0;
        int left = 1;

        for(int i : piles){
            right = Math.max(right,i);
        }

        while(left<right){
            int mid = (left+right)/2;
            if(canFinish( mid, piles, h))
                right = mid;
            else left = mid+1;
        }
        return left;

    }

    private boolean canFinish(int k, int[] piles, int h) {
        int hrs = 0;
        for(int pile : piles){
            hrs += (int) Math.ceil((double)pile/k);
        }
        return hrs <= h;
    }
}