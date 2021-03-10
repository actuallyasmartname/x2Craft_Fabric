package net.actuallyasmartname.x2Craft_Fabric.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items {
    public static final Item test = new Item(new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final String MODID = "x2craft";

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "test"), test);
        Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_hoe"), new HoeBase(new ToolMaterialHardenedObsidian()));
    }

}
