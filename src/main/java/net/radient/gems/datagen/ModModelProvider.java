package net.radient.gems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.radient.gems.block.ModBlocks;
import net.radient.gems.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GALAXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GALAXIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIETERSITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIETERSITE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HELIOTROPE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HELIOTROPE_ORE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPINEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPINEL_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUSHROOM_GEM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUSHROOM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_PAINITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_PANITE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASTERISM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASTERISM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_ORE);




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //Ruby
    itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
    itemModelGenerator.register(ModItems.RUBY_PAW, Models.GENERATED);
    itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
    itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));



   //test
    itemModelGenerator.register( ModItems.GAY_HELMET, Models.GENERATED);
    itemModelGenerator.register( ModItems.GAY_CHESTPLATE,Models.GENERATED);
    itemModelGenerator.register( ModItems.GAY_LEGGINGS,Models.GENERATED);
    itemModelGenerator.register( ModItems.GAY_BOOTS,Models.GENERATED);

    itemModelGenerator.register(ModItems.NETHER_GEM_UPGRADE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.OVERWORLD_GEM_UPGRADE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.END_GEM_UPGRADE, Models.HANDHELD);


    //sapphire
    itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
    itemModelGenerator.register(ModItems.RAW_SAPPHIRE, Models.GENERATED);

    itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
    itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
    itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);



        //galaxium
    itemModelGenerator.register(ModItems.RAW_GALAXIUM, Models.GENERATED);
    itemModelGenerator.register(ModItems.GALAXIUM, Models.GENERATED);

    itemModelGenerator.register(ModItems.GALAXIUM_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.GALAXIUM_SHOVEL, Models.HANDHELD);
    itemModelGenerator.register(ModItems.GALAXIUM_HOE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.GALAXIUM_SWORD, Models.HANDHELD);
    itemModelGenerator.register(ModItems.GALAXIUM_AXE, Models.HANDHELD);

    //pietersite
        itemModelGenerator.register(ModItems.RAW_PIETERSITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIETERSITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.PIETERSITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIETERSITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIETERSITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIETERSITE_AXE, Models.HANDHELD);

        //heliotrope
        itemModelGenerator.register(ModItems.RAW_HELIOTRPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELIOTROPE, Models.GENERATED);

        itemModelGenerator.register(ModItems.HELIOTROPE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HELIOTROPE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HELIOTROPE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HELIOTROPE_AXE, Models.HANDHELD);

        //pumpkin
        itemModelGenerator.register(ModItems.PUMPKIN_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_GEM, Models.GENERATED);

        itemModelGenerator.register(ModItems.PUMPKIN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUMPKIN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUMPKIN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUMPKIN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUMPKIN_AXE, Models.HANDHELD);

        //spinel
        itemModelGenerator.register(ModItems.RAW_SPINEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPINEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPINEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SPINEL_HOE, Models.HANDHELD);

        //mushroom gem
        itemModelGenerator.register(ModItems.RAW_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSHROOM_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSHROOM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MUSHROOM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MUSHROOM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MUSHROOM_AXE, Models.HANDHELD);

      //green painite
        itemModelGenerator.register(ModItems.RAW_GREEN_PAINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_PAINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_PAINITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_PAINITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_PAINITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_PAINITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_PAINITE_AXE, Models.HANDHELD);


      //ASTERISM
        itemModelGenerator.register(ModItems.UNBONDED_ASTRISM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASTERISM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASTERISM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASTERISM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASTERISM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASTERISM_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DIVINE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR_OF_WILLPOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR_OF_DARKNESS, Models.GENERATED);

        itemModelGenerator.register(ModItems.AMULET_OF_POWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMULET_OF_SPACE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMULET_OF_TIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMULET_OF_HOPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMULET_OF_REALITY, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMULET_OF_WORLDS, Models.GENERATED);




        //Aquamarine
        itemModelGenerator.register(ModItems.RAW_AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUAMARINE, Models.GENERATED);


    }
}
