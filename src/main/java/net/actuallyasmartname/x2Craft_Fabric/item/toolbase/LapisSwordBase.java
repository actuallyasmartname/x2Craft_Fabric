package net.actuallyasmartname.x2Craft_Fabric.item.toolbase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class LapisSwordBase extends SwordItem{

    public LapisSwordBase(ToolMaterial material) {
        super(material, 1, 1, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
