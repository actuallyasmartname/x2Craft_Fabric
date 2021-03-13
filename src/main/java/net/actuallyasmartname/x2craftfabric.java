package net.actuallyasmartname;
import net.actuallyasmartname.x2Craft_Fabric.block.HardenedObsidian;
import net.actuallyasmartname.x2Craft_Fabric.item.AxeBase;
import net.actuallyasmartname.x2Craft_Fabric.item.PickaxeBase;
import net.actuallyasmartname.x2Craft_Fabric.item.ToolMaterialHardenedObsidian;
import net.actuallyasmartname.x2Craft_Fabric.item.items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class x2craftfabric implements ModInitializer {
    public static final Block HARDENED_OBSIDIAN = new HardenedObsidian();
    public static final String MODID = "x2craft";
 @Override
 public void onInitialize() {
    items.RegisterItems();
     Registry.register(Registry.BLOCK, new Identifier(MODID, "hardened_obsidian"), HARDENED_OBSIDIAN);
     Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian"), new BlockItem(HARDENED_OBSIDIAN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
     Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_pickaxe"), new PickaxeBase(new ToolMaterialHardenedObsidian()));
     Registry.register(Registry.ITEM, new Identifier(MODID, "hardened_obsidian_axe"), new AxeBase(new ToolMaterialHardenedObsidian()));
 }  
}