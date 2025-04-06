package net.threeey.compoundedconcrete;

import net.fabricmc.api.ModInitializer;

import net.threeey.compoundedconcrete.block.ModBlocks;
import net.threeey.compoundedconcrete.item.ModItemGroups;
import net.threeey.compoundedconcrete.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompoundedConcrete implements ModInitializer {
	public static final String MOD_ID = "compoundedconcrete";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}