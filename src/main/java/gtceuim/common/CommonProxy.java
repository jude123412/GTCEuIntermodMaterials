package gtceuim.common;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.MaterialRegistryEvent;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gtceuim.Tags;
import gtceuim.api.util.IMLogger;
import gtceuim.loaders.OreDictionaryLoader;
import gtceuim.loaders.RecipeLoader;
import gtceuim.unification.material.materials.IMMaterials;

@Mod.EventBusSubscriber(modid = Tags.MODID)
public class CommonProxy {

    public void preLoad() {}

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void registerMaterials(MaterialEvent event) {
        IMLogger.log.info("Registering Materials...");
        IMMaterials.init();
    }

    @SubscribeEvent
    public static void createMaterialRegistry(MaterialRegistryEvent event) {
        IMLogger.log.info("Registering Material Event...");
        GregTechAPI.materialManager.createRegistry("gtceuim");
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerRecipesLow(RegistryEvent.Register<IRecipe> event) {
        IMLogger.log.info("Registering ore dictionaries...");
        OreDictionaryLoader.init();

        MinecraftForge.EVENT_BUS.post(new GregTechAPI.RegisterEvent<>(null, OreDictionaryLoader.class));

        IMLogger.log.info("Registering recipes...");
        MinecraftForge.EVENT_BUS.post(new GregTechAPI.RegisterEvent<>(null, ItemMaterialInfo.class));

        RecipeLoader.registerMachineRecipes();
    }
}
