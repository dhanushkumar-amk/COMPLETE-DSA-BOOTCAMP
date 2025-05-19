package STRING;


// leetcode : 3024
// https://leetcode.com/problems/type-of-triangle/description/?envType=daily-question&envId=2025-05-19

public class TypeofTriangle {
    public static void main(String[] args) {

    }

    public String triangleType(int[] nums) {
        int index = 0;

        if ((nums[index] == nums[index + 1]) && (nums[index] == nums[index + 2]) && (nums[index + 1] == nums[index + 2]))
            return "equilateral";

        if ((nums[index] == nums[index + 1]) || (nums[index] == nums[index + 2]) || (nums[index + 1] == nums[index + 2]))
            return "isosceles";
        else
            return "";
    }
}
