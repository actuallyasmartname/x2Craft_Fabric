package net.actuallyasmartname.x2Craft_Fabric.block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
public class blocks {
    public static final String MODID = "x2craft";
    public static final FabricBlockSettings TERRACOTTASETTINGS = new Block(FabricBlockSettings.of(Material.STONE).breakByHand(false).resistance(4.2f).hardness(1.25f).sounds(BlockSoundGroup.STONE).requiresTool());
    //stairs

    //slabs
    public static final SlabBlock TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock WHITE_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock ORANGE_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock MAGENTA_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock LIGHT_BLUE_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock YELLOW_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock LIME_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock PINK_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock GRAY_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock LIGHT_GRAY_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock CYAN_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock PURPLE_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock BLUE_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock BROWN_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock GREEN_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock RED_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock BLACK_TERRACOTTA_SLAB = new SlabBlock(TERRACOTTASETTINGS);
    public static final SlabBlock OBSIDIAN_SLAB = new SlabBlock(FabricBlockSettings.of(Material.EMERALD).breakByHand(false).hardness(50.0f).resistance(1200f).sounds(BlockSoundGroup.STONE).requiresTool());
    //misc
    public static final Block HARDENED_OBSIDIAN = new Block(FabricBlockSettings.of(Material.EMERALD).breakByHand(false).sounds(BlockSoundGroup.STONE).strength(100.0f, 1200.0f).requiresTool());
    public static final StairsBlock DIAMOND_STAIRS = new stairsblockpublic(Blocks.DIAMOND_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static void RegisterBlocks() {
        //stairs
        Registry.register(Registry.BLOCK, new Identifier(MODID, "diamond_stairs"), DIAMOND_STAIRS);
        //slabs
        Registry.register(Registry.BLOCK, new Identifier(MODID, "terracotta_slab"), TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "white_terracotta_slab"), WHITE_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "orange_terracotta_slab"), ORANGE_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "magenta_terracotta_slab"), MAGENTA_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "light_blue_terracotta_slab"), LIGHT_BLUE_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "yellow_terracotta_slab"), YELLOW_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_terracotta_slab"), LIME_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "pink_terracotta_slab"), PINK_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "gray_terracotta_slab"), GRAY_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "light_gray_terracotta_slab"), LIGHT_GRAY_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "cyan_terracotta_slab"), CYAN_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_terracotta_slab"), PURPLE_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "blue_terracotta_slab"), BLUE_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "brown_terracotta_slab"), BROWN_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "green_terracotta_slab"), GREEN_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "red_terracotta_slab"), RED_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "black_terracotta_slab"), BLACK_TERRACOTTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "obsidian_slab"), OBSIDIAN_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "hardened_obsidian"), HARDENED_OBSIDIAN);
    }
}
