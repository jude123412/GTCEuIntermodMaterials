package gtceuim.unification.material.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlag;
import gtceuim.api.unification.material.materials.IMMaterialFlagAddition;
import gtceuim.api.unification.ore.IMOrePrefix;
import gtceuim.api.util.IMLogger;
import gtceuim.unification.material.IntegrationMaterials;

public class IMMaterials {

    public static final List<MaterialFlag> GENERATE_ALL_GEM = new ArrayList<>();
    public static final List<MaterialFlag> GENERATE_ALL_METAL = new ArrayList<>();
    public static final List<MaterialFlag> GENERATE_ALL_STONE = new ArrayList<>();

    static {
        GENERATE_ALL_METAL.addAll(
                EXT2_METAL);
        GENERATE_ALL_METAL.addAll(Arrays.asList(
                EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                GENERATE_PLATE,
                GENERATE_SPRING,
                GENERATE_SPRING_SMALL,
                GENERATE_RING,
                GENERATE_ROUND,
                GENERATE_ROTOR,
                GENERATE_SMALL_GEAR,
                GENERATE_FRAME,
                GENERATE_DENSE,
                GENERATE_FOIL,
                GENERATE_GEAR,
                GENERATE_DOUBLE_PLATE,
                GENERATE_FINE_WIRE));

        GENERATE_ALL_GEM.addAll(
                EXT_METAL);
        GENERATE_ALL_GEM.addAll(Arrays.asList(
                NO_SMASHING,
                NO_WORKING,
                EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                EXCLUDE_BLOCK_CRAFTING_RECIPES,
                GENERATE_PLATE,
                GENERATE_BOLT_SCREW,
                GENERATE_FRAME,
                GENERATE_GEAR,
                GENERATE_LENS,
                CRYSTALLIZABLE));

        GENERATE_ALL_STONE.addAll(Arrays.asList(
                NO_SMASHING,
                EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                EXCLUDE_BLOCK_CRAFTING_RECIPES,
                GENERATE_PLATE,
                GENERATE_DENSE));
    }

    // Mod Integration Materials
    // AE2
    public static Material ChargedCertusQuartz;
    public static Material Fluix;
    public static Material Fluixilized;
    public static Material FluixPearl;
    public static Material SkyStone;

    // Avaritia
    public static Material CrystalMatrix;
    public static Material CosmicNeutronium;
    public static Material InfinityCatalyst;
    public static Material Infinity;

    // Draconic Evolution
    public static Material Draconium;
    public static Material AwakenedDraconium;

    // Ender Io
    public static Material VividAlloy;
    public static Material VibrantAlloy;
    public static Material StellarAlloy;
    public static Material Soularium;
    public static Material RedstoneAlloy;
    public static Material PulsatingIron;
    public static Material MelodicAlloy;
    public static Material EnergeticSilver;
    public static Material EnergeticAlloy;
    public static Material EndSteel;
    public static Material ElectricalSteel;
    public static Material DarkSteel;
    public static Material CrystallinePinkSlime;
    public static Material CrystallineAlloy;
    public static Material CrudeSteel;
    public static Material ConductiveIron;
    public static Material PulsatingCrystal;
    public static Material VibrantCrystal;
    public static Material EnderCrystal;
    public static Material EnticingCrystal;
    public static Material WeatherCrystal;
    public static Material PrescientCrystal;

    // Astral Sorcery
    public static Material Starmetal;
    public static Material Aquamarine;

    // Botania
    public static Material ManaSteel;
    public static Material TerraSteel;
    public static Material Elementium;
    public static Material ManaDiamond;
    public static Material ManaPearl;
    public static Material Dragonstone;
    public static Material GaiaSpirit;

    // Galacticraft
    public static Material MeteoricIron;
    public static Material Desh;
    public static Material Solar;

    // GalaxySpace
    public static Material Dolomite;
    public static Material MysteriousCrystal;
    public static Material VolcanicCrystal;
    public static Material Onyx;

    // Thaumcraft
    public static Material Amber;
    public static Material Thaumium;
    public static Material Void;
    public static Material DirtyAirCrystal;
    public static Material DirtyTerraCrystal;
    public static Material DirtyIgnisCrystal;
    public static Material DirtyAquaCrystal;
    public static Material DirtyOrdoCrystal;
    public static Material DirtyPerditioCrystal;

    // Aether Mod
    public static Material Zanite;
    public static Material Ambrosium;
    public static Material Gravitite;
    public static Material EnchantedGravitite;

    // Extra Utilities 2
    public static Material Unstable;
    public static Material Lunar;
    public static Material Moon;
    public static Material Demon;
    public static Material Enchanted;
    public static Material EvilInfusedIron;

    public static void init() {
        // Register Materials
        IMLogger.log.info("Beginning Material Registry");
        IntegrationMaterials.register();

        // Modify Material Flags
        IMLogger.log.info("Adding/Modifying Material Flags");
        IMMaterialFlagAddition.init();

        // OrePrefix Registry/Modification
        IMLogger.log.info("Adding/Modifying Ore Prefixes");
        IMOrePrefix.init();
    }
}
