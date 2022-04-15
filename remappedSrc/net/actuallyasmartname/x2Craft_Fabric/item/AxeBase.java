package net.actuallyasmartname.x2Craft_Fabric.item;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem{

    public AxeBase(ToolMaterial material) {
        super(material, 3, -3, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}