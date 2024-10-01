package net.radient.gems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.radient.gems.block.ModBlocks;
import net.radient.gems.item.ModItems;
import net.radient.gems.item.custom.GayArmorItem;

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

    //pietersite
        itemModelGenerator.register(ModItems.RAW_PIETERSITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIETERSITE, Models.GENERATED);

        //heliotrope
        itemModelGenerator.register(ModItems.RAW_HELIOTRPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELIOTROPE, Models.GENERATED);

        //pumpkin
        itemModelGenerator.register(ModItems.PUMPKIN_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_GEM, Models.GENERATED);
        //spinel
        itemModelGenerator.register(ModItems.RAW_SPINEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPINEL, Models.GENERATED);

        //mushroom gem
        itemModelGenerator.register(ModItems.RAW_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSHROOM_GEM, Models.GENERATED);

      //green painite
        itemModelGenerator.register(ModItems.RAW_GREEN_PAINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_PAINITE, Models.GENERATED);

      //ASTERISM
        itemModelGenerator.register(ModItems.UNBONDED_ASTRISM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASTERISM, Models.GENERATED);



    }
}