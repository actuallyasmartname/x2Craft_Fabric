package net.actuallyasmartname.x2Craft_Fabric;
import net.minecraft.util.registry.Registry;
import net.fabricmc.api.ModInitializer; 
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
public class x2Craft_Fabric implements ModInitializer {
    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

 @Override
 public void onInitialize() {
     System.out.println("Hello Fabric world!");
     Registry.register(Registry.ITEM, new Identifier("x2craft", "fabric_item"), FABRIC_ITEM);
 }  
}