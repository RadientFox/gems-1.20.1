package net.radient.gems.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.radient.gems.Gems;

public class ModTags {
    public static class Blocks{

        private static TagKey<Block> createTag(String name ){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Gems.MOD_ID,name));
        }
    }
    public static class Items{

        public static final TagKey<Item> GEMSTONES =
                createTag("gemstones");

        private static TagKey<Item> createTag(String name ){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Gems.MOD_ID,name));
        }

    }
}
