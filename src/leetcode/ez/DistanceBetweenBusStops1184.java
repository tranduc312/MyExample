package leetcode.ez;

public class DistanceBetweenBusStops1184 {

    public static void main(String[] args) {
        /*Input: distance = [1,2,3,4], start = 0, destination = 1
        Output: 1
        Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.*/
//        1234
//        0123
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0 , 1));
//        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0 , 3));
//        [8,11,6,7,10,11,2]
//        System.out.println(distanceBetweenBusStops(new int[]{8,11,6,7,10,11,2}, 0 , 3));
//        3,6,7,2,9,10,7,16,11
//        0 1 2 3 4 5  6 7  8
//        System.out.println(distanceBetweenBusStops(new int[]{3,6,7,2,9,10,7,16,11}, 6 , 2));
    }

    static int distanceBetweenBusStops(int[] distance, int start, int destination) {

        // two way
        int firstWay = 0;
        int secondWay = 0;
        for (int i = start; i != destination; i = (i + 1) % distance.length)
            firstWay += distance[i];
        for (int i = destination; i != start; i = (i + 1) % distance.length)
            secondWay += distance[i];
        return firstWay > secondWay ? secondWay : firstWay;
    }
}
