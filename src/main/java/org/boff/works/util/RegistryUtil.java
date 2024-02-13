package org.boff.works.util;

import org.boff.works.BoffBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil
{
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(BoffBlocks.MODID, name).setTranslationKey(BoffBlocks.MODID + "." + name);
		return item;
	}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(BoffBlocks.MODID, name).setTranslationKey(BoffBlocks.MODID + "." + name);
		return block;
	}
	
}