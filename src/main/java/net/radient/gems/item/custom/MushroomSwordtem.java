package net.radient.gems.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class MushroomSwordtem extends SwordItem {

    public MushroomSwordtem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON,200,1),attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200,1),attacker);
        return super.postHit(stack, target, attacker);
    }
}