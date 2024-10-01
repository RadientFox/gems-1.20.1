package net.radient.gems.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RubyAxeItem extends AxeItem {

    public RubyAxeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.damageShield(100f);
        target.setOnFireFromLava();
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100,1), attacker);
        return super.postHit(stack, target, attacker);
    }
}
