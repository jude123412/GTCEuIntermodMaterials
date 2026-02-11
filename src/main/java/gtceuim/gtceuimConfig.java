package gtceuim;

import net.minecraftforge.common.config.Config;

@Config(modid = Tags.MODID, name = Tags.MODID + "/" + Tags.MODID)
public class gtceuimConfig {

    @Config.Comment({ "Disable to remove all Avaritia Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableAvaritiaIntegration = false;

    @Config.Comment({ "Disable to remove all Ae2 Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableAe2Integration = false;

    @Config.Comment({ "Disable to remove all Crazy Ae Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableCrazyAeIntegration = false;

    @Config.Comment({ "Disable to remove all Thaumcraft Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableThaumcraftIntegration = false;

    @Config.Comment({ "Disable to remove all Botania Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableBotaniaIntegration = false;

    @Config.Comment({ "Disable to remove all Astral Sorcery Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableAstralSorceryIntegration = false;

    @Config.Comment({ "Disable to remove all Blood Magic Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableBloodMagicIntegration = false;

    @Config.Comment({ "Disable to remove all Draconic Evolution Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableDraconicEvolutionIntegration = false;

    @Config.Comment({ "Disable to remove all Aether Mod Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableAetherModIntegration = false;

    @Config.Comment({ "Disable to remove all Galacticraft Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableGalacticraftIntegration = false;

    @Config.Comment({ "Disable to remove all Galaxy Space Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableGalaxySpaceIntegration = false;

    @Config.Comment({ "Disable to remove all Ender IO Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableEnderIoIntegration = false;

    @Config.Comment({ "Disable to remove all Ender IO Endergy Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableEnderIoEndergyIntegration = false;

    @Config.Comment({ "Disable to remove all Extra Utilities 2 Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableExtraUtilities2Integration = false;

    @Config.Comment({ "Disable to remove all Thermal Expansion Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableThermalExpansionIntegration = false;
}
