package leetcode.ez;

import java.util.*;


public class MinimumIndexSumTwoLists599
{

	public static void main(String[] args)
	{
//		System.out.println(findRestaurant(
//				new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
//				new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" }));
//		System.out.println(findRestaurant(
//				new String[] { "Shogun","Tapioca Express","Burger King","KFC" },
//				new String[] { "KFC","Shogun","Burger King" }));
		System.out.println(findRestaurant(
				new String[] { "happy","sad","good" },
				new String[] { "sad","happy","good" }));
	}

	static String[] findRestaurant(String[] list1, String[] list2)
	{
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; ++i)
		{
			for (int j = 0; j < list2.length; ++j)
			{
				if (list1[i].equals(list2[j]))
				{
					map.put(list1[i], i + j);
				}
			}
		}
		List<String> rs = new ArrayList<>();
		int min = Collections.min(map.values());
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() == min) {
				rs.add(m.getKey());
			}
		}
		return rs.toArray(new String[0]);
	}
}
