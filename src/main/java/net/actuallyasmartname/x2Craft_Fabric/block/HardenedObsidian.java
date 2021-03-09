package net.actuallyasmartname.x2Craft_Fabric.block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

public class HardenedObsidian extends Block{

    public HardenedObsidian() {
        super(FabricBlockSettings.of(Material.STONE).requiresTool().breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 3).sounds(BlockSoundGroup.STONE).strength(100.0f, 1200.0f));
    }
    
}