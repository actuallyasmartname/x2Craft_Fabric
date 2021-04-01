/* @author actuallyasmartname
   @copyright 2021, GNU v2      */
package net.actuallyasmartname;
import net.actuallyasmartname.x2Craft_Fabric.block.blocks;
import net.actuallyasmartname.x2Craft_Fabric.item.items;
import net.actuallyasmartname.x2Craft_Fabric.potion.potionregistry;
import net.fabricmc.api.ModInitializer;

public class x2craftfabric implements ModInitializer {
 @Override
 public void onInitialize() {
    items.RegisterItems();
    blocks.RegisterBlocks();
    potionregistry.initialize();
     }  
}
