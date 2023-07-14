package leetcode.ez;

public class TimeNeededtoBuyTickets2073 {

    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{2, 3, 2}, 2));
        System.out.println(timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0));
        System.out.println(timeRequiredToBuy(new int[]{84,49,5,24,70,77,87,8}, 3));
    }

    static int timeRequiredToBuy(int[] tickets, int k) {
        int rs = 0;
        while (true) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[k] == 0)
                    break;
                if (tickets[i] > 0) {
                    tickets[i]--;
                    rs++;
                }
            }
            if (tickets[k] == 0)
                break;
        }
        return rs;
    }
}
