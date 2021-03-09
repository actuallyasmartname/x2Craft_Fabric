package net.actuallyasmartname.x2Craft_Fabric.item;

import net.actuallyasmartname.x2craftfabric;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialHardenedObsidian implements ToolMaterial {

    @Override
    public int getDurability() {
        
        return 2456;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        
        return 14.0f;
    }

    @Override
    public float getAttackDamage() {
        
        return 6.5f;
    }

    @Override
    public int getMiningLevel() {
        
        return 5;
    }

    @Override
    public int getEnchantability() {
        
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(x2craftfabric.HARDENED_OBSIDIAN);
    }
    
}
