package gtceuim.loaders;

import gtceuim.loaders.recipe.CompressorRecipes;

public class RecipeLoader {

    public static void registerMachineRecipes() {
        CompressorRecipes.init();
    }
}
