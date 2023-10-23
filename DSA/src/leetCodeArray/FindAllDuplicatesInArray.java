package leetCodeArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> duplicates = new ArrayList<Integer>();

        for(int i = 0; i < len; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0){
                duplicates.add(index + 1);
            }

            nums[index] = nums[index] * -1;
        }

        return duplicates;
    }

}
