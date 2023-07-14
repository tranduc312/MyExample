package anthoer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//		String ca = "47e1aaa3-2f85-4bd7-a7ac-63dc7f290682,dae40f08-ac75-43d4-86c9-0cc68a83b2e8,0cc68a83b2e8";
//		String list = "47e1aaa3-2f85-4bd7-a7ac-63dc7f290682,dae40f08-ac75-43d4-86c9-0cc68a83b2e8,15b68abd-a581-493a-a343-158615b942d9";
//		List<String> list1 = Arrays.asList(list.split(","));
//		List<String> list2 = Arrays.asList(ca.split(","));
//		System.out.println(check(list1, list2));
		/*List<Integer> list = new ArrayList<>();
		int n = 50;
		*//**
		 * 1. 10
		 * 2. 15
		 * 3. 22
		 * 4. 33
		 * 5. 49
		 * 6. 73
		 *//*
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		System.out.println(getCapacity(list));*/

//		String s = 3 + 3 + "" + 3 + 3 + "23";
//		System.out.println(s);
//		List<Object> objects = new ArrayList<>();
//		System.out.println(objects.get(0));
		/*Double b = null;
		Double c;
		double d;
		System.out.println(c = b);
		System.out.println(d = b);*/
		System.out.println(Arrays.asList(7,15).contains(7));
		System.out.println(Arrays.asList(7,15).contains(15));
		System.out.println(Arrays.asList(7,15).contains(11));
	}

	static int getCapacity(List<Integer> list) throws NoSuchFieldException, IllegalAccessException {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		return ((Object[]) field.get(list)).length;
	}


	static boolean check(List<String> list1, List<String> list2) {
		return list1.containsAll(list2);
	}
}
