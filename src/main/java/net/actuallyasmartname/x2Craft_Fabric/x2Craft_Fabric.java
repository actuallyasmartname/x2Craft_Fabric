package net.actuallyasmartname.x2Craft_Fabric;
import net.minecraft.util.registry.Registry;
import net.actuallyasmartname.x2Craft_Fabric.block.HardenedObsidian;
import net.actuallyasmartname.x2Craft_Fabric.item.PortableJukeboxPigstep;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
public class x2Craft_Fabric implements ModInitializer {
    public static final Item FABRIC_ITEM = new PortableJukeboxPigstep(new Item.Settings().group(ItemGroup.MISC));
    public static final Block HARDENED_OBSIDIAN = new HardenedObsidian();
 @Override
 public void onInitialize() {
     System.out.println("Systems Loading");
     Registry.register(Registry.ITEM, new Identifier("x2craft", "portablejukeboxpigstep"), FABRIC_ITEM);
     Registry.register(Registry.BLOCK, new Identifier("x2craft", "hardened_obsidian"), HARDENED_OBSIDIAN);
     Registry.register(Registry.ITEM, new Identifier("x2craft", "hardened_obsidian"), new BlockItem(HARDENED_OBSIDIAN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
 }  
}