package org.boff.works;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = BoffBlocks.MODID, name = BoffBlocks.NAME, version = BoffBlocks.VERSION, acceptedMinecraftVersions = BoffBlocks.MC_VERSION)
public class BoffBlocks
{
	public static final String MODID = "boffblocks";
	public static final String NAME = "BoffBlocks 1.12.2 Backport Mod";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(BoffBlocks.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
        
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		LOGGER.info(BoffBlocks.NAME + " says hi!");
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
        
	}
}