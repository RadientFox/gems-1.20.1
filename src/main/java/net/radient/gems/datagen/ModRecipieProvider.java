package net.radient.gems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.radient.gems.block.ModBlocks;
import net.radient.gems.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipieProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES =List.of(ModBlocks.RUBY_ORE);

    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES =List.of(ModBlocks.SAPPHIRE_ORE);
    private static final List<ItemConvertible> GALAXIUM_SMELTABLES =List.of(ModBlocks.GALAXIUM_ORE);
    private static final List<ItemConvertible> PIETERSITE_SMELTABLES =List.of(ModBlocks.PIETERSITE_ORE);
    private static final List<ItemConvertible> HELIOTROPE_SMELTABLES =List.of(ModBlocks.HELIOTROPE_ORE);
    private static final List<ItemConvertible> PUMPKIN_SMELTABLES =List.of(ModBlocks.PUMPKIN_DEBRIS);
    private static final List<ItemConvertible> SPINEL_SMELTABLES =List.of(ModBlocks.SPINEL_ORE);
    private static final List<ItemConvertible> MUSHROOM_SMELTABLES =List.of(ModBlocks.MUSHROOM_ORE);
    private static final List<ItemConvertible> GREEN_PAINITE_SMELTABLES =List.of(ModBlocks.GREEN_PANITE_ORE);
    private static final List<ItemConvertible> ASTERISM_SMELTABLES =List.of(ModBlocks.ASTERISM_ORE);
    public ModRecipieProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //RUBY
      offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.COMBAT, ModItems.RUBY_PAW, 1f, 300, "ruby");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY, 1)
                .input(ModItems.RUBY_PAW)
                .input(ModItems.RUBY_PAW)
                .input(ModItems.RUBY_PAW)
                .input(ModItems.RUBY_PAW)
                .input(Items.REDSTONE_BLOCK)
                .input(Items.REDSTONE_BLOCK)
                .input(Items.REDSTONE_BLOCK)
                .input(Items.REDSTONE_BLOCK)
                .input(Items.REDSTONE_BLOCK)
                .criterion(hasItem(Items.REDSTONE_BLOCK),conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(hasItem(ModItems.RUBY_PAW),conditionsFromItem(ModItems.RUBY_PAW))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RUBY_PAW)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.TOOLS,ModItems.RUBY_PICKAXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_PICKAXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.TOOLS,ModItems.RUBY_SCYTHE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_SCYTHE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.TOOLS,ModItems.RUBY_AXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_AXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.TOOLS,ModItems.RUBY_SHOVEL)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_SHOVEL))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.TOOLS,ModItems.RUBY_HOE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_HOE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HELMET),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.COMBAT,ModItems.RUBY_HELMET)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_HELMET))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.COMBAT,ModItems.RUBY_CHESTPLATE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_CHESTPLATE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_LEGGINGS),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.COMBAT,ModItems.RUBY_LEGGINGS)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_LEGGINGS))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NETHER_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_BOOTS),
                        Ingredient.ofItems(ModItems.RUBY),
                RecipeCategory.COMBAT,ModItems.RUBY_BOOTS)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.RUBY_BOOTS))));


        //sapphire


        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE, 1)
                .input(ModItems.RAW_SAPPHIRE)
                .input(ModItems.RAW_SAPPHIRE)
                .input(ModItems.RAW_SAPPHIRE)
                .input(ModItems.RAW_SAPPHIRE)
                .input(Items.BLUE_ICE)
                .input(Items.BLUE_ICE)
                .input(Items.BLUE_ICE)
                .input(Items.BLUE_ICE)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(Items.BLUE_ICE),conditionsFromItem(Items.BLUE_ICE))
                .criterion(hasItem(ModItems.RAW_SAPPHIRE),conditionsFromItem(ModItems.RAW_SAPPHIRE))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_SAPPHIRE)));

        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.COMBAT, ModItems.RAW_SAPPHIRE, 1f, 300, "sapphire");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK);



        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.SAPPHIRE),
                        RecipeCategory.TOOLS,ModItems.SAPPHIRE_PICKAXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.SAPPHIRE_PICKAXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SAPPHIRE),
                        RecipeCategory.TOOLS,ModItems.SAPPHIRE_SWORD)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.SAPPHIRE_SWORD))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.SAPPHIRE),
                        RecipeCategory.TOOLS,ModItems.SAPPHIRE_AXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.SAPPHIRE_AXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.SAPPHIRE),
                        RecipeCategory.TOOLS,ModItems.SAPPHIRE_SHOVEL)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.SAPPHIRE_SHOVEL))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.SAPPHIRE),
                        RecipeCategory.TOOLS,ModItems.SAPPHIRE_HOE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.SAPPHIRE_HOE))));





        //Galaxium

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GALAXIUM, 1)
                .input(ModItems.RAW_GALAXIUM)
                .input(ModItems.RAW_GALAXIUM)
                .input(ModItems.RAW_GALAXIUM)
                .input(ModItems.RAW_GALAXIUM)
                .input(ModBlocks.BLUE_OBSIDIAN)
                .input(ModBlocks.BLUE_OBSIDIAN)
                .input(ModBlocks.BLUE_OBSIDIAN)
                .input(ModBlocks.BLUE_OBSIDIAN)
                .input(ModBlocks.BLUE_OBSIDIAN)
                .criterion(hasItem(ModBlocks.BLUE_OBSIDIAN),conditionsFromItem(ModBlocks.BLUE_OBSIDIAN))
                .criterion(hasItem(ModItems.RAW_GALAXIUM),conditionsFromItem(ModItems.RAW_GALAXIUM))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_GALAXIUM)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_OBSIDIAN)
                .pattern("OOO")
                .pattern("OLO")
                .pattern("OOO")
                .input('O', Items.OBSIDIAN)
                .input('L', Items.LAPIS_BLOCK)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .criterion(hasItem(Items.LAPIS_BLOCK), conditionsFromItem(Items.LAPIS_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_OBSIDIAN)));


        offerBlasting(exporter, GALAXIUM_SMELTABLES, RecipeCategory.COMBAT, ModItems.RAW_GALAXIUM, 1f, 300, "galaxium");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.GALAXIUM, RecipeCategory.MISC, ModBlocks.GALAXIUM_BLOCK);


        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.END_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.GALAXIUM),
                        RecipeCategory.TOOLS,ModItems.GALAXIUM_PICKAXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.END_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.GALAXIUM_PICKAXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.END_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.GALAXIUM),
                        RecipeCategory.TOOLS,ModItems.GALAXIUM_SWORD)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.END_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.GALAXIUM_SWORD))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.END_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.GALAXIUM),
                        RecipeCategory.TOOLS,ModItems.GALAXIUM_AXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.END_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.GALAXIUM_AXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.END_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.GALAXIUM),
                        RecipeCategory.TOOLS,ModItems.GALAXIUM_SHOVEL)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.END_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.GALAXIUM_SHOVEL))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.END_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.GALAXIUM),
                        RecipeCategory.TOOLS,ModItems.GALAXIUM_HOE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.END_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.GALAXIUM_HOE))));



        //pietersite

        offerBlasting(exporter, PIETERSITE_SMELTABLES, RecipeCategory.COMBAT, ModItems.RAW_PIETERSITE, 1f, 300, "pietersite");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.PIETERSITE, RecipeCategory.MISC, ModBlocks.PIETERSITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PIETERSITE, 1)
                .input(ModItems.RAW_PIETERSITE)
                .input(ModItems.RAW_PIETERSITE)
                .input(ModItems.RAW_PIETERSITE)
                .input(ModItems.RAW_PIETERSITE)
                .input(Items.GOLD_BLOCK)
                .input(Items.GOLD_BLOCK)
                .input(Items.GOLD_BLOCK)
                .input(Items.GOLD_BLOCK)
                .input(Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK),conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(ModItems.RAW_PIETERSITE),conditionsFromItem(ModItems.RAW_PIETERSITE))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_PIETERSITE)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.PIETERSITE),
                        RecipeCategory.TOOLS,ModItems.PIETERSITE_PICKAXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PIETERSITE_PICKAXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.PIETERSITE),
                        RecipeCategory.TOOLS,ModItems.PIETERSITE_SWORD)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PIETERSITE_SWORD))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.PIETERSITE),
                        RecipeCategory.TOOLS,ModItems.PIETERSITE_AXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PIETERSITE_AXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.PIETERSITE),
                        RecipeCategory.TOOLS,ModItems.PIETERSITE_SHOVEL)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PIETERSITE_SHOVEL))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.PIETERSITE),
                        RecipeCategory.TOOLS,ModItems.PIETERSITE_HOE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PIETERSITE_HOE))));




        //heliotrope

        offerBlasting(exporter, HELIOTROPE_SMELTABLES, RecipeCategory.COMBAT, ModItems.RAW_HELIOTRPE, 1f, 300, "heliotrope");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.HELIOTROPE, RecipeCategory.MISC, ModBlocks.HELIOTROPE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.HELIOTROPE, 1)
                .input(ModItems.RAW_HELIOTRPE)
                .input(ModItems.RAW_HELIOTRPE)
                .input(ModItems.RAW_HELIOTRPE)
                .input(ModItems.RAW_HELIOTRPE)
                .input(Items.COPPER_BLOCK)
                .input(Items.COPPER_BLOCK)
                .input(Items.COPPER_BLOCK)
                .input(Items.COPPER_BLOCK)
                .input(Items.COPPER_BLOCK)
                .criterion(hasItem(Items.COPPER_BLOCK),conditionsFromItem(Items.COPPER_BLOCK))
                .criterion(hasItem(ModItems.RAW_HELIOTRPE),conditionsFromItem(ModItems.RAW_HELIOTRPE))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_HELIOTRPE)));


        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.HELIOTROPE),
                        RecipeCategory.TOOLS,ModItems.HELIOTROPE_PICKAXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.HELIOTROPE_PICKAXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.HELIOTROPE),
                        RecipeCategory.TOOLS,ModItems.BLOODSTONE_CLAYMORE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.BLOODSTONE_CLAYMORE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.HELIOTROPE),
                        RecipeCategory.TOOLS,ModItems.HELIOTROPE_AXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.HELIOTROPE_AXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.HELIOTROPE),
                        RecipeCategory.TOOLS,ModItems.HELIOTROPE_SHOVEL)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.HELIOTROPE_SHOVEL))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.HELIOTROPE),
                        RecipeCategory.TOOLS,ModItems.HELIOTROPE_HOE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.HELIOTROPE_HOE))));


        //pumpkin

        offerBlasting(exporter, PUMPKIN_SMELTABLES, RecipeCategory.COMBAT, ModItems.PUMPKIN_BERRIES, 1f, 300, "pumpkin");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.PUMPKIN_GEM, RecipeCategory.MISC, ModBlocks.PUMPKIN_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PUMPKIN_GEM, 1)
                .input(ModItems.PUMPKIN_BERRIES)
                .input(ModItems.PUMPKIN_BERRIES)
                .input(ModItems.PUMPKIN_BERRIES)
                .input(ModItems.PUMPKIN_BERRIES)
                .input(Items.PUMPKIN)
                .input(Items.PUMPKIN)
                .input(Items.CARVED_PUMPKIN)
                .input(Items.MOSS_BLOCK)
                .input(Items.MOSS_BLOCK)
                .criterion(hasItem(Items.MOSS_BLOCK),conditionsFromItem(Items.MOSS_BLOCK))
                .criterion(hasItem(Items.PUMPKIN),conditionsFromItem(Items.PUMPKIN))
                .criterion(hasItem(Items.CARVED_PUMPKIN),conditionsFromItem(Items.CARVED_PUMPKIN))
                .criterion(hasItem(ModItems.PUMPKIN_BERRIES),conditionsFromItem(ModItems.PUMPKIN_BERRIES))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.PUMPKIN_BERRIES)));



        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.PUMPKIN_GEM),
                        RecipeCategory.TOOLS,ModItems.PUMPKIN_PICKAXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PUMPKIN_PICKAXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.PUMPKIN_GEM),
                        RecipeCategory.TOOLS,ModItems.PUMPKIN_SWORD)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PUMPKIN_SWORD))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.PUMPKIN_GEM),
                        RecipeCategory.TOOLS,ModItems.PUMPKIN_AXE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PUMPKIN_AXE))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.PUMPKIN_GEM),
                        RecipeCategory.TOOLS,ModItems.PUMPKIN_SHOVEL)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PUMPKIN_SHOVEL))));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.PUMPKIN_GEM),
                        RecipeCategory.TOOLS,ModItems.PUMPKIN_HOE)
                .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter,new Identifier(getRecipeName((ModItems.PUMPKIN_HOE))));



        //spinel

        offerBlasting(exporter, SPINEL_SMELTABLES, RecipeCategory.COMBAT, ModItems.RAW_SPINEL, 1f, 300, "spinel");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.SPINEL, RecipeCategory.MISC, ModBlocks.SPINEL_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL, 1)
                .input(ModItems.RAW_SPINEL)
                .input(ModItems.RAW_SPINEL)
                .input(ModItems.RAW_SPINEL)
                .input(ModItems.RAW_SPINEL)
                .input(Items.IRON_BLOCK)
                .input(Items.IRON_BLOCK)
                .input(Items.ANVIL)
                .input(Items.GOLD_BLOCK)
                .input(Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK),conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.IRON_BLOCK),conditionsFromItem(Items.IRON_BLOCK))
                .criterion(hasItem(Items.ANVIL),conditionsFromItem(Items.ANVIL))
                .criterion(hasItem(ModItems.RAW_SPINEL),conditionsFromItem(ModItems.RAW_SPINEL))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_SPINEL)));



      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                      Ingredient.ofItems(ModItems.SPINEL),
                      RecipeCategory.TOOLS,ModItems.SPINEL_DRILL)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.SPINEL_DRILL))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                      Ingredient.ofItems(ModItems.SPINEL),
                      RecipeCategory.TOOLS,ModItems.SPINEL_SCYTHE)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.SPINEL_SCYTHE))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                      Ingredient.ofItems(ModItems.SPINEL),
                      RecipeCategory.TOOLS,ModItems.SPINEL_AXE)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.SPINEL_AXE))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                      Ingredient.ofItems(ModItems.SPINEL),
                      RecipeCategory.TOOLS,ModItems.SPINEL_SHOVEL)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.SPINEL_SHOVEL))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                      Ingredient.ofItems(ModItems.SPINEL),
                      RecipeCategory.TOOLS,ModItems.SPINEL_HOE)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.SPINEL_HOE))));



      //Mushroom

        offerBlasting(exporter, MUSHROOM_SMELTABLES, RecipeCategory.COMBAT, ModItems.RAW_MUSHROOM, 1f, 300, "mushroom_gem");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.MUSHROOM_GEM, RecipeCategory.MISC, ModBlocks.MUSHROOM_GEM_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MUSHROOM_GEM, 1)
                .input(ModItems.RAW_MUSHROOM)
                .input(ModItems.RAW_MUSHROOM)
                .input(ModItems.RAW_MUSHROOM)
                .input(ModItems.RAW_MUSHROOM)
                .input(Items.RED_MUSHROOM_BLOCK)
                .input(Items.RED_MUSHROOM_BLOCK)
                .input(Items.BROWN_MUSHROOM_BLOCK)
                .input(Items.BROWN_MUSHROOM_BLOCK)
                .criterion(hasItem(Items.BROWN_MUSHROOM_BLOCK),conditionsFromItem(Items.BROWN_MUSHROOM_BLOCK))
                .criterion(hasItem(Items.RED_MUSHROOM_BLOCK),conditionsFromItem(Items.RED_MUSHROOM_BLOCK))
                .criterion(hasItem(ModItems.RAW_MUSHROOM),conditionsFromItem(ModItems.RAW_MUSHROOM))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_MUSHROOM)));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                      Ingredient.ofItems(ModItems.MUSHROOM_GEM),
                      RecipeCategory.TOOLS,ModItems.MUSHROOM_PICKAXE)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.MUSHROOM_PICKAXE))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SWORD),
                      Ingredient.ofItems(ModItems.MUSHROOM_GEM),
                      RecipeCategory.TOOLS,ModItems.MUSHROOM_SWORD)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.MUSHROOM_SWORD))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_AXE),
                      Ingredient.ofItems(ModItems.MUSHROOM_GEM),
                      RecipeCategory.TOOLS,ModItems.MUSHROOM_AXE)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.MUSHROOM_AXE))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                      Ingredient.ofItems(ModItems.MUSHROOM_GEM),
                      RecipeCategory.TOOLS,ModItems.MUSHROOM_SHOVEL)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.MUSHROOM_SHOVEL))));

      SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.OVERWORLD_GEM_UPGRADE),Ingredient.ofItems(Items.NETHERITE_HOE),
                      Ingredient.ofItems(ModItems.MUSHROOM_GEM),
                      RecipeCategory.TOOLS,ModItems.MUSHROOM_HOE)
              .criterion("has_upgrade_template",conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
              .offerTo(exporter,new Identifier(getRecipeName((ModItems.MUSHROOM_HOE))));

      

      //Green Painite

        offerBlasting(exporter, GREEN_PAINITE_SMELTABLES, RecipeCategory.COMBAT, ModItems.RAW_GREEN_PAINITE, 1f, 300, "green_painite");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.GREEN_PAINITE, RecipeCategory.MISC, ModBlocks.GREEN_PAINITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GREEN_PAINITE, 1)
                .input(ModItems.RAW_GREEN_PAINITE)
                .input(ModItems.RAW_GREEN_PAINITE)
                .input(ModItems.RAW_GREEN_PAINITE)
                .input(ModItems.RAW_GREEN_PAINITE)
                .input(Items.EMERALD_BLOCK)
                .input(Items.EMERALD_BLOCK)
                .input(Items.SLIME_BLOCK)
                .input(Items.SLIME_BLOCK)
                .criterion(hasItem(Items.SLIME_BLOCK),conditionsFromItem(Items.SLIME_BLOCK))
                .criterion(hasItem(Items.EMERALD_BLOCK),conditionsFromItem(Items.EMERALD_BLOCK))
                .criterion(hasItem(ModItems.RAW_GREEN_PAINITE),conditionsFromItem(ModItems.RAW_GREEN_PAINITE))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_GREEN_PAINITE)));


        //Asterism

        offerBlasting(exporter, ASTERISM_SMELTABLES, RecipeCategory.COMBAT, ModItems.UNBONDED_ASTRISM, 1f, 300, "asterism");

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.ASTERISM, RecipeCategory.MISC, ModBlocks.ASTERISM_BLOCK);




        //templates
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OVERWORLD_GEM_UPGRADE, 2)
                .pattern("NUN")
                .pattern("NMN")
                .pattern("NNN")
                .input('N', Items.NETHERITE_SCRAP)
                .input('U', ModItems.OVERWORLD_GEM_UPGRADE)
                .input('M', Items.MOSSY_STONE_BRICKS)
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.MOSSY_STONE_BRICKS), conditionsFromItem(Items.MOSSY_STONE_BRICKS))
                .criterion(hasItem(ModItems.OVERWORLD_GEM_UPGRADE), conditionsFromItem(ModItems.OVERWORLD_GEM_UPGRADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OVERWORLD_GEM_UPGRADE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHER_GEM_UPGRADE, 2)
                .pattern("NUN")
                .pattern("NMN")
                .pattern("NNN")
                .input('N', Items.NETHERITE_SCRAP)
                .input('U', ModItems.NETHER_GEM_UPGRADE)
                .input('M', Items.RED_NETHER_BRICKS)
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.RED_NETHER_BRICKS), conditionsFromItem(Items.RED_NETHER_BRICKS))
                .criterion(hasItem(ModItems.NETHER_GEM_UPGRADE), conditionsFromItem(ModItems.NETHER_GEM_UPGRADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHER_GEM_UPGRADE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.END_GEM_UPGRADE, 2)
                .pattern("NUN")
                .pattern("NMN")
                .pattern("NNN")
                .input('N', Items.NETHERITE_SCRAP)
                .input('U', ModItems.END_GEM_UPGRADE)
                .input('M', Items.PURPUR_BLOCK)
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.PURPUR_BLOCK), conditionsFromItem(Items.PURPUR_BLOCK))
                .criterion(hasItem(ModItems.END_GEM_UPGRADE), conditionsFromItem(ModItems.END_GEM_UPGRADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.END_GEM_UPGRADE)));


    }
}
