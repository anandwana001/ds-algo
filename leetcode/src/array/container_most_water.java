/* we are going to use two pointer approach
fix a point at low and changing other point height calculating their area 
and update the max area to be return*/




public int MaxArea(int[] height) {                        //int []  height is the array of height given
        int low = 0, high = height.Length - 1;
        int max=0;
        while (low < high)
        {
            int area = Math.Min(height[low], height[high]) * (high - low);
            max = Math.Max(area, max);
            if (height[low] < height[high]) low++;
            else high--;
        }
        return max;
}
