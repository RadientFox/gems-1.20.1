package net.radient.gems.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    RUBY(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.SAPPHIRE)),
    GALAXIUM(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.GALAXIUM)),
    PIETERSITE(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.PIETERSITE)),
    HELIOTROPE(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.HELIOTROPE)),
    PUMPKIN(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.PUMPKIN_GEM)),
    SPINEL(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.SPINEL)),
    MUSHROOM(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.MUSHROOM_GEM)),
    GREEN_PAINITE(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.GREEN_PAINITE)),
    ASTERISM(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.ASTERISM)),
    AQUAMARINE(5,2500,9f,1f,16, ()->Ingredient.ofItems(ModItems.AQUAMARINE));




    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
