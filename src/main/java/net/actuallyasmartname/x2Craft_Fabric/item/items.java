package net.actuallyasmartname.x2Craft_Fabric.item;
import net.actuallyasmartname.x2Craft_Fabric.armor.HardenedObsidianArmor;
import net.actuallyasmartname.x2Craft_Fabric.armor.BaseArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items {
    public static final String MODID = "x2craft";
    public static final ArmorMaterial HARDENED_ARMOR_MATERIAL = new HardenedObsidianArmor();
    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_hoe"), new HoeBase(new ToolMaterialHardenedObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_shovel"), new ShovelBase(new ToolMaterialHardenedObsidian()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_helmet"), new BaseArmor(HARDENED_ARMOR_MATERIAL, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_chestplate"), new BaseArmor(HARDENED_ARMOR_MATERIAL, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_leggings"), new BaseArmor(HARDENED_ARMOR_MATERIAL, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_boots"), new BaseArmor(HARDENED_ARMOR_MATERIAL, EquipmentSlot.FEET));
    }

}
