package net.radient.gems.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.radient.gems.Gems;
import net.radient.gems.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup Geems = Registry.register(Registries.ITEM_GROUP, new Identifier(Gems.MOD_ID, "gems"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.geems"))
                    .icon(() -> new ItemStack(ModItems.AURA_KATANA)).entries((displayContext, entries) -> {

entries.add(ModItems.RUBY_PAW);
entries.add(ModItems.RUBY);
entries.add(ModBlocks.RUBY_BLOCK);
entries.add(ModBlocks.RUBY_ORE);
entries.add(ModItems.RUBY_SCYTHE);
entries.add(ModItems.RUBY_AXE);
entries.add(ModItems.RUBY_HOE);
entries.add(ModItems.RUBY_SHOVEL);
entries.add(ModItems.RUBY_PICKAXE);
entries.add(ModItems.RUBY_HELMET);
entries.add(ModItems.RUBY_CHESTPLATE);
entries.add(ModItems.RUBY_LEGGINGS);
entries.add(ModItems.RUBY_BOOTS);

entries.add(ModItems.SAPPHIRE);
entries.add(ModItems.RAW_SAPPHIRE);
entries.add(ModBlocks.SAPPHIRE_BLOCK);
entries.add(ModBlocks.SAPPHIRE_ORE);
entries.add(ModItems.SAPPHIRE_SWORD);
entries.add(ModItems.SAPPHIRE_AXE);
entries.add(ModItems.SAPPHIRE_HOE);
entries.add(ModItems.SAPPHIRE_SHOVEL);
entries.add(ModItems.SAPPHIRE_PICKAXE);

entries.add(ModItems.GALAXIUM);
entries.add(ModItems.RAW_GALAXIUM);
entries.add(ModBlocks.BLUE_OBSIDIAN);
entries.add(ModBlocks.GALAXIUM_BLOCK);
entries.add(ModBlocks.GALAXIUM_ORE);
entries.add(ModItems.GALAXIUM_SWORD);
entries.add(ModItems.GALAXIUM_AXE);
entries.add(ModItems.GALAXIUM_HOE);
entries.add(ModItems.GALAXIUM_SHOVEL);
entries.add(ModItems.GALAXIUM_PICKAXE);

entries.add(ModItems.PIETERSITE);
entries.add(ModItems.RAW_PIETERSITE);
entries.add(ModBlocks.PIETERSITE_BLOCK);
entries.add(ModBlocks.PIETERSITE_ORE);
entries.add(ModItems.PIETERSITE_SWORD);
entries.add(ModItems.PIETERSITE_AXE);
entries.add(ModItems.PIETERSITE_HOE);
entries.add(ModItems.PIETERSITE_SHOVEL);
entries.add(ModItems.PIETERSITE_PICKAXE);


entries.add(ModItems.HELIOTROPE);
entries.add(ModItems.RAW_HELIOTRPE);
entries.add(ModBlocks.HELIOTROPE_BLOCK);
entries.add(ModBlocks.HELIOTROPE_ORE);
entries.add(ModItems.BLOODSTONE_CLAYMORE);
entries.add(ModItems.HELIOTROPE_AXE);
entries.add(ModItems.HELIOTROPE_HOE);
entries.add(ModItems.HELIOTROPE_SHOVEL);
entries.add(ModItems.HELIOTROPE_PICKAXE);

entries.add(ModItems.PUMPKIN_GEM);
entries.add(ModItems.PUMPKIN_BERRIES);
entries.add(ModBlocks.PUMPKIN_BLOCK);
entries.add(ModBlocks.PUMPKIN_DEBRIS);
entries.add(ModItems.PUMPKIN_SWORD);
entries.add(ModItems.PUMPKIN_AXE);
entries.add(ModItems.PUMPKIN_HOE);
entries.add(ModItems.PUMPKIN_SHOVEL);
entries.add(ModItems.PUMPKIN_PICKAXE);

entries.add(ModItems.SPINEL);
entries.add(ModItems.RAW_SPINEL);
entries.add(ModBlocks.SPINEL_BLOCK);
entries.add(ModBlocks.SPINEL_ORE);
entries.add(ModItems.SPINEL_SCYTHE);
entries.add(ModItems.SPINEL_AXE);
entries.add(ModItems.SPINEL_HOE);
entries.add(ModItems.SPINEL_SHOVEL);
entries.add(ModItems.SPINEL_DRILL);

entries.add(ModItems.MUSHROOM_GEM);
entries.add(ModItems.RAW_MUSHROOM);
entries.add(ModBlocks.MUSHROOM_GEM_BLOCK);
entries.add(ModBlocks.MUSHROOM_ORE);
entries.add(ModItems.MUSHROOM_SWORD);
entries.add(ModItems.MUSHROOM_AXE);
entries.add(ModItems.MUSHROOM_HOE);
entries.add(ModItems.MUSHROOM_SHOVEL);
entries.add(ModItems.MUSHROOM_PICKAXE);

entries.add(ModItems.GREEN_PAINITE);
entries.add(ModItems.RAW_GREEN_PAINITE);
entries.add(ModBlocks.GREEN_PAINITE_BLOCK);
entries.add(ModBlocks.GREEN_PANITE_ORE);
entries.add(ModItems.GREEN_PAINITE_SWORD);
entries.add(ModItems.GREEN_PAINITE_AXE);
entries.add(ModItems.GREEN_PAINITE_HOE);
entries.add(ModItems.GREEN_PAINITE_SHOVEL);
entries.add(ModItems.GREEN_PAINITE_PICKAXE);
entries.add(ModItems.GREEN_DISK);

entries.add(ModItems.ASTERISM);
entries.add(ModItems.UNBONDED_ASTRISM);
entries.add(ModBlocks.ASTERISM_BLOCK);
entries.add(ModBlocks.ASTERISM_ORE);
entries.add(ModItems.ASTERISM_T1_SWORD);
entries.add(ModItems.ASTERISM_T2_SWORD);
entries.add(ModItems.ASTERISM_T3_SWORD);
entries.add(ModItems.ASTERISM_AXE);
entries.add(ModItems.ASTERISM_HOE);
entries.add(ModItems.ASTERISM_SHOVEL);
entries.add(ModItems.ASTERISM_PICKAXE);
entries.add(ModItems.DIVINE_CRYSTAL);

entries.add(ModItems.STAR_OF_WILLPOWER);
entries.add(ModItems.STAR_OF_DARKNESS);

entries.add(ModItems.AMULET_OF_POWER);
entries.add(ModItems.AMULET_OF_SPACE);
entries.add(ModItems.AMULET_OF_TIME);
entries.add(ModItems.AMULET_OF_HOPE);
entries.add(ModItems.AMULET_OF_REALITY);
entries.add(ModItems.AMULET_OF_WORLDS);

entries.add(ModItems.AQUAMARINE);
entries.add(ModItems.RAW_AQUAMARINE);
entries.add(ModBlocks.AQUAMARINE_BLOCK);
entries.add(ModBlocks.AQUAMARINE_ORE);


entries.add(ModItems.OVERWORLD_GEM_UPGRADE);
entries.add(ModItems.NETHER_GEM_UPGRADE);
entries.add(ModItems.END_GEM_UPGRADE);

entries.add(ModItems.AURA_KATANA);
entries.add(ModItems.GAY_HELMET);
entries.add(ModItems.GAY_CHESTPLATE);
entries.add(ModItems.GAY_LEGGINGS);
entries.add(ModItems.GAY_BOOTS);


                    }).build());
    public static void registerItemGroups()
    {
        Gems.LOGGER.info("Registering Item Groups for"+ Gems.MOD_ID);
    }}
