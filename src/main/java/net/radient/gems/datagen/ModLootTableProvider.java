package net.radient.gems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.loot.LootTable;
import net.radient.gems.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_ORE);
        addDrop(ModBlocks.BLUE_OBSIDIAN);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_ORE);
        addDrop(ModBlocks.GALAXIUM_BLOCK);
        addDrop(ModBlocks.GALAXIUM_ORE);
        addDrop(ModBlocks.PIETERSITE_BLOCK);
        addDrop(ModBlocks.PIETERSITE_ORE);
        addDrop(ModBlocks.HELIOTROPE_BLOCK);
        addDrop(ModBlocks.HELIOTROPE_ORE);
        addDrop(ModBlocks.PUMPKIN_BLOCK);
        addDrop(ModBlocks.PUMPKIN_DEBRIS);
        addDrop(ModBlocks.SPINEL_BLOCK);
        addDrop(ModBlocks.SPINEL_ORE);
        addDrop(ModBlocks.MUSHROOM_GEM_BLOCK);
        addDrop(ModBlocks.MUSHROOM_ORE);
        addDrop(ModBlocks.GREEN_PAINITE_BLOCK);
        addDrop(ModBlocks.GREEN_PANITE_ORE);
        addDrop(ModBlocks.ASTERISM_BLOCK);
        addDrop(ModBlocks.AQUAMARINE_BLOCK);
        addDrop(ModBlocks.AQUAMARINE_ORE);



    }
}
