package net.actuallyasmartname.x2Craft_Fabric.armor;

import net.actuallyasmartname.x2craftfabric;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class HardenedObsidianArmor implements ArmorMaterial{
    private static final int[] BASE_DURABILITY = new int[] {516, 801, 687, 504};
    private static final int[] PROTECTION_AMOUNT = new int[] {4, 8, 5, 3};
    @Override
    public int getDurability(EquipmentSlot arg0) {
        return BASE_DURABILITY[arg0.getEntitySlotId()]*1;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return PROTECTION_AMOUNT[arg0.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 50;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(x2craftfabric.HARDENED_OBSIDIAN);
    }
    @Override
    public String getName() {
        return "hardened_obsidian";
    }
    @Override
    public float getToughness() {
        return 5;
    }
    @Override
    public float getKnockbackResistance() {
        return 2;
    }};
    
