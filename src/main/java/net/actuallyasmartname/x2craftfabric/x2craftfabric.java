package net.actuallyasmartname.x2craftfabric;
import net.actuallyasmartname.x2Craft_Fabric.block.HardenedObsidian;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class x2craftfabric implements ModInitializer {
    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC)); 
    public static final Block HARDENED_OBSIDIAN = new HardenedObsidian();
 @Override
 public void onInitialize() {
     Registry.register(Registry.ITEM, new Identifier("x2craft", "fabric_item"), FABRIC_ITEM);
     Registry.register(Registry.BLOCK, new Identifier("x2craft", "hardened_obsidian"), HARDENED_OBSIDIAN);
     Registry.register(Registry.ITEM, new Identifier("x2craft", "hardened_obsidian"), new BlockItem(HARDENED_OBSIDIAN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
 }  
}