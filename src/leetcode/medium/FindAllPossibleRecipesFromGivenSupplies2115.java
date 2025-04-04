package leetcode.medium;

import java.util.*;

public class FindAllPossibleRecipesFromGivenSupplies2115 {

    public static void main(String[] args) {
        System.out.println(findAllRecipes(new String[]{"bread"},
                Arrays.asList(Arrays.asList("yeast","flour")),
                new String[] {"yeast","flour","corn"}));

        System.out.println(findAllRecipes(new String[] {"bread","sandwich"},
                Arrays.asList(Arrays.asList("yeast","flour"), Arrays.asList("bread","meat")),
                new String[] {"yeast","flour","meat"}));

        System.out.println(findAllRecipes(new String[]{"bread","sandwich","burger"},
                Arrays.asList(Arrays.asList("yeast","flour"), Arrays.asList("bread","meat"), Arrays.asList("sandwich","meat","bread")),
                new String[] {"yeast","flour","meat"}));

        System.out.println(findAllRecipes(new String[]{"bread"},
                Arrays.asList(Arrays.asList("yeast","flour")),
                new String[] {"yeast"}));

        System.out.println(findAllRecipes(new String[]{"xevvq","izcad","p","we","bxgnm","vpio","i","hjvu","igi","anp","tokfq","z","kwdmb","g","qb","q","b","hthy"},
                Arrays.asList(Arrays.asList("wbjr"),Arrays.asList("otr","fzr","g"),Arrays.asList("fzr","wi","otr","xgp","wbjr","igi","b"),Arrays.asList("fzr","xgp","wi","otr","tokfq","izcad","igi","xevvq","i","anp"),Arrays.asList("wi","xgp","wbjr"),Arrays.asList("wbjr","bxgnm","i","b","hjvu","izcad","igi","z","g"),Arrays.asList("xgp","otr","wbjr"),Arrays.asList("wbjr","otr"),Arrays.asList("wbjr","otr","fzr","wi","xgp","hjvu","tokfq","z","kwdmb"),Arrays.asList("xgp","wi","wbjr","bxgnm","izcad","p","xevvq"),Arrays.asList("bxgnm"),Arrays.asList("wi","fzr","otr","wbjr"),Arrays.asList("wbjr","wi","fzr","xgp","otr","g","b","p"),Arrays.asList("otr","fzr","xgp","wbjr"),Arrays.asList("xgp","wbjr","q","vpio","tokfq","we"),Arrays.asList("wbjr","wi","xgp","we"),Arrays.asList("wbjr"),Arrays.asList("wi")),
                new String[] {"wi","otr","wbjr","fzr","xgp"}));
    }

    /**
     * [xevvq, izcad, bxgnm, i, hjvu, tokfq, z, g, b, hthy]
     * ["xevvq","izcad","bxgnm","i","hjvu","tokfq","z","g","b","hthy"]
     * @param recipes
     * @param ingredients
     * @param supplies
     * @return
     */
    static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        int n = recipes.length;
        Set<String> supplySet = new HashSet<>(Arrays.asList(supplies));
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < n; ++i) {
                if (!supplySet.contains(recipes[i])) {
                    boolean isAdd = true;
                    List<String> ingredient = ingredients.get(i);
                    for (int j = 0; j < ingredient.size(); ++j) {
                        if (!supplySet.contains(ingredient.get(j))) {
                            isAdd = false;
                            break;
                        }
                    }
                    if (isAdd) {
                        supplySet.add(recipes[i]);
                        ans.add(recipes[i]);
                        flag = true;
                    }
                }
            }
        }
        return ans;
    }
}
