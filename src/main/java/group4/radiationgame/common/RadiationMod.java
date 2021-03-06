package group4.radiationgame.common;

import group4.radiationgame.block.SourceRadiationBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RadiationMod.MODID, version = RadiationMod.VERSION)
public class RadiationMod
{
    public static final String MODID = "RadiationMod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event){
    	
    	//WorldType RadiationWorld = new WorldType("Radiation World");
    	
    	RadiationWorld world = new RadiationWorld();
    	//create a new SourceRadiationBlock instance, then set its properties
    	Block SourceRadiationBlock = new SourceRadiationBlock(Material.ground)
		.setBlockName("SourceRadiationBlock")
		.setHardness(0.5F)
		.setStepSound(Block.soundTypeMetal)
		.setCreativeTab(CreativeTabs.tabBlock)
		
		//Texture picture for the block is not showing correctly now.
		.setBlockTextureName("radiationgame:SourceRadiationBlock");
	
	//register the new block to the game.
	GameRegistry.registerBlock(SourceRadiationBlock, "SourceRadiationBlock");
    	
    	

    	
    }
}