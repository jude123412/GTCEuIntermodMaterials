package gtceuim.api.util;

import gtceuim.Tags;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class IMUtility {

    @NotNull
    public static ResourceLocation gtceuimId(@NotNull String path) {
        return new ResourceLocation(Tags.MODID, path);
    }

    public static @NotNull ItemStack getItemStackFromString(String modId, String itemId, int metaId) {
        if (modId == null || itemId == null) {
            IMLogger.log.error("Null modId or itemId provided: " + modId + ":" + itemId + ":" + metaId);
            return ItemStack.EMPTY;
        }

        ResourceLocation location = new ResourceLocation(modId, itemId);
        Item item = ForgeRegistries.ITEMS.getValue(location);

        if (item == null || item == Items.AIR) {
            IMLogger.log.error("Unable to find item: " + modId + ":" + itemId + " (meta " + metaId + ")");
            return ItemStack.EMPTY;
        }

        // Meta is still valid in 1.12.2, even if deprecated in later versions
        return new ItemStack(item, 1, metaId);
    }

    public static ItemStack getBlockItemStackFromString(String modId, String itemId, int metaId) {
        return getItemStackFromString(modId, itemId, metaId);
    }
}
