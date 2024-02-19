package org.boff.works;

import org.boff.works.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BoffBlocksTab extends CreativeTabs
{
	public BoffBlocksTab()
	{
		super(BoffBlocks.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ModItems.FIRST_ITEM);
	}
}
