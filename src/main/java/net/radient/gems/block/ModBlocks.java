package net.radient.gems.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.radient.gems.Gems;

public class ModBlocks {

//ruby
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
        new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
        new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                UniformIntProvider.create(1,2)));


    //Sapphire
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));


//Galaxium

    public static final Block BLUE_OBSIDIAN = registerBlock("blue_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).sounds(BlockSoundGroup.STONE).strength(50.0F, 1200.0F).requiresTool()));
    public static final Block GALAXIUM_BLOCK = registerBlock("galaxium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block GALAXIUM_ORE = registerBlock("galaxium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));

    //pietersite

    public static final Block PIETERSITE_BLOCK = registerBlock("pietersite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block PIETERSITE_ORE = registerBlock("pietersite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));

    //Heliotrope

    public static final Block HELIOTROPE_BLOCK = registerBlock("heliotrope_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block HELIOTROPE_ORE = registerBlock("heliotrope_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));


//Pumpkin


    public static final Block PUMPKIN_BLOCK = registerBlock("pumpkin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block PUMPKIN_DEBRIS = registerBlock("pumpkin_debris",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));

//spinel
public static final Block SPINEL_BLOCK = registerBlock("spinel_block",
        new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block SPINEL_ORE = registerBlock("spinel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));


    //Mushroom Gem
    public static final Block MUSHROOM_GEM_BLOCK = registerBlock("mushroom_gem_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block MUSHROOM_ORE = registerBlock("mushroom_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));


    //Green Panite
    public static final Block GREEN_PAINITE_BLOCK = registerBlock("green_painite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block GREEN_PANITE_ORE = registerBlock("green_painite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));


    //asterism
    public static final Block ASTERISM_BLOCK = registerBlock("asterism_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F).requiresTool()));
    public static final Block ASTERISM_ORE = registerBlock("asterism_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(30.0F, 1200.0F),
                    UniformIntProvider.create(1,2)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Gems.MOD_ID, name), block);
    }

private static Item registerBlockItem(String name, Block block){
    return Registry.register(Registries.ITEM,new Identifier(Gems.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
}
    public static void registerModBlocks (){

        Gems.LOGGER.info("registering ModBlocks for" + Gems.MOD_ID);
    }
}
