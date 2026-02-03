package gtceuim.loaders;

import static gtceuim.api.util.IMMods.*;
import static gtceuim.gtceuimConfig.disableAe2Integration;
import static gtceuim.gtceuimConfig.disableAetherModIntegration;
import static gtceuim.gtceuimConfig.disableBotaniaIntegration;
import static gtceuim.gtceuimConfig.disableCrazyAeIntegration;
import static gtceuim.gtceuimConfig.disableEnderIoIntegration;
import static gtceuim.gtceuimConfig.disableGalacticraftIntegration;
import static gtceuim.gtceuimConfig.disableGalaxySpaceIntegration;
import static gtceuim.gtceuimConfig.disableThaumcraftIntegration;

import net.minecraftforge.oredict.OreDictionary;

import gtceuim.api.util.IMUtility;

public class OreDictionaryLoader {

    public static void init() {
        if (Ae2.isModLoaded() && !disableAe2Integration) {
            OreDictionary.registerOre("gemCertusQuartz",
                    IMUtility.getItemStackFromString("appliedenergistics2", "material", 0));
            OreDictionary.registerOre("gemChargedCertusQuartz",
                    IMUtility.getItemStackFromString("appliedenergistics2", "material", 1));
            OreDictionary.registerOre("gemFluix",
                    IMUtility.getItemStackFromString("appliedenergistics2", "material", 7));
            OreDictionary.registerOre("gemFluixPearl",
                    IMUtility.getItemStackFromString("appliedenergistics2", "material", 9));

            OreDictionary.registerOre("dustSkystone",
                    IMUtility.getItemStackFromString("appliedenergistics2", "material", 45));

            OreDictionary.registerOre("blockCertusQuartz",
                    IMUtility.getBlockItemStackFromString("appliedenergistics2", "quartz_block", 0));
            OreDictionary.registerOre("blockFluix",
                    IMUtility.getBlockItemStackFromString("appliedenergistics2", "fluix_block", 0));
            OreDictionary.registerOre("blockSkystone",
                    IMUtility.getBlockItemStackFromString("appliedenergistics2", "sky_stone_block", 0));

            if (CrazyAe.isModLoaded() && !disableCrazyAeIntegration) {
                OreDictionary.registerOre("gemFluixilized",
                        IMUtility.getItemStackFromString("crazyae", "material", 35));

                OreDictionary.registerOre("blockFluixilized",
                        IMUtility.getBlockItemStackFromString("crazyae", "fluixilized_block", 0));
            }
        }

        if (Botania.isModLoaded() && !disableBotaniaIntegration) {
            OreDictionary.registerOre("nuggetElementium",
                    IMUtility.getItemStackFromString("botania", "manaresource", 19));

            OreDictionary.registerOre("ingotElementium",
                    IMUtility.getItemStackFromString("botania", "manaresource", 7));
            OreDictionary.registerOre("ingotGaiaSpirit",
                    IMUtility.getItemStackFromString("botania", "manaresource", 14));

            OreDictionary.registerOre("gemManaDiamond",
                    IMUtility.getItemStackFromString("botania", "manaresource", 2));
            OreDictionary.registerOre("gemManaPearl", IMUtility.getItemStackFromString("botania", "manaresource", 1));
            OreDictionary.registerOre("gemDragonstone", IMUtility.getItemStackFromString("botania", "manaresource", 9));

            OreDictionary.registerOre("blockManasteel", IMUtility.getBlockItemStackFromString("botania", "storage", 0));
            OreDictionary.registerOre("blockTerrasteel",
                    IMUtility.getBlockItemStackFromString("botania", "storage", 1));
            OreDictionary.registerOre("blockElementium",
                    IMUtility.getBlockItemStackFromString("botania", "storage", 2));
            OreDictionary.registerOre("blockManaDiamond",
                    IMUtility.getBlockItemStackFromString("botania", "storage", 3));
            OreDictionary.registerOre("blockDragonstone",
                    IMUtility.getBlockItemStackFromString("botania", "storage", 4));
        }

        if (EnderIo.isModLoaded() && !disableEnderIoIntegration) {
            OreDictionary.registerOre("dustPrescientCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 34));
            OreDictionary.registerOre("dustVibrantCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 35));
            OreDictionary.registerOre("dustPulsatingCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 36));
            OreDictionary.registerOre("dustEnderCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 37));

            OreDictionary.registerOre("gemPulsatingCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 14));
            OreDictionary.registerOre("gemVibrantCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 15));
            OreDictionary.registerOre("gemEnderCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 16));
            OreDictionary.registerOre("gemAttractorCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 17));
            OreDictionary.registerOre("gemWeatherCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 18));
            OreDictionary.registerOre("gemPrescientCrystal",
                    IMUtility.getItemStackFromString("enderio", "item_material", 19));
        }

        if (GalacticraftCore.isModLoaded() && !disableGalacticraftIntegration) {
            OreDictionary.registerOre("dustSolar",
                    IMUtility.getItemStackFromString("galacticraftplanets", "basic_item_venus", 4));

            OreDictionary.registerOre("stickDesh",
                    IMUtility.getItemStackFromString("galacticraftplanets", "item_basic_mars", 1));

            OreDictionary.registerOre("blockMeteoricIron",
                    IMUtility.getBlockItemStackFromString("galacticraftcore", "basic_block_core", 12));
            OreDictionary.registerOre("blockDesh",
                    IMUtility.getBlockItemStackFromString("galacticraftplanets", "mars", 8));

            OreDictionary.registerOre("oreDesh",
                    IMUtility.getItemStackFromString("galacticraftplanets", "item_basic_mars", 0));

            if (GalaxySpace.isModLoaded() && !disableGalaxySpaceIntegration) {
                OreDictionary.registerOre("dustDolomite",
                        IMUtility.getItemStackFromString("galaxyspace", "gs_basic", 4));

                OreDictionary.registerOre("gemDolomite",
                        IMUtility.getItemStackFromString("galaxyspace", "gs_basic", 3));
                OreDictionary.registerOre("gemOnyx",
                        IMUtility.getItemStackFromString("galaxyspace", "br_basic", 3));
            }
        }

        if (Thaumcraft.isModLoaded() && !disableThaumcraftIntegration) {
            OreDictionary.registerOre("gemMercury",
                    IMUtility.getItemStackFromString("thaumcraft", "quicksilver", 0));

            OreDictionary.registerOre("nuggetMercury",
                    IMUtility.getItemStackFromString("thaumcraft", "nugget", 5));
        }

        if (AetherLegacy.isModLoaded() && !disableAetherModIntegration) {
            OreDictionary.registerOre("gemAmbrosium",
                    IMUtility.getItemStackFromString("aether_legacy", "ambrosium_shard", 0));
        }
    }
}
