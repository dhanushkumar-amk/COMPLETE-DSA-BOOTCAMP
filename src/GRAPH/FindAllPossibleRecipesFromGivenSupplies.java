package GRAPH;

// leetcode : 2115
// https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/description/?envType=daily-question&envId=2025-03-21

import java.util.*;

public class FindAllPossibleRecipesFromGivenSupplies {

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> graph = new HashMap<>(); // ingredient -> list of recipes
        Map<String, Integer> indegree = new HashMap<>();   // recipe -> count of needed ingredients
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        List<String> result = new ArrayList<>();

        // Step 1: Build graph and indegree map
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            indegree.put(recipe, ingredients.get(i).size());

            List<String> recipeIngredients = ingredients.get(i);
            for (String ing : recipeIngredients) {
                List<String> recipeList = graph.get(ing);
                if (recipeList == null) {
                    recipeList = new ArrayList<>();
                    graph.put(ing, recipeList);
                }
                recipeList.add(recipe);
            }
        }

        // Step 2: Perform BFS
        Queue<String> queue = new LinkedList<>();
        for (String item : available) {
            queue.add(item);
        }

        while (!queue.isEmpty()) {
            String item = queue.poll();
            if (!graph.containsKey(item)) continue;

            List<String> recipesForItem = graph.get(item);
            for (String recipe : recipesForItem) {
                int count = indegree.get(recipe);
                count--;
                indegree.put(recipe, count);
                if (count == 0) {
                    result.add(recipe);
                    queue.add(recipe);
                }
            }
        }

        return result;
    }
}
