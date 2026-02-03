package gtceuim.unification.material;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.MAX;
import static gregtech.api.GTValues.MV;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.ULV;
import static gregtech.api.GTValues.V;
import static gregtech.api.GTValues.VA;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Ash;
import static gregtech.api.unification.material.Materials.Beryllium;
import static gregtech.api.unification.material.Materials.Calcium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.CertusQuartz;
import static gregtech.api.unification.material.Materials.Clay;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.Electrotine;
import static gregtech.api.unification.material.Materials.Emerald;
import static gregtech.api.unification.material.Materials.EnderPearl;
import static gregtech.api.unification.material.Materials.Endstone;
import static gregtech.api.unification.material.Materials.Glowstone;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.GraniteBlack;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.NetherQuartz;
import static gregtech.api.unification.material.Materials.NetherStar;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Obsidian;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.QuartzSand;
import static gregtech.api.unification.material.Materials.Redstone;
import static gregtech.api.unification.material.Materials.Sapphire;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Steel;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static gregtech.api.unification.material.info.MaterialFlags.NO_SMELTING;
import static gregtech.api.unification.material.info.MaterialIconSet.DIAMOND;
import static gregtech.api.unification.material.info.MaterialIconSet.DULL;
import static gregtech.api.unification.material.info.MaterialIconSet.EMERALD;
import static gregtech.api.unification.material.info.MaterialIconSet.GEM_VERTICAL;
import static gregtech.api.unification.material.info.MaterialIconSet.METALLIC;
import static gregtech.api.unification.material.info.MaterialIconSet.SHINY;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.AMBER;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.CHARGED_CERTUS_QUARTZ;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.COSMICNEUTRONIUM;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.FLUIX;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.FLUIXILIZED;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.FLUIX_PEARL;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.INFINITY;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.INFINITYCATALYST;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.PEARL;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.SKYSTONE;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.STARMETAL;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.THAUMIUM;
import static gtceuim.api.unification.material.info.IMMaterialIconSet.VOID;
import static gtceuim.api.util.IMMods.Ae2;
import static gtceuim.api.util.IMMods.AetherLegacy;
import static gtceuim.api.util.IMMods.AstralSorcery;
import static gtceuim.api.util.IMMods.Avaritia;
import static gtceuim.api.util.IMMods.Botania;
import static gtceuim.api.util.IMMods.CrazyAe;
import static gtceuim.api.util.IMMods.DraconicEvolution;
import static gtceuim.api.util.IMMods.EnderIo;
import static gtceuim.api.util.IMMods.EnderIoEndergy;
import static gtceuim.api.util.IMMods.GalacticraftCore;
import static gtceuim.api.util.IMMods.GalaxySpace;
import static gtceuim.api.util.IMMods.Thaumcraft;
import static gtceuim.api.util.IMUtility.gtceuimId;
import static gtceuim.gtceuimConfig.disableAe2Integration;
import static gtceuim.gtceuimConfig.disableAetherModIntegration;
import static gtceuim.gtceuimConfig.disableAstralSorceryIntegration;
import static gtceuim.gtceuimConfig.disableAvaritiaIntegration;
import static gtceuim.gtceuimConfig.disableBotaniaIntegration;
import static gtceuim.gtceuimConfig.disableCrazyAeIntegration;
import static gtceuim.gtceuimConfig.disableDraconicEvolutionIntegration;
import static gtceuim.gtceuimConfig.disableEnderIoEndergyIntegration;
import static gtceuim.gtceuimConfig.disableEnderIoIntegration;
import static gtceuim.gtceuimConfig.disableGalacticraftIntegration;
import static gtceuim.gtceuimConfig.disableGalaxySpaceIntegration;
import static gtceuim.gtceuimConfig.disableThaumcraftIntegration;
import static gtceuim.unification.material.materials.IMMaterials.Amber;
import static gtceuim.unification.material.materials.IMMaterials.Ambrosium;
import static gtceuim.unification.material.materials.IMMaterials.Aquamarine;
import static gtceuim.unification.material.materials.IMMaterials.AwakenedDraconium;
import static gtceuim.unification.material.materials.IMMaterials.ChargedCertusQuartz;
import static gtceuim.unification.material.materials.IMMaterials.ConductiveIron;
import static gtceuim.unification.material.materials.IMMaterials.CosmicNeutronium;
import static gtceuim.unification.material.materials.IMMaterials.CrudeSteel;
import static gtceuim.unification.material.materials.IMMaterials.CrystalMatrix;
import static gtceuim.unification.material.materials.IMMaterials.CrystallineAlloy;
import static gtceuim.unification.material.materials.IMMaterials.CrystallinePinkSlime;
import static gtceuim.unification.material.materials.IMMaterials.DarkSteel;
import static gtceuim.unification.material.materials.IMMaterials.Desh;
import static gtceuim.unification.material.materials.IMMaterials.DirtyAirCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyAquaCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyIgnisCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyOrdoCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyPerditioCrystal;
import static gtceuim.unification.material.materials.IMMaterials.DirtyTerraCrystal;
import static gtceuim.unification.material.materials.IMMaterials.Dolomite;
import static gtceuim.unification.material.materials.IMMaterials.Draconium;
import static gtceuim.unification.material.materials.IMMaterials.Dragonstone;
import static gtceuim.unification.material.materials.IMMaterials.ElectricalSteel;
import static gtceuim.unification.material.materials.IMMaterials.Elementium;
import static gtceuim.unification.material.materials.IMMaterials.EnchantedGravitite;
import static gtceuim.unification.material.materials.IMMaterials.EndSteel;
import static gtceuim.unification.material.materials.IMMaterials.EnderCrystal;
import static gtceuim.unification.material.materials.IMMaterials.EnergeticAlloy;
import static gtceuim.unification.material.materials.IMMaterials.EnergeticSilver;
import static gtceuim.unification.material.materials.IMMaterials.EnticingCrystal;
import static gtceuim.unification.material.materials.IMMaterials.Fluix;
import static gtceuim.unification.material.materials.IMMaterials.FluixPearl;
import static gtceuim.unification.material.materials.IMMaterials.Fluixilized;
import static gtceuim.unification.material.materials.IMMaterials.GENERATE_ALL_GEM;
import static gtceuim.unification.material.materials.IMMaterials.GENERATE_ALL_METAL;
import static gtceuim.unification.material.materials.IMMaterials.GENERATE_ALL_STONE;
import static gtceuim.unification.material.materials.IMMaterials.GaiaSpirit;
import static gtceuim.unification.material.materials.IMMaterials.Gravitite;
import static gtceuim.unification.material.materials.IMMaterials.Infinity;
import static gtceuim.unification.material.materials.IMMaterials.InfinityCatalyst;
import static gtceuim.unification.material.materials.IMMaterials.ManaDiamond;
import static gtceuim.unification.material.materials.IMMaterials.ManaPearl;
import static gtceuim.unification.material.materials.IMMaterials.ManaSteel;
import static gtceuim.unification.material.materials.IMMaterials.MelodicAlloy;
import static gtceuim.unification.material.materials.IMMaterials.MeteoricIron;
import static gtceuim.unification.material.materials.IMMaterials.MysteriousCrystal;
import static gtceuim.unification.material.materials.IMMaterials.Onyx;
import static gtceuim.unification.material.materials.IMMaterials.PrescientCrystal;
import static gtceuim.unification.material.materials.IMMaterials.PulsatingCrystal;
import static gtceuim.unification.material.materials.IMMaterials.PulsatingIron;
import static gtceuim.unification.material.materials.IMMaterials.RedstoneAlloy;
import static gtceuim.unification.material.materials.IMMaterials.SkyStone;
import static gtceuim.unification.material.materials.IMMaterials.Solar;
import static gtceuim.unification.material.materials.IMMaterials.Soularium;
import static gtceuim.unification.material.materials.IMMaterials.Starmetal;
import static gtceuim.unification.material.materials.IMMaterials.StellarAlloy;
import static gtceuim.unification.material.materials.IMMaterials.TerraSteel;
import static gtceuim.unification.material.materials.IMMaterials.Thaumium;
import static gtceuim.unification.material.materials.IMMaterials.VibrantAlloy;
import static gtceuim.unification.material.materials.IMMaterials.VibrantCrystal;
import static gtceuim.unification.material.materials.IMMaterials.VividAlloy;
import static gtceuim.unification.material.materials.IMMaterials.Void;
import static gtceuim.unification.material.materials.IMMaterials.VolcanicCrystal;
import static gtceuim.unification.material.materials.IMMaterials.WeatherCrystal;
import static gtceuim.unification.material.materials.IMMaterials.Zanite;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gtceuim.api.unification.IMElements;

public class IntegrationMaterials {

    public static void register() {
        // Applied Energistics 2
        if (Ae2.isModLoaded() && !disableAe2Integration) {
            ChargedCertusQuartz = new Material.Builder(0, gtceuimId("charged_certus_quartz"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .addOreByproducts(NetherQuartz, CertusQuartz, Redstone)
                    .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                    .components(Silicon, 1, Oxygen, 2)
                    .iconSet(CHARGED_CERTUS_QUARTZ)
                    .build();

            Fluix = new Material.Builder(1, gtceuimId("fluix"))
                    .dust()
                    .gem(2)
                    .flags(GENERATE_ALL_GEM)
                    .components(ChargedCertusQuartz, 1, CertusQuartz, 1, Redstone, 1)
                    .color(0x832FBA)
                    .iconSet(FLUIX)
                    .build();

            FluixPearl = new Material.Builder(2, gtceuimId("fluix_pearl"))
                    .dust()
                    .gem(2)
                    .flags(GENERATE_ALL_GEM)
                    .components(Fluix, 1, EnderPearl, 1)
                    .iconSet(FLUIX_PEARL)
                    .color(0x832FBA)
                    .build();

            SkyStone = new Material.Builder(3, gtceuimId("skystone"))
                    .dust(2)
                    .ore()
                    .flags(GENERATE_ALL_STONE, DISABLE_DECOMPOSITION)
                    .color(0x001C1C)
                    .iconSet(SKYSTONE)
                    .build();

            // Crazy AE
            if (CrazyAe.isModLoaded() && !disableCrazyAeIntegration) {
                Fluixilized = new Material.Builder(4, gtceuimId("fluixilized"))
                        .dust()
                        .gem(2)
                        .flags(GENERATE_ALL_GEM)
                        .components(FluixPearl, 1, CertusQuartz, 1, Fluix, 1)
                        .color(0xFF007F)
                        .iconSet(FLUIXILIZED)
                        .build();
            }
        }

        // Avaritia
        if (Avaritia.isModLoaded() && !disableAvaritiaIntegration) {
            CrystalMatrix = new Material.Builder(5, gtceuimId("crystal_matrix"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL)
                    .color(0x2BA8A2)
                    .iconSet(SHINY)
                    .build();

            CosmicNeutronium = new Material.Builder(6, gtceuimId("cosmic_neutronium"))
                    .dust()
                    .ingot()
                    .ore()
                    .flags(GENERATE_ALL_METAL)
                    .blast(b -> b
                            .temp(10000, BlastProperty.GasTier.LOW)
                            .blastStats(VA[UEV], 8000)
                            .vacuumStats(VA[UHV]))
                    .color(0x1e1d1f)
                    .iconSet(COSMICNEUTRONIUM)
                    .element(IMElements.CosmicNeutronium)
                    .build();

            InfinityCatalyst = new Material.Builder(7, gtceuimId("infinity_catalyst"))
                    .dust()
                    .gem()
                    .ore()
                    .addOreByproducts(NetherStar, Neutronium, CosmicNeutronium)
                    .flags(GENERATE_ALL_GEM)
                    .iconSet(INFINITYCATALYST)
                    .element(IMElements.InfinityCatalyst)
                    .build();

            Infinity = new Material.Builder(8, gtceuimId("infinity"))
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
        }

        // Draconic Evolution
        if (DraconicEvolution.isModLoaded() && !disableDraconicEvolutionIntegration) {
            Draconium = new Material.Builder(9, gtceuimId("draconium"))
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

            AwakenedDraconium = new Material.Builder(10, gtceuimId("draconium_awakened"))
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
        }

        // Ender Io
        if (EnderIo.isModLoaded() && !disableEnderIoIntegration) {
            ElectricalSteel = new Material.Builder(11, gtceuimId("electrical_steel"))
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

            EnergeticAlloy = new Material.Builder(12, gtceuimId("energetic_alloy"))
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

            VibrantAlloy = new Material.Builder(13, gtceuimId("vibrant_alloy"))
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

            RedstoneAlloy = new Material.Builder(14, gtceuimId("redstone_alloy"))
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

            ConductiveIron = new Material.Builder(15, gtceuimId("conductive_iron"))
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

            PulsatingIron = new Material.Builder(16, gtceuimId("pulsating_iron"))
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

            PulsatingCrystal = new Material.Builder(17, gtceuimId("pulsating_crystal"))
                    .dust()
                    .gem(2)
                    .color(0x3DFF9E)
                    .flags(GENERATE_ALL_GEM)
                    .components(Diamond, 1, PulsatingIron, 1)
                    .iconSet(EMERALD)
                    .build();

            DarkSteel = new Material.Builder(18, gtceuimId("dark_steel"))
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

            Soularium = new Material.Builder(19, gtceuimId("soularium"))
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

            if (EnderIoEndergy.isModLoaded() && !disableEnderIoEndergyIntegration) {
                EndSteel = new Material.Builder(20, gtceuimId("end_steel"))
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

                CrudeSteel = new Material.Builder(21, gtceuimId("crude_steel"))
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

                CrystallineAlloy = new Material.Builder(22, gtceuimId("crystalline_alloy"))
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

                MelodicAlloy = new Material.Builder(23, gtceuimId("melodic_alloy"))
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

                CrystallinePinkSlime = new Material.Builder(24, gtceuimId("crystalline_pink_slime"))
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

                EnergeticSilver = new Material.Builder(25, gtceuimId("energetic_silver"))
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

                VividAlloy = new Material.Builder(26, gtceuimId("vivid_alloy"))
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

                StellarAlloy = new Material.Builder(27, gtceuimId("stellar_alloy"))
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
            }

            VibrantCrystal = new Material.Builder(28, gtceuimId("vibrant_crystal"))
                    .dust()
                    .gem(2)
                    .color(0x4FA045)
                    .flags(GENERATE_ALL_GEM)
                    .components(Emerald, 1, VibrantAlloy, 1)
                    .iconSet(EMERALD)
                    .build();

            EnderCrystal = new Material.Builder(29, gtceuimId("ender_crystal"))
                    .dust()
                    .gem(2)
                    .color(0x3A7C27)
                    .flags(GENERATE_ALL_GEM)
                    .components(VibrantCrystal, 1)
                    .iconSet(EMERALD)
                    .build();

            EnticingCrystal = new Material.Builder(30, gtceuimId("attractor_crystal"))
                    .dust()
                    .gem(2)
                    .color(0x509375)
                    .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                    .components(Emerald, 1)
                    .iconSet(EMERALD)
                    .build();

            WeatherCrystal = new Material.Builder(31, gtceuimId("weather_crystal"))
                    .dust()
                    .gem(2)
                    .color(0x4F1F60)
                    .flags(GENERATE_ALL_GEM)
                    .components(PulsatingCrystal, 2, VibrantCrystal, 2, EnderCrystal, 1)
                    .iconSet(EMERALD)
                    .build();

            PrescientCrystal = new Material.Builder(32, gtceuimId("prescient_crystal"))
                    .dust()
                    .gem(2)
                    .color(0x49A562)
                    .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                    .components(VibrantCrystal, 1)
                    .iconSet(EMERALD)
                    .build();
        }

        // Astral Sorcery

        if (AstralSorcery.isModLoaded() && !disableAstralSorceryIntegration) {
            Aquamarine = new Material.Builder(33, gtceuimId("aquamarine"))
                    .dust()
                    .ore()
                    .gem(2)
                    .addOreByproducts(Electrotine, Sapphire, Glowstone)
                    .flags(GENERATE_ALL_GEM)
                    .components(Beryllium, 3, Aluminium, 2, Silicon, 6, Oxygen, 18)
                    .color(0x008EFF)
                    .iconSet(DIAMOND)
                    .build();
            Starmetal = new Material.Builder(34, gtceuimId("astral_starmetal"))
                    .dust()
                    .ore()
                    .ingot()
                    .addOreByproducts(Aquamarine, GraniteBlack, Electrotine)
                    .liquid(new FluidBuilder().temperature(1))
                    .flags(GENERATE_ALL_METAL)
                    .color(0x2500D1)
                    .iconSet(STARMETAL)
                    .build().setFormula("Sp?");
        }

        // Botania
        if (Botania.isModLoaded() && !disableBotaniaIntegration) {
            ManaSteel = new Material.Builder(35, gtceuimId("manasteel"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL, NO_SMELTING)
                    .color(0x008EFF)
                    .iconSet(SHINY)
                    .build().setFormula("FeMa");

            TerraSteel = new Material.Builder(36, gtceuimId("terrasteel"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL, NO_SMELTING)
                    .color(0x2DFF4C)
                    .iconSet(SHINY)
                    .build().setFormula("FeMa(C)Ma(BeK4N5)Ma", true);

            Elementium = new Material.Builder(38, gtceuimId("elementium"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL, NO_SMELTING)
                    .color(0xFF2DEA)
                    .iconSet(SHINY)
                    .build().setFormula("(FeMa)?");

            ManaDiamond = new Material.Builder(39, gtceuimId("mana_diamond"))
                    .dust()
                    .gem(2)
                    .flags(GENERATE_ALL_GEM)
                    .color(0x009FB0)
                    .iconSet(DIAMOND)
                    .build().setFormula("(C)Ma");

            ManaPearl = new Material.Builder(40, gtceuimId("mana_pearl"))
                    .dust()
                    .gem(2)
                    .flags(GENERATE_ALL_GEM)
                    .color(0x007EA5)
                    .iconSet(PEARL)
                    .build().setFormula("(BeK4N5)Ma", true);

            Dragonstone = new Material.Builder(41, gtceuimId("dragonstone"))
                    .dust()
                    .gem(2)
                    .flags(GENERATE_ALL_GEM)
                    .color(0xFF2DEA)
                    .iconSet(DIAMOND)
                    .build().setFormula("Ds");;

            GaiaSpirit = new Material.Builder(42, gtceuimId("gaia_spirit"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL, NO_SMELTING)
                    .color(0xFFFFFF)
                    .iconSet(SHINY)
                    .build().setFormula("(FeMaCMaBeK4N5)?4", true);
        }

        // Galacticraft
        if (GalacticraftCore.isModLoaded() && !disableGalacticraftIntegration) {
            MeteoricIron = new Material.Builder(43, gtceuimId("meteoric_iron"))
                    .dust()
                    .ore()
                    .ingot()
                    .flags(GENERATE_ALL_METAL, NO_SMELTING)
                    .color(0x9B7753)
                    .iconSet(DULL)
                    .build().setFormula("FeSp", true);

            Desh = new Material.Builder(44, gtceuimId("desh"))
                    .dust()
                    .ore()
                    .ingot()
                    .flags(GENERATE_ALL_METAL, NO_SMELTING)
                    .color(0x231D1D)
                    .iconSet(DULL)
                    .build().setFormula("?Sp");

            Solar = new Material.Builder(45, gtceuimId("solar"))
                    .dust()
                    .ore()
                    .ingot()
                    .flags(GENERATE_ALL_METAL, NO_SMELTING)
                    .color(0xE17B29)
                    .iconSet(METALLIC)
                    .build();

            // GalaxySpace
            if (GalaxySpace.isModLoaded() && !disableGalaxySpaceIntegration) {
                Dolomite = new Material.Builder(46, gtceuimId("dolomite"))
                        .dust()
                        .gem(2)
                        .ore(true)
                        .flags(GENERATE_ALL_GEM)
                        .components(Calcium, 2, Magnesium, 4, Carbon, 2, Oxygen, 6)
                        .color(0x937E55)
                        .iconSet(DIAMOND)
                        .build().setFormula("CaMg(CO3)2", true);

                MysteriousCrystal = new Material.Builder(47, gtceuimId("mysterious_crystal"))
                        .dust()
                        .gem(2)
                        .ore(true)
                        .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                        .color(0x00A671)
                        .iconSet(DIAMOND)
                        .build().setFormula("?MaSp");

                VolcanicCrystal = new Material.Builder(48, gtceuimId("volcanic_crystal"))
                        .dust()
                        .gem(2)
                        .ore(true)
                        .flags(GENERATE_ALL_GEM, DISABLE_DECOMPOSITION)
                        .color(0xA6301F)
                        .iconSet(DIAMOND)
                        .build();

                Onyx = new Material.Builder(49, gtceuimId("onyx"))
                        .dust()
                        .gem(2)
                        .ore()
                        .flags(GENERATE_ALL_GEM)
                        .components(Silicon, 1, Oxygen, 2)
                        .color(0x16161B)
                        .iconSet(DIAMOND)
                        .build();
            }
        }

        // Thaumcraft
        if (Thaumcraft.isModLoaded() && !disableThaumcraftIntegration) {
            Amber = new Material.Builder(50, gtceuimId("amber"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .components(Carbon, 10, Hydrogen, 16, Oxygen, 1)
                    .color(0xFFC107)
                    .iconSet(AMBER)
                    .build();

            Thaumium = new Material.Builder(51, gtceuimId("thaumium"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL)
                    .color(0x70308b)
                    .iconSet(THAUMIUM)
                    .build().setFormula("FeMa", true);

            Void = new Material.Builder(52, gtceuimId("void"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL)
                    .color(0x3b2453)
                    .iconSet(VOID)
                    .build().setFormula("?Ma", true);

            DirtyAirCrystal = new Material.Builder(53, gtceuimId("dirty_air_crystal"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0xfff15d)
                    .iconSet(GEM_VERTICAL)
                    .build();

            DirtyIgnisCrystal = new Material.Builder(54, gtceuimId("dirty_ignis_crystal"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0xff7028)
                    .iconSet(GEM_VERTICAL)
                    .build();

            DirtyTerraCrystal = new Material.Builder(55, gtceuimId("dirty_terra_crystal"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0x41bb2c)
                    .iconSet(GEM_VERTICAL)
                    .build();

            DirtyAquaCrystal = new Material.Builder(56, gtceuimId("dirty_aqua_crystal"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0x01a9dc)
                    .iconSet(GEM_VERTICAL)
                    .build();

            DirtyOrdoCrystal = new Material.Builder(57, gtceuimId("dirty_ordo_crystal"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0xd4eae2)
                    .iconSet(GEM_VERTICAL)
                    .build();

            DirtyPerditioCrystal = new Material.Builder(58, gtceuimId("dirty_perditio_crystal"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0x1e1d1f)
                    .iconSet(GEM_VERTICAL)
                    .build();

        }
        // Aether Mod
        if (AetherLegacy.isModLoaded() && !disableAetherModIntegration) {
            Zanite = new Material.Builder(59, gtceuimId("zanite"))
                    .dust()
                    .gem(2)
                    .ore()
                    .flags(GENERATE_ALL_GEM)
                    .color(0x8800c6)
                    .iconSet(SHINY)
                    .build();

            Ambrosium = new Material.Builder(60, gtceuimId("ambrosium"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0xF4F260)
                    .iconSet(SHINY)
                    .build();

            Gravitite = new Material.Builder(61, gtceuimId("gravitite"))
                    .dust()
                    .gem(2)
                    .ore(true)
                    .flags(GENERATE_ALL_GEM)
                    .color(0xc76dc7)
                    .iconSet(SHINY)
                    .build();

            EnchantedGravitite = new Material.Builder(62, gtceuimId("enchanted_gravitite"))
                    .dust()
                    .ingot()
                    .flags(GENERATE_ALL_METAL)
                    .color(0xc600c1)
                    .iconSet(SHINY)
                    .build();
        }
    }
}
