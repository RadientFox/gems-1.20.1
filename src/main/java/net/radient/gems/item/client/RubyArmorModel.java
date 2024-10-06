package net.radient.gems.item.client;

import net.minecraft.util.Identifier;
import net.radient.gems.Gems;
import net.radient.gems.item.custom.GayArmorItem;
import net.radient.gems.item.custom.RubyArmorItem;
import net.radient.gems.item.custom.RubyAxeItem;
import software.bernie.geckolib.model.GeoModel;

public class RubyArmorModel extends GeoModel<RubyArmorItem> {
    @Override
    public Identifier getModelResource(RubyArmorItem animatable) {
        return new Identifier(Gems.MOD_ID, "geo/3d_armor_foundation.geo.json");
    }

    @Override
    public Identifier getTextureResource(RubyArmorItem animatable) {
        return new Identifier(Gems.MOD_ID, "textures/armor/ruby_armor.png");

    }

    @Override
    public Identifier getAnimationResource(RubyArmorItem animatable) {
        return new Identifier(Gems.MOD_ID, "animations/ruby_model.animation.json");
    }
}