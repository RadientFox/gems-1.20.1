package net.radient.gems.item.client;

import net.radient.gems.item.custom.GayArmorItem;
import net.radient.gems.item.custom.RubyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RubyArmorRenderer extends GeoArmorRenderer<RubyArmorItem> {
    public RubyArmorRenderer() {
        super(new RubyArmorModel());
    }
}
