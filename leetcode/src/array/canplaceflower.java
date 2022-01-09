class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        
        int len = flowerbed.length;
        int count = 1;  // count the number of continous empty plots.
        int numberOfSlots = 0;    // the total number of empty plots that coule be planted.
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                count++;
            } else {
               numberOfSlots += (count - 1) / 2;
                count = 0;
            }
        }
        
        if (count != 0) {
            numberOfSlots += count / 2;
        }
        
        return numberOfSlots >= n;
    }
}
