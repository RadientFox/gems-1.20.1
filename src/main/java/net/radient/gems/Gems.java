package net.radient.gems;

import net.fabricmc.api.ModInitializer;

import net.radient.gems.block.ModBlocks;
import net.radient.gems.entity.ModEntities;
import net.radient.gems.item.ModItemGroups;
import net.radient.gems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gems implements ModInitializer {
public static final String MOD_ID = "gems";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();

	}
}