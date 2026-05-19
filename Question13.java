import java.util.*;
import java.util.Arrays;

public class Question13 {
    public int minpatches(int[] nums, int n, int i) {
        long miss = 1;
        int patches = 0;
        while (miss <= n) {
            if ((i < nums.length) && (nums[i] <= miss)) {
                miss += nums[i];
                i++;
            } else {
                miss += miss;
                patches++;
            }
        }
        return patches;
    }

}



