package net.radient.gems.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class HeliotopeAxetem extends AxeItem {

    public HeliotopeAxetem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER,100,1),attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,200,1),attacker);
        return super.postHit(stack, target, attacker);
    }
}
