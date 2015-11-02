package villain.mc.mobdisabler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MobDisabler {

	// Instance
	@Mod.Instance(Reference.MOD_ID)
	public static MobDisabler instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event){
		if(	event.entity instanceof EntitySkeleton ||
			event.entity instanceof EntityZombie ||
			event.entity instanceof EntityCreeper){
			event.setCanceled(true);
		}
	}
}