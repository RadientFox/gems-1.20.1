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
  public static  final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE,
          new FabricItemSettings()));
  public static  final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS,
          new FabricItemSettings()));
  public static  final Item RUBY_BOOTS = registerItem("ruby_boots", new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS,
          new FabricItemSettings()));



//sapphire
    public static final Item SAPPHIRE = registerItem("sapphire",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SapphireSwordtem(ModToolMaterial.SAPPHIRE, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterial.SAPPHIRE, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new SapphireAxetem(ModToolMaterial.SAPPHIRE, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new HoeItem(ModToolMaterial.SAPPHIRE, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 2,-3.0F,
            new FabricItemSettings()));


    //Galaxium

    public static final Item GALAXIUM = registerItem("galaxium",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_GALAXIUM = registerItem("raw_galaxium",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item GALAXIUM_SWORD = registerItem("galaxium_sword", new GalaxiumSwordtem(ModToolMaterial.GALAXIUM, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item GALAXIUM_PICKAXE = registerItem("galaxium_pickaxe", new PickaxeItem(ModToolMaterial.GALAXIUM, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item GALAXIUM_AXE = registerItem("galaxium_axe", new GalaxiumAxetem(ModToolMaterial.GALAXIUM, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item GALAXIUM_HOE = registerItem("galaxium_hoe", new HoeItem(ModToolMaterial.GALAXIUM, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item GALAXIUM_SHOVEL = registerItem("galaxium_shovel", new ShovelItem(ModToolMaterial.GALAXIUM, 2,-3.0F,
            new FabricItemSettings()));


//Pietersite

    public static final Item PIETERSITE = registerItem("pietersite",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_PIETERSITE = registerItem("raw_pietersite",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item PIETERSITE_SWORD = registerItem("pietersite_coral_blade", new SwordItem(ModToolMaterial.PIETERSITE, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item PIETERSITE_PICKAXE = registerItem("pietersite_pickaxe", new PickaxeItem(ModToolMaterial.PIETERSITE, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item PIETERSITE_AXE = registerItem("pietersite_axe", new AxeItem(ModToolMaterial.PIETERSITE, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item PIETERSITE_HOE = registerItem("pietersite_hoe", new HoeItem(ModToolMaterial.PIETERSITE, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item PIETERSITE_SHOVEL = registerItem("pietersite_shovel", new ShovelItem(ModToolMaterial.PIETERSITE, 2,-3.0F,
            new FabricItemSettings()));


    //Heliotrope
public static final Item HELIOTROPE = registerItem("heliotrope",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
public static final Item RAW_HELIOTRPE = registerItem("raw_heliotrope",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item BLOODSTONE_CLAYMORE = registerItem("bloodstone_claymore", new HeliotropeSwordtem(ModToolMaterial.HELIOTROPE, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item HELIOTROPE_PICKAXE = registerItem("heliotrope_pickaxe", new PickaxeItem(ModToolMaterial.HELIOTROPE, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item HELIOTROPE_AXE = registerItem("heliotrope_axe", new HeliotopeAxetem(ModToolMaterial.HELIOTROPE, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item HELIOTROPE_HOE = registerItem("heliotrope_hoe", new HoeItem(ModToolMaterial.HELIOTROPE, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item HELIOTROPE_SHOVEL = registerItem("heliotrope_shovel", new ShovelItem(ModToolMaterial.HELIOTROPE, 2,-3.0F,
            new FabricItemSettings()));



//pumpkin
public static final Item PUMPKIN_GEM = registerItem("pumpkin_gem",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
public static final Item PUMPKIN_BERRIES = registerItem("pumpkin_berries",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));


    public static  final Item PUMPKIN_SWORD = registerItem("pumpkin_sword", new SwordItem(ModToolMaterial.PUMPKIN, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item PUMPKIN_PICKAXE = registerItem("pumpkin_pickaxe", new PickaxeItem(ModToolMaterial.PUMPKIN, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item PUMPKIN_AXE = registerItem("pumpkin_axe", new AxeItem(ModToolMaterial.PUMPKIN, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item PUMPKIN_HOE = registerItem("pumpkin_hoe", new HoeItem(ModToolMaterial.PUMPKIN, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item PUMPKIN_SHOVEL = registerItem("pumpkin_shovel", new ShovelItem(ModToolMaterial.PUMPKIN, 2,-3.0F,
            new FabricItemSettings()));


    //Spinel
    public static final Item SPINEL = registerItem("spinel",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_SPINEL = registerItem("raw_spinel",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item SPINEL_SCYTHE = registerItem("spinel_scythe", new SwordItem(ModToolMaterial.SPINEL, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item SPINEL_DRILL = registerItem("spinel_drill", new SpinelDrillItem(ModToolMaterial.SPINEL, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item SPINEL_AXE = registerItem("spinel_heavy_axe", new AxeItem(ModToolMaterial.SPINEL, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item SPINEL_HOE = registerItem("spinel_hoe", new HoeItem(ModToolMaterial.SPINEL, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item SPINEL_SHOVEL = registerItem("spinel_shovel", new ShovelItem(ModToolMaterial.SPINEL, 2,-3.0F,
            new FabricItemSettings()));


//Mushroom Gem

    public static final Item MUSHROOM_GEM = registerItem("mushroom_gem",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_MUSHROOM = registerItem("raw_mushroom",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item MUSHROOM_SWORD = registerItem("mushroom_sword", new MushroomSwordtem(ModToolMaterial.MUSHROOM, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item MUSHROOM_PICKAXE = registerItem("mushroom_pickaxe", new PickaxeItem(ModToolMaterial.MUSHROOM, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item MUSHROOM_AXE = registerItem("mushroom_axe", new MushroomAxetem(ModToolMaterial.MUSHROOM, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item MUSHROOM_HOE = registerItem("mushroom_hoe", new HoeItem(ModToolMaterial.MUSHROOM, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item MUSHROOM_SHOVEL = registerItem("mushroom_shovel", new ShovelItem(ModToolMaterial.MUSHROOM, 2,-3.0F,
            new FabricItemSettings()));

//Green Painite

    public static final Item GREEN_PAINITE = registerItem("green_painite",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_GREEN_PAINITE = registerItem("raw_green_painite",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item GREEN_PAINITE_SWORD = registerItem("green_painite_sword", new MushroomSwordtem(ModToolMaterial.GREEN_PAINITE, 9,-2.4F,
            new FabricItemSettings()));
    public static  final Item GREEN_PAINITE_PICKAXE = registerItem("green_painite_pickaxe", new PickaxeItem(ModToolMaterial.GREEN_PAINITE, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item GREEN_PAINITE_AXE = registerItem("green_painite_axe", new MushroomAxetem(ModToolMaterial.GREEN_PAINITE, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item GREEN_PAINITE_HOE = registerItem("green_painite_hoe", new HoeItem(ModToolMaterial.GREEN_PAINITE, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item GREEN_PAINITE_SHOVEL = registerItem("green_painite_shovel", new ShovelItem(ModToolMaterial.GREEN_PAINITE, 2,-3.0F,
            new FabricItemSettings()));

public static final Item GREEN_DISK =registerItem("green_panite_disk", new BowItem(new FabricItemSettings()));

//Asterism

    public static final Item ASTERISM = registerItem("asterism",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item UNBONDED_ASTRISM = registerItem("unbonded_asterism",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));

    public static  final Item ASTERISM_PICKAXE = registerItem("asterism_pickaxe", new PickaxeItem(ModToolMaterial.ASTERISM, 5,-2.8F,
            new FabricItemSettings()));
    public static  final Item ASTERISM_AXE = registerItem("asterism_axe", new MushroomAxetem(ModToolMaterial.ASTERISM, 11,-3.0F,
            new FabricItemSettings()));
    public static  final Item ASTERISM_HOE = registerItem("asterism_hoe", new HoeItem(ModToolMaterial.ASTERISM, -1,0.0f,
            new FabricItemSettings()));
    public static  final Item ASTERISM_SHOVEL = registerItem("asterism_shovel", new ShovelItem(ModToolMaterial.ASTERISM, 2,-3.0F,
            new FabricItemSettings()));

    public static  final Item ASTERISM_T2_SWORD = registerItem("asterism_t2_sword", new AsterismSwordT2Item(ModToolMaterial.ASTERISM, 9,-2.4F,
            new FabricItemSettings()));

    public static  final Item ASTERISM_T1_SWORD = registerItem("asterism_t1_sword", new SwordItem(ModToolMaterial.ASTERISM, 9,-2.4F,
            new FabricItemSettings()));

    public static  final Item ASTERISM_T3_SWORD = registerItem("asterism_t3_sword", new AsterismSwordT3Item(ModToolMaterial.ASTERISM, 9,-2.4F,
            new FabricItemSettings()));

    public static final Item STAR_OF_WILLPOWER = registerItem("star_of_willpower",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item STAR_OF_DARKNESS = registerItem("star_of_darkness",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));

    public static final Item AMULET_OF_POWER = registerItem("amulet_of_power",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item AMULET_OF_SPACE = registerItem("amulet_of_space",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item AMULET_OF_TIME = registerItem("amulet_of_time",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item AMULET_OF_HOPE = registerItem("amulet_of_hope",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item AMULET_OF_REALITY = registerItem("amulet_of_reality",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item AMULET_OF_WORLDS = registerItem("amulet_of_worlds",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));

    public static final Item DIVINE_CRYSTAL = registerItem("divine_crystal",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));

    //Aquamarine

    public static final Item AQUAMARINE = registerItem("aquamarine",new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_AQUAMARINE = registerItem("raw_aquamarine",new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));


    //


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
