package net.radient.gems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.radient.gems.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.BLUE_OBSIDIAN)
                .add(ModBlocks.GALAXIUM_BLOCK)
                .add(ModBlocks.GALAXIUM_ORE)
                .add(ModBlocks.PIETERSITE_BLOCK)
                .add(ModBlocks.PIETERSITE_ORE)
                .add(ModBlocks.HELIOTROPE_BLOCK)
                .add(ModBlocks.HELIOTROPE_ORE)
                .add(ModBlocks.PUMPKIN_BLOCK)
                .add(ModBlocks.PUMPKIN_DEBRIS)
                .add(ModBlocks.SPINEL_BLOCK)
                .add(ModBlocks.SPINEL_ORE)
                .add(ModBlocks.MUSHROOM_GEM_BLOCK)
                .add(ModBlocks.MUSHROOM_ORE)
                .add(ModBlocks.GREEN_PAINITE_BLOCK)
                .add(ModBlocks.GREEN_PANITE_ORE)
                .add(ModBlocks.ASTERISM_BLOCK)
                .add(ModBlocks.ASTERISM_ORE);


        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")))
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.BLUE_OBSIDIAN)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.GALAXIUM_BLOCK)
                .add(ModBlocks.GALAXIUM_ORE)
                .add(ModBlocks.PIETERSITE_BLOCK)
                .add(ModBlocks.PIETERSITE_ORE)
                .add(ModBlocks.HELIOTROPE_BLOCK)
                .add(ModBlocks.HELIOTROPE_ORE)
                .add(ModBlocks.PUMPKIN_BLOCK)
                .add(ModBlocks.PUMPKIN_DEBRIS)
                .add(ModBlocks.SPINEL_BLOCK)
                .add(ModBlocks.SPINEL_ORE)
                .add(ModBlocks.MUSHROOM_GEM_BLOCK)
                .add(ModBlocks.MUSHROOM_ORE)
                .add(ModBlocks.GREEN_PAINITE_BLOCK)
                .add(ModBlocks.GREEN_PANITE_ORE)
                .add(ModBlocks.ASTERISM_BLOCK)
                .add(ModBlocks.ASTERISM_ORE);


    }
}
