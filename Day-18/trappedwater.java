
public class trappedwater {

    public static void trappedwater(int height[]) {
        int n = height.length;
        // Calculate left max boundary array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i],leftmax[i - 1]);
        }
        // Calculate  Right  max boundary array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }
        int trappedwaters = 0;
        for (int i = 0; i < n; i++) { // water level = min(rightmax,  left maxp;
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            // Calculate trap water formule (min-height)*width;
            trappedwaters += waterlevel - height[i];
        }
        System.out.print("Water level is:" + trappedwaters);
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        trappedwater(height);
    }
}
