package net.actuallyasmartname.x2Craft_Fabric.item;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem{

    public ShovelBase(ToolMaterial material) {
        super(material, -4, -3, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}