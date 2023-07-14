package leetcode.ez;

import java.util.Arrays;
import java.util.List;


public class CanPlaceFlowers605
{
	public static void main(String[] args)
	{
		System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
		System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
	}

	static boolean canPlaceFlowers(int[] flowerbed, int n) {
//		if (flowerbed == null | n == 0) return true;
		List<Integer> list = Arrays.asList(Arrays.stream(flowerbed).boxed().toArray(Integer[]::new));
		int count = 0;
		// case first
		for (int i = 1; i < list.size(); ++i) {
			if (list.get(--i) == 1) {

			} else {

			}
		}
		return false;
	}
}
