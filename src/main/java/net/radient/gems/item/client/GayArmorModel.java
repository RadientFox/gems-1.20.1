package net.radient.gems.item.client;

import net.minecraft.util.Identifier;
import net.radient.gems.Gems;
import net.radient.gems.item.custom.GayArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class GayArmorModel extends GeoModel<GayArmorItem> {
    @Override
    public Identifier getModelResource(GayArmorItem animatable) {
        return new Identifier(Gems.MOD_ID, "geo/gayarmor.geo.json");
    }

    @Override
    public Identifier getTextureResource(GayArmorItem animatable) {
        return new Identifier(Gems.MOD_ID, "textures/armor");
    }

    @Override
    public Identifier getAnimationResource(GayArmorItem animatable) {
        return new Identifier(Gems.MOD_ID, "animations/model.animation.json");
    }
}