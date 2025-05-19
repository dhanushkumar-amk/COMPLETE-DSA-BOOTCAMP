package STRING;


// leetcode : 3024
// https://leetcode.com/problems/type-of-triangle/description/?envType=daily-question&envId=2025-05-19

public class TypeofTriangle {
    public static void main(String[] args) {

    }

    public String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2])
            return "equilateral";
        else if ((nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2])
                && nums[0] + nums[1] > nums[2]
                && nums[1] + nums[2] > nums[0]
                && nums[0] + nums[2] > nums[1])
            return "isosceles";
        else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]
                && nums[0] + nums[1] > nums[2]
                && nums[1] + nums[2] > nums[0]
                && nums[0] + nums[2] > nums[1])
            return "scalene";
        return "none";
    }
}
