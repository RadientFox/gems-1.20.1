package net.radient.gems.item.client;

import net.radient.gems.item.custom.GayArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GayArmorRenderer extends GeoArmorRenderer<GayArmorItem> {
    public GayArmorRenderer() {
        super(new GayArmorModel());
    }
}
