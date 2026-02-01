package gtceuim.unification.material;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.*;
import static gtceuim.api.util.IMUtility.*;
import static gtceuim.unification.material.materials.IMMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gtceuim.api.unification.IMElements;

public class IntegrationMaterials {

    private static int startId = 0;
    private static int endId = 999;

    public static void register() {
        // Applied Energistics 2
        ChargedCertusQuartz = new Material.Builder(getMetaItemId(), gtceuimId("charged_certus_quartz"))
                .dust()
                .gem(2)
                .ore(true)
                .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                .components(Silicon, 1, Oxygen, 2)
                .iconSet(CHARGED_CERTUS_QUARTZ)
                .build();

        Fluix = new Material.Builder(getMetaItemId(), gtceuimId("fluix"))
                .dust()
                .gem(2)
                .ore(true)
                .flags(GENERATE_ALL_GEM)
                .components(ChargedCertusQuartz, 1, CertusQuartz, 1, Redstone, 1)
                .color(0x832FBA)
                .iconSet(FLUIX)
                .build();

        FluixPearl = new Material.Builder(getMetaItemId(), gtceuimId("fluix_pearl"))
                .dust()
                .gem(2)
                .flags(GENERATE_ALL_GEM)
                .components(Fluix, 1, EnderPearl, 1)
                .iconSet(FLUIX_PEARL)
                .color(0x832FBA)
                .build();

        SkyStone = new Material.Builder(getMetaItemId(), gtceuimId("skystone"))
                .dust(2)
                .flags(GENERATE_ALL_STONE, DISABLE_DECOMPOSITION)
                .color(0x001C1C)
                .iconSet(SKYSTONE)
                .build();

        // Crazy AE
        Fluixilized = new Material.Builder(getMetaItemId(), gtceuimId("fluixilized"))
                .dust()
                .gem(2)
                .ore(true)
                .flags(GENERATE_ALL_GEM)
                .components(FluixPearl, 1, CertusQuartz, 1, Fluix, 1)
                .color(0xFF007F)
                .iconSet(FLUIXILIZED)
                .build();

        // Avaritia
        CrystalMatrix = new Material.Builder(getMetaItemId(), gtceuimId("crystal_matrix"))
                .dust()
                .ingot()
                .ore()
                .flags(GENERATE_ALL_METAL)
                .color(0x2BA8A2)
                .iconSet(SHINY)
                .build();

        CosmicNeutronium = new Material.Builder(getMetaItemId(), gtceuimId("cosmic_neutronium"))
                .dust()
                .ingot()
                .ore()
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(10000, BlastProperty.GasTier.LOW)
                        .blastStats(VA[UEV], 8000)
                        .vacuumStats(VA[UHV]))
                .iconSet(COSMICNEUTRONIUM)
                .element(IMElements.CosmicNeutronium)
                .build();

        InfinityCatalyst = new Material.Builder(getMetaItemId(), gtceuimId("infinity_catalyst"))
                .dust()
                .gem()
                .ore()
                .flags(GENERATE_ALL_GEM)
                .iconSet(INFINITYCATALYST)
                .element(IMElements.InfinityCatalyst)
                .build();

        Infinity = new Material.Builder(getMetaItemId(), gtceuimId("infinity"))
                .dust()
                .ingot()
                .blast(b -> b
                        .temp(10000, BlastProperty.GasTier.LOW)
                        .blastStats(VA[UIV], 16000)
                        .vacuumStats(VA[UEV]))
                .flags(GENERATE_ALL_METAL)
                .iconSet(INFINITY)
                .element(IMElements.Infinity)
                .cableProperties(V[MAX], 8192, 0, true)
                .build();

        // Draconic Evolution
        Draconium = new Material.Builder(getMetaItemId(), gtceuimId("draconium"))
                .dust()
                .ingot()
                .ore()
                .liquid(new FluidBuilder().temperature(5555))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(5555, BlastProperty.GasTier.LOW)
                        .blastStats(VA[LuV], 2560)
                        .vacuumStats(VA[MV]))
                .iconSet(SHINY)
                .element(IMElements.Draconium)
                .cableProperties(V[UEV], 4, (int) V[IV])
                .color(0x9500D6)
                .build();

        AwakenedDraconium = new Material.Builder(getMetaItemId(), gtceuimId("draconium_awakened"))
                .dust()
                .ingot()
                .ore()
                .liquid(new FluidBuilder().temperature(7777))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(7777, BlastProperty.GasTier.LOW)
                        .blastStats(VA[LuV], 2560)
                        .vacuumStats(VA[MV]))
                .iconSet(SHINY)
                .element(IMElements.AwakenedDraconium)
                .cableProperties(V[UIV], 4, (int) V[LuV])
                .color(0xFF5D00)
                .build();

        // Ender Io
        ElectricalSteel = new Material.Builder(getMetaItemId(), gtceuimId("electrical_steel"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(1688))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(1688, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 1100))
                .components(Steel, 1, Silicon, 1)
                .color(0x999999)
                .iconSet(SHINY)
                .build();

        EnergeticAlloy = new Material.Builder(getMetaItemId(), gtceuimId("energetic_alloy"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(2100))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(2100, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 1680))
                .components(Gold, 1, Redstone, 1, Glowstone, 1)
                .color(0xFF7402)
                .iconSet(SHINY)
                .cableProperties(V[MV], 4, 2, false)
                .build();

        VibrantAlloy = new Material.Builder(getMetaItemId(), gtceuimId("vibrant_alloy"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(2950))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(2950, BlastProperty.GasTier.LOW)
                        .blastStats(VA[HV], 2052))
                .components(EnergeticAlloy, 1, EnderPearl, 1)
                .color(0xBEFF1C)
                .iconSet(SHINY)
                .cableProperties(V[EV], 8, 8, false)
                .build();

        RedstoneAlloy = new Material.Builder(getMetaItemId(), gtceuimId("redstone_alloy"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(1750))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(1750, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 860))
                .components(ElectricalSteel, 1, Redstone, 1, Silicon, 1)
                .color(0xCC3030)
                .iconSet(SHINY)
                .cableProperties(32, 1, 0, false)
                .build();

        ConductiveIron = new Material.Builder(getMetaItemId(), gtceuimId("conductive_iron"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(1555))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(1555, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 900))
                .components(RedstoneAlloy, 1, Steel, 1, Redstone, 1)
                .color(0xFFB4A5)
                .iconSet(SHINY)
                .cableProperties(32, 2, 1)
                .build();

        PulsatingIron = new Material.Builder(getMetaItemId(), gtceuimId("pulsating_iron"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(1720))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(1720, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 625))
                .components(EnderPearl, 1, Steel, 1)
                .color(0x9AFFB1)
                .iconSet(SHINY)
                .cableProperties(8, 1, 0, false)
                .build();

        PulsatingCrystal = new Material.Builder(getMetaItemId(), gtceuimId("pulsating_crystal"))
                .dust()
                .gem(2)
                .color(0x3DFF9E)
                .flags(GENERATE_ALL_GEM)
                .components(Diamond, 1, PulsatingIron, 1)
                .iconSet(EMERALD)
                .build();

        DarkSteel = new Material.Builder(getMetaItemId(), gtceuimId("dark_steel"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(1690))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(1690, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 1200))
                .components(Steel, 1, Obsidian, 1)
                .color(0x4C4C4C)
                .iconSet(SHINY)
                .build();

        Soularium = new Material.Builder(getMetaItemId(), gtceuimId("soularium"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(2280))
                .flags(GENERATE_ALL_METAL, DISABLE_DECOMPOSITION)
                .components(Gold, 1, Ash, 1)
                .blast(b -> b
                        .temp(2280, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 1100))
                .color(0x7A502E)
                .iconSet(SHINY)
                .build();

        EndSteel = new Material.Builder(getMetaItemId(), gtceuimId("end_steel"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(3000))
                .flags(GENERATE_ALL_METAL)
                .components(DarkSteel, 1, Endstone, 1)
                .blast(b -> b
                        .temp(3000, BlastProperty.GasTier.LOW)
                        .blastStats(VA[HV], 1100))
                .color(0xE5DB8B)
                .iconSet(SHINY)
                .build();

        CrudeSteel = new Material.Builder(getMetaItemId(), gtceuimId("crude_steel"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(1300))
                .flags(GENERATE_ALL_METAL, DISABLE_DECOMPOSITION)
                .components(Clay, 1, QuartzSand, 1, Tin, 1)
                .blast(b -> b
                        .temp(1300, BlastProperty.GasTier.LOW)
                        .blastStats(VA[LV], 651))
                .color(0xCCC3B1)
                .iconSet(SHINY)
                .cableProperties(V[ULV], 1, 1, false)
                .build();

        CrystallineAlloy = new Material.Builder(getMetaItemId(), gtceuimId("crystalline_alloy"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(3820))
                .flags(GENERATE_ALL_METAL)
                .components(Gold, 1, PulsatingCrystal, 1)
                .blast(b -> b
                        .temp(3820, BlastProperty.GasTier.LOW)
                        .blastStats(VA[EV], 2872))
                .color(0x91FFFF)
                .iconSet(SHINY)
                .cableProperties(V[IV], 16, 32, false)
                .build();

        MelodicAlloy = new Material.Builder(getMetaItemId(), gtceuimId("melodic_alloy"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(3290))
                .flags(GENERATE_ALL_METAL, DISABLE_DECOMPOSITION)
                .components(EndSteel, 1)
                .blast(b -> b
                        .temp(3290, BlastProperty.GasTier.LOW)
                        .blastStats(VA[HV], 2490))
                .color(0xB26EB2)
                .iconSet(SHINY)
                .cableProperties(131072, 32, 128, false)
                .build();

        CrystallinePinkSlime = new Material.Builder(getMetaItemId(), gtceuimId("crystalline_pink_slime"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(3890))
                .flags(GENERATE_ALL_METAL)
                .components(MelodicAlloy, 1, CrystallineAlloy, 1)
                .blast(b -> b
                        .temp(4890, BlastProperty.GasTier.LOW)
                        .blastStats(VA[EV], 1100))
                .color(0xFF99EF)
                .iconSet(SHINY)
                .cableProperties(V[LuV], 24, 64, false)
                .build();

        EnergeticSilver = new Material.Builder(getMetaItemId(), gtceuimId("energetic_silver"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(2085))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(2085, BlastProperty.GasTier.LOW)
                        .blastStats(VA[MV], 1680))
                .components(Silver, 1, Redstone, 1, Glowstone, 1)
                .color(0x639ECC)
                .iconSet(SHINY)
                .cableProperties(V[HV], 4, 8, false)
                .build();

        VividAlloy = new Material.Builder(getMetaItemId(), gtceuimId("vivid_alloy"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(2925))
                .flags(GENERATE_ALL_METAL)
                .blast(b -> b
                        .temp(2925, BlastProperty.GasTier.LOW)
                        .blastStats(VA[HV], 2052))
                .components(EnergeticSilver, 1, EnderPearl, 1)
                .color(0x7AE6FF)
                .iconSet(SHINY)
                .build();

        StellarAlloy = new Material.Builder(getMetaItemId(), gtceuimId("stellar_alloy"))
                .dust()
                .ingot()
                .liquid(new FluidBuilder().temperature(5480))
                .flags(GENERATE_ALL_METAL, DISABLE_DECOMPOSITION)
                .components(VividAlloy, 1, VibrantAlloy, 1, CrystallinePinkSlime, 1, NetherStar, 1)
                .blast(b -> b
                        .temp(5480, BlastProperty.GasTier.LOW)
                        .blastStats(VA[IV], 9950)
                        .vacuumStats(VA[EV] * 2, 2400))
                .color(0xDBFFFF)
                .iconSet(SHINY)
                .cableProperties(V[MAX], 4, 0, false)
                .build();

        VibrantCrystal = new Material.Builder(getMetaItemId(), gtceuimId("vibrant_crystal"))
                .dust()
                .gem(2)
                .color(0x4FA045)
                .flags(GENERATE_ALL_GEM)
                .components(Emerald, 1, VibrantAlloy, 1)
                .iconSet(EMERALD)
                .build();

        EnderCrystal = new Material.Builder(getMetaItemId(), gtceuimId("ender_crystal"))
                .dust()
                .gem(2)
                .color(0x3A7C27)
                .flags(GENERATE_ALL_GEM)
                .components(VibrantCrystal, 1)
                .iconSet(EMERALD)
                .build();

        EnticingCrystal = new Material.Builder(getMetaItemId(), gtceuimId("attractor_crystal"))
                .dust()
                .gem(2)
                .color(0x509375)
                .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                .components(Emerald, 1)
                .iconSet(EMERALD)
                .build();

        WeatherCrystal = new Material.Builder(getMetaItemId(), gtceuimId("weather_crystal"))
                .dust()
                .gem(2)
                .color(0x4F1F60)
                .flags(GENERATE_ALL_GEM)
                .components(PulsatingCrystal, 2, VibrantCrystal, 2, EnderCrystal, 1)
                .iconSet(EMERALD)
                .build();

        PrescientCrystal = new Material.Builder(getMetaItemId(), gtceuimId("prescient_crystal"))
                .dust()
                .gem(2)
                .color(0x49A562)
                .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                .components(VibrantCrystal, 1)
                .iconSet(EMERALD)
                .build();

        // Astral Sorcery
        Starmetal = new Material.Builder(getMetaItemId(), gtceuimId("astral_starmetal"))
                .dust()
                .ore()
                .ingot()
                .liquid(new FluidBuilder().temperature(1))
                .flags(GENERATE_ALL_METAL)
                .color(0x2500D1)
                .iconSet(STARMETAL)
                .build();

        Aquamarine = new Material.Builder(getMetaItemId(), gtceuimId("aquamarine"))
                .dust()
                .ore()
                .gem(2)
                .flags(GENERATE_ALL_GEM)
                .components(Beryllium, 3, Aluminium, 2, Silicon, 6, Oxygen, 18)
                .color(0x008EFF)
                .iconSet(DIAMOND)
                .build();

        // Botania
        ManaSteel = new Material.Builder(getMetaItemId(), gtceuimId("manasteel"))
                .dust()
                .ingot()
                .flags(GENERATE_ALL_METAL, NO_SMELTING)
                .color(0x008EFF)
                .iconSet(SHINY)
                .build();

        TerraSteel = new Material.Builder(getMetaItemId(), gtceuimId("terrasteel"))
                .dust()
                .ingot()
                .flags(GENERATE_ALL_METAL, NO_SMELTING)
                .color(0x2DFF4C)
                .iconSet(SHINY)
                .build();

        Elementium = new Material.Builder(getMetaItemId(), gtceuimId("elementium"))
                .dust()
                .ingot()
                .flags(GENERATE_ALL_METAL, NO_SMELTING)
                .color(0xFF2DEA)
                .iconSet(SHINY)
                .build();

        ManaDiamond = new Material.Builder(getMetaItemId(), gtceuimId("mana_diamond"))
                .dust()
                .gem(2)
                .flags(GENERATE_ALL_GEM)
                .color(0x009FB0)
                .iconSet(DIAMOND)
                .build();

        ManaPearl = new Material.Builder(getMetaItemId(), gtceuimId("mana_pearl"))
                .dust()
                .gem(2)
                .flags(GENERATE_ALL_GEM)
                .color(0x007EA5)
                .iconSet(PEARL)
                .build();

        Dragonstone = new Material.Builder(getMetaItemId(), gtceuimId("dragonstone"))
                .dust()
                .gem(2)
                .flags(GENERATE_ALL_GEM)
                .color(0xFF2DEA)
                .iconSet(DIAMOND)
                .build();

        GaiaSpirit = new Material.Builder(getMetaItemId(), gtceuimId("gaia_spirit"))
                .dust()
                .ingot()
                .flags(GENERATE_ALL_METAL, NO_SMELTING)
                .color(0xFFFFFF)
                .iconSet(SHINY)
                .build();

        // Galacticraft
        MeteoricIron = new Material.Builder(getMetaItemId(), gtceuimId("meteoric_iron"))
                .dust()
                .ore()
                .ingot()
                .flags(GENERATE_ALL_METAL, NO_SMELTING)
                .color(0x9B7753)
                .iconSet(DULL)
                .build();

        Desh = new Material.Builder(getMetaItemId(), gtceuimId("desh"))
                .dust()
                .ore()
                .ingot()
                .flags(GENERATE_ALL_METAL, NO_SMELTING)
                .color(0x231D1D)
                .iconSet(DULL)
                .build();

        Solar = new Material.Builder(getMetaItemId(), gtceuimId("solar"))
                .dust()
                .ore()
                .ingot()
                .flags(GENERATE_ALL_METAL, NO_SMELTING)
                .color(0xE17B29)
                .iconSet(METALLIC)
                .build();

        // GalaxySpace
        Dolomite = new Material.Builder(getMetaItemId(), gtceuimId("dolomite"))
                .dust()
                .gem(2)
                .ore(true)
                .flags(GENERATE_ALL_GEM)
                .components(Calcium, 2, Magnesium, 4, Carbon, 2, Oxygen, 6)
                .color(0x937E55)
                .iconSet(CERTUS)
                .build().setFormula("CaMg(CO3)2", true);

        MysteriousCrystal = new Material.Builder(getMetaItemId(), gtceuimId("mysterious_crystal"))
                .dust()
                .gem(2)
                .ore(true)
                .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                .color(0x00A671)
                .iconSet(CERTUS)
                .build();

        VolcanicCrystal = new Material.Builder(getMetaItemId(), gtceuimId("volcanic_crystal"))
                .dust()
                .gem(2)
                .ore(true)
                .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                .color(0xA6301F)
                .iconSet(CERTUS)
                .build();

        Onyx = new Material.Builder(getMetaItemId(), gtceuimId("onyx"))
                .dust()
                .gem(2)
                .ore(true)
                .flags(GENERATE_ALL_GEM)
                .components(Silicon, 1, Oxygen, 2)
                .color(0x16161B)
                .iconSet(CERTUS)
                .build();
    }

    private static int getMetaItemId() {
        if (startId < endId) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
