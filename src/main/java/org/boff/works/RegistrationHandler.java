package org.boff.works;

import org.boff.works.init.ModBlocks;
import org.boff.works.util.RegistryUtil;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = BoffBlocks.MODID)
public class RegistrationHandler
{
	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{
		final Item[] items =
		{
				RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(BoffBlocks.BOFFBLOCKS_TAB),
				
		};
		
		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event)
	{
		final Block[] blocks =
		{
				RegistryUtil.setBlockName(new Block(Material.ROCK), "first_block").setCreativeTab(BoffBlocks.BOFFBLOCKS_TAB),
				
		};
		
		event.getRegistry().registerAll(blocks);
	}
}