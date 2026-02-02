package gtceuim.api.unification.ore;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtceuim.api.util.IMMods.*;
import static gtceuim.unification.material.materials.IMMaterials.*;

import hellfirepvp.astralsorcery.AstralSorcery;
import morph.avaritia.Avaritia;

public class IMOrePrefix {

    public static void init() {
        // Ae2
        if (Ae2.isModLoaded()) {
            dust.setIgnored(SkyStone);
            dust.setIgnored(CertusQuartz);
            dust.setIgnored(Fluix);

            gem.setIgnored(CertusQuartz);
            gem.setIgnored(ChargedCertusQuartz);
            gem.setIgnored(Fluix);
            gem.setIgnored(FluixPearl);

            block.setIgnored(CertusQuartz);
            block.setIgnored(Fluix);
            block.modifyMaterialAmount(CertusQuartz, 4);
            block.modifyMaterialAmount(ChargedCertusQuartz, 4);
            block.modifyMaterialAmount(Fluix, 4);
            block.modifyMaterialAmount(SkyStone, 1);

            // Crazy AE
            if (CrazyAe.isModLoaded()) {
                block.setIgnored(Fluixilized);
                block.modifyMaterialAmount(Fluixilized, 4);
            }
        }

        // Astral Sorcery
        if (AstralSorcery.isModLoaded()) {
            dust.setIgnored(Starmetal);

            ingot.setIgnored(Starmetal);

            gem.setIgnored(Aquamarine);
        }

        // Avaritia
        if (Avaritia.isModLoaded()) {
            nugget.setIgnored(CosmicNeutronium);

            ingot.setIgnored(CrystalMatrix);
            ingot.setIgnored(CosmicNeutronium);
            ingot.setIgnored(Infinity);

            gem.setIgnored(InfinityCatalyst);

            block.setIgnored(CrystalMatrix);
            block.setIgnored(CosmicNeutronium);
            block.setIgnored(Infinity);
        }

        // Draconic Evolution
        if (DraconicEvolution.isModLoaded()) {
            nugget.setIgnored(Draconium);
            nugget.setIgnored(AwakenedDraconium);

            ingot.setIgnored(Draconium);
            ingot.setIgnored(AwakenedDraconium);

            dust.setIgnored(Draconium);

            block.setIgnored(Draconium);
            block.setIgnored(AwakenedDraconium);
        }

        // Botania
        if (Botania.isModLoaded()) {
            nugget.setIgnored(ManaSteel);
            nugget.setIgnored(TerraSteel);
            nugget.setIgnored(Elementium);

            ingot.setIgnored(ManaSteel);
            ingot.setIgnored(TerraSteel);
            ingot.setIgnored(Elementium);
            ingot.setIgnored(GaiaSpirit);

            gem.setIgnored(ManaDiamond);
            gem.setIgnored(ManaPearl);

            block.setIgnored(ManaSteel);
            block.setIgnored(TerraSteel);
            block.setIgnored(Elementium);
            block.setIgnored(ManaDiamond);
            block.setIgnored(Dragonstone);
        }

        // Ender Io
        if (EnderIo.isModLoaded()) {
            nugget.setIgnored(ElectricalSteel);
            nugget.setIgnored(EnergeticAlloy);
            nugget.setIgnored(VibrantAlloy);
            nugget.setIgnored(RedstoneAlloy);
            nugget.setIgnored(ConductiveIron);
            nugget.setIgnored(PulsatingIron);
            nugget.setIgnored(DarkSteel);
            nugget.setIgnored(Soularium);
            nugget.setIgnored(EndSteel);

            ingot.setIgnored(ElectricalSteel);
            ingot.setIgnored(EnergeticAlloy);
            ingot.setIgnored(VibrantAlloy);
            ingot.setIgnored(RedstoneAlloy);
            ingot.setIgnored(ConductiveIron);
            ingot.setIgnored(PulsatingIron);
            ingot.setIgnored(DarkSteel);
            ingot.setIgnored(Soularium);
            ingot.setIgnored(EndSteel);

            dust.setIgnored(PulsatingCrystal);
            dust.setIgnored(VibrantCrystal);
            dust.setIgnored(EnderCrystal);
            dust.setIgnored(PrescientCrystal);

            gem.setIgnored(PulsatingCrystal);
            gem.setIgnored(VibrantCrystal);
            gem.setIgnored(EnderCrystal);
            gem.setIgnored(EnticingCrystal);
            gem.setIgnored(WeatherCrystal);
            gem.setIgnored(PrescientCrystal);

            block.setIgnored(ElectricalSteel);
            block.setIgnored(EnergeticAlloy);
            block.setIgnored(VibrantAlloy);
            block.setIgnored(RedstoneAlloy);
            block.setIgnored(ConductiveIron);
            block.setIgnored(PulsatingIron);
            block.setIgnored(DarkSteel);
            block.setIgnored(Soularium);
            block.setIgnored(EndSteel);

            if (EnderIoEndergy.isModLoaded()) {
                nugget.setIgnored(CrudeSteel);
                nugget.setIgnored(CrystallineAlloy);
                nugget.setIgnored(MelodicAlloy);
                nugget.setIgnored(StellarAlloy);
                nugget.setIgnored(CrystallinePinkSlime);
                nugget.setIgnored(EnergeticSilver);
                nugget.setIgnored(VividAlloy);

                ingot.setIgnored(CrudeSteel);
                ingot.setIgnored(CrystallineAlloy);
                ingot.setIgnored(MelodicAlloy);
                ingot.setIgnored(StellarAlloy);
                ingot.setIgnored(CrystallinePinkSlime);
                ingot.setIgnored(EnergeticSilver);
                ingot.setIgnored(VividAlloy);

                block.setIgnored(CrudeSteel);
                block.setIgnored(CrystallineAlloy);
                block.setIgnored(MelodicAlloy);
                block.setIgnored(StellarAlloy);
                block.setIgnored(CrystallinePinkSlime);
                block.setIgnored(EnergeticSilver);
                block.setIgnored(VividAlloy);
            }
        }

        // Galacticraft
        if (GalacticraftCore.isModLoaded()) {
            ingot.setIgnored(MeteoricIron);
            ingot.setIgnored(Desh);

            block.setIgnored(MeteoricIron);
            block.setIgnored(Desh);

            if (GalaxySpace.isModLoaded()) {
                dust.setIgnored(Dolomite);

                gem.setIgnored(Dolomite);
                gem.setIgnored(Onyx);
            }
        }

        if (Thaumcraft.isModLoaded()) {
            ingot.setIgnored(Thaumium);
            ingot.setIgnored(Void);

            gem.setIgnored(Amber);

            plate.setIgnored(Thaumium);
            plate.setIgnored(Void);

            nugget.setIgnored(Thaumium);
            nugget.setIgnored(Void);

            block.setIgnored(Thaumium);
            block.setIgnored(Void);
        }
    }
}
