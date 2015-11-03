package villain.mc.mobdisabler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static final String CATAGORY_PASSIVE = "passive";
	public static final String CATAGORY_TAMEABLE = "tameable";
	public static final String CATAGORY_UTILITY = "utility";
	public static final String CATAGORY_NEUTRAL = "neutral";
	public static final String CATAGORY_HOSTILE = "hostile";
	public static final String CATAGORY_BOSS = "boss";
	
	public static Configuration config;
	
	// Passive
	public static boolean bat = true;
	public static boolean chicken = true;
	public static boolean cow = true;
	public static boolean mooshroom = true;
	public static boolean pig = true;
	public static boolean sheep = true;
	public static boolean squid = true;
	public static boolean villager = true;

	// Tameable
	public static boolean horse = true;
	public static boolean donkey = true;
	public static boolean mule = true;
	public static boolean ocelot = true;
	public static boolean wolf = true;
	
	// Utility
	public static boolean ironGolem = true;
	public static boolean snowGolem = true;
	
	// Neutral
	public static boolean spider = true;
	public static boolean caveSpider = true;
	public static boolean enderman = true;
	public static boolean zombiePigman = true;
	
	// Hostile
	public static boolean blaze = true;
	public static boolean chickenJockey = true;
	public static boolean creeper = true;
	public static boolean ghast = true;
	public static boolean magmaCube = true;
	public static boolean silverfish = true;
	public static boolean skeleton = true;
	public static boolean slime = true;
	public static boolean spiderJockey = true;
	public static boolean witch = true;
	public static boolean witherSkeleton = true;
	public static boolean zombie = true;
	public static boolean zombieVillager = true;
	
	// Boss
	public static boolean enderDragon = true;
	public static boolean wither = true;
	
	public static void init(File configFile){
		if(config == null){
			config = new Configuration(configFile);			
			loadConfig();
		}
	}
	
	private static void loadConfig(){
		// Passive
		bat = config.getBoolean("bat", CATAGORY_PASSIVE, true, "");
		chicken = config.getBoolean("chicken", CATAGORY_PASSIVE, true, "");
		cow = config.getBoolean("cow", CATAGORY_PASSIVE, true, "");
		mooshroom = config.getBoolean("mooshroom", CATAGORY_PASSIVE, true, "");
		pig = config.getBoolean("pig", CATAGORY_PASSIVE, true, "");
		sheep = config.getBoolean("sheep", CATAGORY_PASSIVE, true, "");
		squid = config.getBoolean("squid", CATAGORY_PASSIVE, true, "");
		villager = config.getBoolean("villager", CATAGORY_PASSIVE, true, "");
		
		// Tameable
		horse = config.getBoolean("horse", CATAGORY_TAMEABLE, true, "");
		donkey = config.getBoolean("donkey", CATAGORY_TAMEABLE, true, "");
		mule = config.getBoolean("mule", CATAGORY_TAMEABLE, true, "");
		ocelot = config.getBoolean("ocelot", CATAGORY_TAMEABLE, true, "");
		wolf = config.getBoolean("wolf", CATAGORY_TAMEABLE, true, "");
		
		// Utility
		ironGolem = config.getBoolean("ironGolem", CATAGORY_UTILITY, true, "");
		snowGolem = config.getBoolean("snowGolem", CATAGORY_UTILITY, true, "");
		
		// Neutral
		spider = config.getBoolean("spider", CATAGORY_NEUTRAL, true, "");
		caveSpider = config.getBoolean("caveSpider", CATAGORY_NEUTRAL, true, "");
		enderman = config.getBoolean("enderman", CATAGORY_NEUTRAL, true, "");
		zombiePigman = config.getBoolean("zombiePigman", CATAGORY_NEUTRAL, true, "");
		
		// Hostile
		blaze = config.getBoolean("blaze", CATAGORY_HOSTILE, true, "");
		creeper = config.getBoolean("creeper", CATAGORY_HOSTILE, true, "");
		ghast = config.getBoolean("ghast", CATAGORY_HOSTILE, true, "");
		magmaCube = config.getBoolean("magmaCube", CATAGORY_HOSTILE, true, "");
		silverfish = config.getBoolean("silverfish", CATAGORY_HOSTILE, true, "");
		skeleton = config.getBoolean("skeleton", CATAGORY_HOSTILE, true, "");
		slime = config.getBoolean("slime", CATAGORY_HOSTILE, true, "");
		witch = config.getBoolean("witch", CATAGORY_HOSTILE, true, "");
		witherSkeleton = config.getBoolean("witherSkeleton", CATAGORY_HOSTILE, true, "");
		zombie = config.getBoolean("zombie", CATAGORY_HOSTILE, true, "");
		zombieVillager = config.getBoolean("zombieVillager", CATAGORY_HOSTILE, true, "");
		
		// Boss
		enderDragon = config.getBoolean("enderDragon", CATAGORY_BOSS, true, "");
		wither = config.getBoolean("wither", CATAGORY_BOSS, true, "");
		
		// Save?
		if(config.hasChanged()){
			config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
			loadConfig();
		}
	}
}