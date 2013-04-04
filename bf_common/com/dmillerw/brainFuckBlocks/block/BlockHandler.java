package com.dmillerw.brainFuckBlocks.block;

import com.dmillerw.brainFuckBlocks.interfaces.IIconProvider;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {

	public static Block bfCode;
	public static Block bfCPU;
	public static Block bfWire;
	public static Block bfPeripheral;
	
	public static void init() {
		bfCPU = new BlockCPU(BlockIDs.bfCPUID).setBlockName("bfCPU");
		GameRegistry.registerBlock(bfCPU, "bfCPU");
		LanguageRegistry.addName(bfCPU, "CPU");
		((IIconProvider)bfCPU).registerIcons();
		
		bfCode = new BlockCode(BlockIDs.bfCodeID).setBlockName("bfCode");
		GameRegistry.registerBlock(bfCode, ItemBlockCode.class, "bfCode");
		for (int i=0; i<BlockCode.blockNames.length; i++) {
			LanguageRegistry.addName(new ItemStack(bfCode.blockID, 1, i), BlockCode.blockNames[i]);
		}
		((IIconProvider)bfCode).registerIcons();
		
		bfWire = new BlockWire(BlockIDs.bfWireID).setBlockName("bfWire");
		GameRegistry.registerBlock(bfWire, "bfWire");
		LanguageRegistry.addName(bfWire, "Wire");
		((IIconProvider)bfWire).registerIcons();
		
		bfPeripheral = new BlockPeripheral(BlockIDs.bfPeripheralID).setBlockName("bfPeripheral");
		GameRegistry.registerBlock(bfPeripheral, ItemBlockPeripheral.class, "bfPeripheralRS");
		for (int i=0; i<BlockPeripheral.blockNames.length; i++) {
			LanguageRegistry.addName(new ItemStack(bfPeripheral.blockID, 1, i), BlockPeripheral.blockNames[i]);
		}
		((IIconProvider)bfPeripheral).registerIcons();
	}
	
}
