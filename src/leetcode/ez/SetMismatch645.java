package leetcode.ez;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SetMismatch645
{

	public static void main(String[] args)
	{
//		System.out.println(findErrorNums(new int[]{1,2,2,4}));
		System.out.println(findErrorNums(new int[]{1,1}));
	}

	static int[] findErrorNums(int[] nums) {
		int n = nums.length;
		List<Integer> rs = new ArrayList<>();
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		List<Integer> duplicates = IntStream.of(nums)
				.boxed()
				.collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
				.entrySet()
				.stream()
				.filter( p -> p.getValue() > 1 )
				.map( Map.Entry::getKey )
				.collect( Collectors.toList() );
		rs.addAll(duplicates);
		for (int i = 1; i < n; i++) {
			if (!set.contains(i)) {
				rs.add(i);
			}
		}
		return rs.stream().mapToInt(i->i).toArray();
	}
}
