package gtceuim;

import net.minecraftforge.common.config.Config;

@Config(modid = Tags.MODID, name = Tags.MODID + "/" + Tags.MODID)
public class gtceuimConfig {

    @Config.Comment({ "Disable to remove all Ae2 Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableAe2Integration = false;
    @Config.Comment({ "Disable to remove all Crazy Ae Integration Materials and Recipes.",
            "Default: false" })
    @Config.RequiresMcRestart
    public static boolean disableCrazyAeIntegration = false;

}
