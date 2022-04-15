package net.actuallyasmartname.x2Craft_Fabric.item;
import net.actuallyasmartname.x2Craft_Fabric.armor.HardenedObsidianArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.actuallyasmartname.x2Craft_Fabric.block.blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.actuallyasmartname.x2Craft_Fabric.item.toolbase.*;
import net.actuallyasmartname.x2Craft_Fabric.item.toolmaterials.*;

public class items {
    public static final String MODID = "x2craft";
    public static final ArmorMaterial HARDENED_ARMOR_MATERIAL = new HardenedObsidianArmor();
    public static final Item GREEN_NETHER_WART = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_WOLF_MEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).meat().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*5), 0.25f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*10), 1f).build()));
    public static final Item COOKED_WOLF_MEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(3.5f).meat().build()));
    public static final Item GOLDEN_BEETROOT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build()));

    public static final Item HARDENED_OBSIDIAN_HELMET = new ArmorItem(HARDENED_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item HARDENED_OBSIDIAN_CHESTPLATE = new ArmorItem(HARDENED_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item HARDENED_OBSIDIAN_LEGGINGS = new ArmorItem(HARDENED_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item HARDENED_OBSIDIAN_BOOTS = new ArmorItem(HARDENED_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static void RegisterItems() {
        //stairs
        Registry.register(Registry.ITEM, new Identifier(MODID, "diamond_stairs"), new BlockItem(blocks.DIAMOND_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //tools
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_hoe"), new HoeBase(new ToolMaterialHardenedObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_shovel"), new ShovelBase(new ToolMaterialHardenedObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_pickaxe"), new PickaxeBase(new ToolMaterialHardenedObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_axe"), new AxeBase(new ToolMaterialHardenedObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_sword"), new HardenedObsidianSwordBase(new ToolMaterialHardenedObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "lapis_pickaxe"), new PickaxeBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "lapis_axe"), new AxeBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "lapis_shovel"), new ShovelBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "lapis_hoe"), new HoeBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "lapis_sword"), new LapisSwordBase(new ToolMaterialLapis()));
        //armor
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_helmet"), HARDENED_OBSIDIAN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_chestplate"), HARDENED_OBSIDIAN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_leggings"), HARDENED_OBSIDIAN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_boots"), HARDENED_OBSIDIAN_BOOTS);
        //food
        Registry.register(Registry.ITEM, new Identifier(MODID, "raw_wolf_meat"), RAW_WOLF_MEAT);
        Registry.register(Registry.ITEM, new Identifier(MODID, "cooked_wolf_meat"), COOKED_WOLF_MEAT);
        Registry.register(Registry.ITEM, new Identifier(MODID, "golden_beetroot"), GOLDEN_BEETROOT);
        //slabs
        Registry.register(Registry.ITEM, new Identifier(MODID, "obsidian_slab"), new BlockItem(blocks.OBSIDIAN_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //terracotta slabs
        Registry.register(Registry.ITEM, new Identifier(MODID, "terracotta_slab"), new BlockItem(blocks.TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "white_terracotta_slab"), new BlockItem(blocks.WHITE_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "orange_terracotta_slab"), new BlockItem(blocks.ORANGE_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "magenta_terracotta_slab"), new BlockItem(blocks.MAGENTA_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "light_blue_terracotta_slab"), new BlockItem(blocks.LIGHT_BLUE_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "yellow_terracotta_slab"), new BlockItem(blocks.YELLOW_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "lime_terracotta_slab"), new BlockItem(blocks.LIME_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "pink_terracotta_slab"), new BlockItem(blocks.PINK_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "gray_terracotta_slab"), new BlockItem(blocks.GRAY_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "light_gray_terracotta_slab"), new BlockItem(blocks.LIGHT_GRAY_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "cyan_terracotta_slab"), new BlockItem(blocks.CYAN_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_terracotta_slab"), new BlockItem(blocks.PURPLE_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "blue_terracotta_slab"), new BlockItem(blocks.BLUE_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "brown_terracotta_slab"), new BlockItem(blocks.BROWN_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "green_terracotta_slab"), new BlockItem(blocks.GREEN_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "red_terracotta_slab"), new BlockItem(blocks.RED_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "black_terracotta_slab"), new BlockItem(blocks.BLACK_TERRACOTTA_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //misc
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian"), new BlockItem(blocks.HARDENED_OBSIDIAN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "green_nether_wart"), GREEN_NETHER_WART);
    }

}
