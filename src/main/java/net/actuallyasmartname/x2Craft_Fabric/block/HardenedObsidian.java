package net.actuallyasmartname.x2Craft_Fabric.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

public class HardenedObsidian extends Block{

    public HardenedObsidian() {
        super(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE).hardness(100f));
    }
    
}