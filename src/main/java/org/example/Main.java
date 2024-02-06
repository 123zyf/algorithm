package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyf
 * @Data 2024/2/5 - 11:09
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(Main.twoSum(ints, 21));
    }

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * @param nums 整数数组
     * @param target 整数目标值
     * @return
     *
     * Hash思想：将之前的元素在遍历的过程中去保存、当前元素与之前存储的元素能不能达到某种条件、满足要求ff
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maps = new HashMap<>();    //第一个参数是数组值、第二个是索引
        for (int i = 0; i < nums.length; i++) {
            if(maps.containsKey(target-nums[i])){   //如果(目标值-数组元素)得到的值依旧为数组的元素、说明这两个元素和为目标值
                return new int[]{i,maps.get(target-nums[i])};
            }
            maps.put(nums[i],i);    //maps值--->
                                    //          <---maps.containsKey(target-nums[i])
        }
        return new int[]{};
    }
}