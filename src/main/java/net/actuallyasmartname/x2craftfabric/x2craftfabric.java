package net.actuallyasmartname.x2craftfabric;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class x2craftfabric implements ModInitializer {
    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC)); 
 @Override
 public void onInitialize() {
     Registry.register(Registry.ITEM, new Identifier("x2craft", "fabric_item"), FABRIC_ITEM);
 }  
}