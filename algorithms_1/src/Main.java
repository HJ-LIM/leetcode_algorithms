import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Two Sum
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(join(new Solution().twoSum(new int[]{3,2,4} , 6)));
		System.out.println(join(new Solution().twoSum(new int[]{3,3} , 6)));

	}

	private static String join(int[] arr){
		return Arrays.stream(arr)
			.mapToObj(String::valueOf)
			.collect(Collectors.joining(","));
	}
}


class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int remain = target - nums[i];

			if(map.containsKey(remain)){
				result[0] = map.get(remain);
				result[1] = i;
				return result;
			}else{
				map.put(nums[i] , i);
			}
		}

		return result;
	}
}