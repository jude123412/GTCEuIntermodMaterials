package gtceuim.api.util;

import gtceuim.Tags;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class IMUtility {

    @NotNull
    public static ResourceLocation gtceuimId(@NotNull String path) {
        return new ResourceLocation(Tags.MODID, path);
    }

}
