package villain.mc.mobdisabler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MobDisabler {

	// Instance
	@Mod.Instance(Reference.MOD_ID)
	public static MobDisabler instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		// Config
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event){
		if(event.entity instanceof EntityBat && !ConfigHandler.bat){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityChicken && !ConfigHandler.chicken){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityCow && !ConfigHandler.cow){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityMooshroom && !ConfigHandler.mooshroom){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityPig && !ConfigHandler.pig){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntitySheep && !ConfigHandler.sheep){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntitySquid && !ConfigHandler.squid){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityVillager && !ConfigHandler.villager){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityHorse){
			EntityHorse horse = (EntityHorse)event.entity;
			if(horse.getHorseType() == 0 && !ConfigHandler.horse){
				event.setCanceled(true);
			}
			else if(horse.getHorseType() == 1 && !ConfigHandler.donkey){
				event.setCanceled(true);
			}
			else if(horse.getHorseType() == 2 && !ConfigHandler.mule){
				event.setCanceled(true);
			}
		}
		else if(event.entity instanceof EntityOcelot && !ConfigHandler.ocelot){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityWolf && !ConfigHandler.wolf){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityIronGolem && !ConfigHandler.ironGolem){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntitySnowman && !ConfigHandler.snowGolem){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntitySpider && !ConfigHandler.spider){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityCaveSpider && !ConfigHandler.caveSpider){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityEnderman && !ConfigHandler.enderman){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityPigZombie && !ConfigHandler.zombiePigman){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityBlaze && !ConfigHandler.blaze){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityCreeper && !ConfigHandler.creeper){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityGhast && !ConfigHandler.ghast){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityMagmaCube && !ConfigHandler.magmaCube){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntitySilverfish && !ConfigHandler.silverfish){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntitySlime && !ConfigHandler.slime){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityWitch && !ConfigHandler.witch){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntitySkeleton){
			EntitySkeleton skeleton = (EntitySkeleton)event.entity;
			if(skeleton.getSkeletonType() == 0 && !ConfigHandler.skeleton){
				event.setCanceled(true);
			}
			else if(skeleton.getSkeletonType() == 1 && !ConfigHandler.witherSkeleton){
				event.setCanceled(true);
			}
		}
		else if(event.entity instanceof EntityZombie){
			EntityZombie zombie = (EntityZombie)event.entity;
			if(zombie.isVillager() && !ConfigHandler.zombieVillager){
				event.setCanceled(true);
			}
			else if(!ConfigHandler.zombie) {
				event.setCanceled(true);
			}
		}
		else if(event.entity instanceof EntityDragon && !ConfigHandler.enderDragon){
			event.setCanceled(true);
		}
		else if(event.entity instanceof EntityWither && !ConfigHandler.wither){
			event.setCanceled(true);
		}
	}
}