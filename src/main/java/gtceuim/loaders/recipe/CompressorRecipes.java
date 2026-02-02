package gtceuim.loaders.recipe;

import static gregtech.api.GTValues.ULV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.COMPRESSOR_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.block;
import static gregtech.api.unification.ore.OrePrefix.gem;
import static gtceuim.unification.material.materials.IMMaterials.Amber;
import static gtceuim.unification.material.materials.IMMaterials.Aquamarine;
import static gtceuim.unification.material.materials.IMMaterials.ChargedCertusQuartz;
import static gtceuim.unification.material.materials.IMMaterials.DirtyAirCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyAquaCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyIgnisCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyOrdoCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyPerditioCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyTerraCrystal;
import static gtceuim.unification.material.materials.IMMaterials.Dolomite;
import static gtceuim.unification.material.materials.IMMaterials.Dragonstone;
import static gtceuim.unification.material.materials.IMMaterials.EnderCrystal;
import static gtceuim.unification.material.materials.IMMaterials.EnticingCrystal;
import static gtceuim.unification.material.materials.IMMaterials.FluixPearl;
import static gtceuim.unification.material.materials.IMMaterials.InfinityCatalyst;
import static gtceuim.unification.material.materials.IMMaterials.ManaDiamond;
import static gtceuim.unification.material.materials.IMMaterials.ManaPearl;
import static gtceuim.unification.material.materials.IMMaterials.MysteriousCrystal;
import static gtceuim.unification.material.materials.IMMaterials.Onyx;
import static gtceuim.unification.material.materials.IMMaterials.PrescientCrystal;
import static gtceuim.unification.material.materials.IMMaterials.PulsatingCrystal;
import static gtceuim.unification.material.materials.IMMaterials.VibrantCrystal;
import static gtceuim.unification.material.materials.IMMaterials.VolcanicCrystal;
import static gtceuim.unification.material.materials.IMMaterials.WeatherCrystal;

public class CompressorRecipes {

    public static void init() {
        registerCompressorRecipes();
    }

    private static void registerCompressorRecipes() {
        // AE2
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, ChargedCertusQuartz, 4)
                .output(block, ChargedCertusQuartz)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, FluixPearl, 9)
                .output(block, FluixPearl)
                .buildAndRegister();
        // Avaritia
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, InfinityCatalyst, 9)
                .output(block, InfinityCatalyst)
                .buildAndRegister();

        // Ender Io
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, PulsatingCrystal, 9)
                .output(block, PulsatingCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, VibrantCrystal, 9)
                .output(block, VibrantCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, EnderCrystal, 9)
                .output(block, EnderCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, EnticingCrystal, 9)
                .output(block, EnticingCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, WeatherCrystal, 9)
                .output(block, WeatherCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, PrescientCrystal, 9)
                .output(block, PrescientCrystal)
                .buildAndRegister();

        // Astral Sorcery
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, Aquamarine, 9)
                .output(block, Aquamarine)
                .buildAndRegister();

        // Botania
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, ManaPearl, 9)
                .output(block, ManaPearl)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, ManaDiamond, 9)
                .output(block, ManaDiamond)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, Dragonstone, 9)
                .output(block, Dragonstone)
                .buildAndRegister();

        // Galaxy Space
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, Dolomite, 9)
                .output(block, Dolomite)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, MysteriousCrystal, 9)
                .output(block, MysteriousCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, VolcanicCrystal, 9)
                .output(block, VolcanicCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, Onyx, 9)
                .output(block, Onyx)
                .buildAndRegister();

        // Thaumcraft
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, Amber, 9)
                .output(block, Amber)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, DirtyAirCrystal, 9)
                .output(block, DirtyAirCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, DirtyIgnisCrystal, 9)
                .output(block, DirtyIgnisCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, DirtyTerraCrystal, 9)
                .output(block, DirtyTerraCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, DirtyAquaCrystal, 9)
                .output(block, DirtyAquaCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, DirtyOrdoCrystal, 9)
                .output(block, DirtyOrdoCrystal)
                .buildAndRegister();
        COMPRESSOR_RECIPES.recipeBuilder()
                .duration(300).EUt(2)
                .input(gem, DirtyPerditioCrystal, 9)
                .output(block, DirtyPerditioCrystal)
                .buildAndRegister();
    }
}
