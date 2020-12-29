/**
 * Reverse Integer
 */
public class Main {
	public static void main(String[] args) {
		print(new Solution().reverse(123));
		print(new Solution().reverse(-123));
		print(new Solution().reverse(120));
		print(new Solution().reverse(0));
	}

	private static void print(Object obj){
		System.out.println(obj);
	}


}

/**
 * StringBuilder 풀이.
 * */
/*
class Solution {
	public int reverse(int x) {
		String s = String.valueOf(x);
		String reverseValue = x < 0 ?
			new StringBuilder(s.substring(1 , s.length())).append("-").reverse().toString()
			: new StringBuilder(String.valueOf(x)).reverse().toString();

		try {
			return Integer.parseInt(reverseValue);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}*/

/**
 * int 풀이.
 * */
class Solution {
	public int reverse(int x) {
		if ( x == 0 || x == Integer.MIN_VALUE){
			return 0;
		}

		long result = 0;

		while (x != 0) {
			int digit = x%10;
			x /= 10;

			result = result*10 + digit;

			/* 조합중 Integer.MAX_VALUE 를 넘어가는 경우가 발생. */
			if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
				return 0;
			}
		}

		return (int)result;
	}
}