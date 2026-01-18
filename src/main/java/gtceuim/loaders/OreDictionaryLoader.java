package gtceuim.loaders;

import appeng.core.Api;
import appeng.items.materials.MaterialType;
import dev.beecube31.crazyae2.core.CrazyAE;
import gtceuim.api.util.IMUtility;
import net.minecraftforge.oredict.OreDictionary;

import static gtceuim.api.util.IMMods.*;

public class OreDictionaryLoader {

    public static void init() {
        if (Ae2.isModLoaded()) {
            OreDictionary.registerOre("gemCertusQuartz", MaterialType.CERTUS_QUARTZ_CRYSTAL.stack(1));
            OreDictionary.registerOre("gemChargedCertusQuartz", MaterialType.CERTUS_QUARTZ_CRYSTAL_CHARGED.stack(1));
            OreDictionary.registerOre("gemFluix", MaterialType.FLUIX_CRYSTAL.stack(1));
            OreDictionary.registerOre("gemFluixPearl", MaterialType.FLUIX_PEARL.stack(1));
            OreDictionary.registerOre("dustSkystone", MaterialType.SKY_DUST.stack(1));
            OreDictionary.registerOre("blockCertusQuartz",
                    Api.INSTANCE.definitions().blocks().quartzBlock().maybeBlock().get());
            OreDictionary.registerOre("blockFluix",
                    Api.INSTANCE.definitions().blocks().fluixBlock().maybeBlock().get());
            OreDictionary.registerOre("blockSkystone",
                    Api.INSTANCE.definitions().blocks().skyStoneBlock().maybeBlock().get());
        }

        if (CrazyAe.isModLoaded()) {
            OreDictionary.registerOre("blockFluixilized",
                    CrazyAE.definitions().blocks().fluixilizedBlock().maybeBlock().get());
        }

        if (Botania.isModLoaded()) {
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
            OreDictionary.registerOre("blockTerrasteel", IMUtility.getBlockItemStackFromString("botania", "storage", 1));
            OreDictionary.registerOre("blockElementium", IMUtility.getBlockItemStackFromString("botania", "storage", 2));
            OreDictionary.registerOre("blockManaDiamond", IMUtility.getBlockItemStackFromString("botania", "storage", 3));
            OreDictionary.registerOre("blockDragonstone", IMUtility.getBlockItemStackFromString("botania", "storage", 4));
        }

        if (EnderIo.isModLoaded()) {
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

        if (GalacticraftCore.isModLoaded() || GalacticraftPlanets.isModLoaded()) {
            OreDictionary.registerOre("blockMeteoricIron",
                    IMUtility.getItemStackFromString("galacticraftcore", "basic_block_core", 12));
            OreDictionary.registerOre("stickDesh",
                    IMUtility.getItemStackFromString("galacticraftplanets", "item_basic_mars", 1));
        }
    }
}
