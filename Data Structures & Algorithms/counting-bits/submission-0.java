class Solution {
    public int[] countBits(int n) {
        int[] oneBit = new int[n+1];

        int offset = 1;
        oneBit[0] = 0;
        for(int i=1;i<oneBit.length;++i){
            if (offset*2 == i) {
                offset = i;
            }
            oneBit[i] = 1 + oneBit[i - offset];

        }
        return oneBit;
    }
}
