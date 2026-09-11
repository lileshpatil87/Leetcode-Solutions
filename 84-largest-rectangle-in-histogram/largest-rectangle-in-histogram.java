class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> de = new ArrayDeque<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            if (de.isEmpty()) {
                de.push(i);
            } else {
                while (!de.isEmpty() && heights[i] < heights[de.peek()]) {
                    int height = heights[de.pop()];
                    int rb = i;
                    int lb = -1;
                    if (!de.isEmpty()) {
                        lb = de.peek();
                    }
                    int width = rb - lb - 1;
                    int area = width * height;
                    maxArea = Math.max(maxArea, area);
                }
                de.push(i);
            }
        }
        while (!de.isEmpty()) {
            int height = heights[de.pop()];
            int rb = heights.length;
            int lb = -1;
            if (!de.isEmpty()) {
                lb = de.peek();
            }
            int width = rb - lb - 1;
            int area = width * height;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}