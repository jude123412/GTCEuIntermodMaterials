package gtceuim.common;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.MaterialRegistryEvent;
import gtceuim.Tags;
import gtceuim.api.util.IMLogger;
import gtceuim.unification.materials.material.IMMaterials;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Tags.MODID)
public class CommonProxy {

    public void preLoad() {}

    @SubscribeEvent
    public static void createMaterialRegistry(MaterialRegistryEvent event) {
        IMLogger.log.info("Registering Material Event...");
        GregTechAPI.materialManager.createRegistry("gtceuim");
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterials(MaterialEvent event) {
        IMLogger.log.info("Registering Materials...");
        IMMaterials.init();
    }
}
