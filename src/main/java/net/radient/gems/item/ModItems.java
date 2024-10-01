package net.radient.gems.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.radient.gems.Gems;
import net.radient.gems.item.custom.*;

public class ModItems {



    //ruby
    public static final Item RUBY = registerItem("ruby",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
  public static final Item RUBY_PAW = registerItem("ruby_paw",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
  public static  final Item RUBY_SCYTHE = registerItem("ruby_scythe", new RubyScytheItem(ModToolMaterial.RUBY, 9,-2.4F,
          new FabricItemSettings()));
  public static  final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 5,-2.8F,
          new FabricItemSettings()));
  public static  final Item RUBY_AXE = registerItem("ruby_double_axe", new RubyAxeItem(ModToolMaterial.RUBY, 11,-3.0F,
          new FabricItemSettings()));
  public static  final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, -1,0.0f,
          new FabricItemSettings()));
  public static  final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 2,-3.0F,
          new FabricItemSettings()));

  public static  final Item RUBY_HELMET = registerItem("ruby_helmet", new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET,
          new FabricItemSettings()));
  public static  final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE,
          new FabricItemSettings()));
  public static  final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS,
          new FabricItemSettings()));
  public static  final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS,
          new FabricItemSettings()));



//sapphire
    public static final Item SAPPHIRE = registerItem("sapphire",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SapphireSwordtem(ModToolMaterial.RUBY, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new SapphireAxetem(ModToolMaterial.RUBY, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new HoeItem(ModToolMaterial.RUBY, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.RUBY, 2,-3.0F,
            new FabricItemSettings()));


    //Galaxium

    public static final Item GALAXIUM = registerItem("galaxium",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_GALAXIUM = registerItem("raw_galaxium",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

//Pietersite

    public static final Item PIETERSITE = registerItem("pietersite",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_PIETERSITE = registerItem("raw_pietersite",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));


//Heliotrope
public static final Item HELIOTROPE = registerItem("heliotrope",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
public static final Item RAW_HELIOTRPE = registerItem("raw_heliotrope",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));


//pumpkin
public static final Item PUMPKIN_GEM = registerItem("pumpkin_gem",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
public static final Item PUMPKIN_BERRIES = registerItem("pumpkin_berries",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));



    //Spinel
    public static final Item SPINEL = registerItem("spinel",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_SPINEL = registerItem("raw_spinel",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));


//Mushroom Gem

    public static final Item MUSHROOM_GEM = registerItem("mushroom_gem",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_MUSHROOM = registerItem("raw_mushroom",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));


//Green Painite

    public static final Item GREEN_PAINITE = registerItem("green_painite",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_GREEN_PAINITE = registerItem("raw_green_painite",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

//Asterism

    public static final Item ASTERISM = registerItem("asterism",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item UNBONDED_ASTRISM = registerItem("unbonded_asterism",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));



    //templates
public static final Item NETHER_GEM_UPGRADE= registerItem("nether_gem_upgrade",new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
public static final Item OVERWORLD_GEM_UPGRADE= registerItem("overworld_gem_upgrade",new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
public static final Item END_GEM_UPGRADE= registerItem("end_gem_upgrade",new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));


//Aura
public static  final Item AURA_KATANA = registerItem("aura_katana", new ExplosionItem(ModToolMaterial.RUBY, 9,-2.4F,
        new FabricItemSettings()));
//Test
public static  final Item GAY_HELMET = registerItem("gay_helmet", new GayArmorItem(ModArmorMaterials.GAY, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
public static  final Item GAY_CHESTPLATE = registerItem("gay_chestplate", new GayArmorItem(ModArmorMaterials.GAY, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
public static  final Item GAY_LEGGINGS = registerItem("gay_leggings", new GayArmorItem(ModArmorMaterials.GAY, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
public static  final Item GAY_BOOTS = registerItem("gay_boots", new GayArmorItem(ModArmorMaterials.GAY, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Gems.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Gems.LOGGER.info("Registering Mod Items for" + Gems.MOD_ID );


    }
}
