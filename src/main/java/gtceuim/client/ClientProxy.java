package gtceuim.client;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.event.MaterialRegistryEvent;
import gtceuim.api.util.IMLogger;
import gtceuim.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    public void preLoad() {
        super.preLoad();
    }
}
