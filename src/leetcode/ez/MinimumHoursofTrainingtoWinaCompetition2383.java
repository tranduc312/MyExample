package leetcode.ez;

public class MinimumHoursofTrainingtoWinaCompetition2383 {

    public static void main(String[] args) {
//        System.out.println(minNumberOfHours(5, 3, new int[]{1,4,3,2}, new int[]{2,6,3,1}));
//        System.out.println(minNumberOfHours(2, 4, new int[]{1}, new int[]{3}));
        System.out.println(minNumberOfHours(1, 1, new int[]{1,1,1,1}, new int[]{1,1,1,50}));
    }

    static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int rs = 0;
        int sumEnergy = 0;
        int needEx = 0;
        for (int i : energy) sumEnergy += i;
        int indexMax = 0;
        int max = 0;
        for (int i = 0; i < experience.length; i++) {
            if (max < experience[i]) {
                indexMax = i;
                max = experience[i];
            }
        }
        for (int i = indexMax; i > 0; i--) {
            needEx += experience[indexMax] - experience[indexMax - 1];
        }
        if (initialEnergy > sumEnergy && initialExperience > needEx) return 0;
        return (sumEnergy - initialEnergy + 1) + (needEx - initialExperience + 1);
    }
}
