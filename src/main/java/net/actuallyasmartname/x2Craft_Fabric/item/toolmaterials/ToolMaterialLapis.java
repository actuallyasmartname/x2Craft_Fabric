package net.actuallyasmartname.x2Craft_Fabric.item.toolmaterials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialLapis implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        return 4.0f;
    }

    @Override
    public int getDurability() {
        return 1028;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.75f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.LAPIS_LAZULI);
    }
    
}
