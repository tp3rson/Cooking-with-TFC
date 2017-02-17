package straywolfe.cookingwithtfc.api;

import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.bioxx.tfc.api.TFCBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import straywolfe.cookingwithtfc.common.block.*;
import straywolfe.cookingwithtfc.common.item.itemblock.*;

public class CWTFCBlocks 
{
	public static Block nestBoxCWTFC;
	public static Block GrainsBlock;
	public static Block mixingBowl;
	public static Block hopperCWTFC;
	public static Block cookingPot;
	public static Block meatCWTFC;
	public static Block sandwichCWTFC;
	public static Block bowlCWTFC;
	public static Block clayOven;
	public static Block tableStorage;
	
	public static Block prepTableN;
	public static Block prepTable2N;
	public static Block prepTableS;
	public static Block prepTable2S;
	public static Block prepTableE;
	public static Block prepTable2E;
	public static Block prepTableW;
	public static Block prepTable2W;
	
	public static Block customGourd;
	public static Block customCrop;
	
	public static int mixingBowlRenderID;
	public static int prepTableRenderID;
	public static int meatRenderID;
	public static int cookingPotRenderID;
	public static int bowlRenderID;
	public static int clayOvenRenderID;
	public static int sandwichRenderID;
	public static int tableStorageRenderID;
	public static int gourdRenderID;
	public static int gourdCropRenderID;
	public static int customCropRenderID;
	
	public static void initialise()
	{
		loadBlocks();
		
		registerBlocks();
	}
	
	public static void loadBlocks()
	{
		TFCBlocks.nestBox.setCreativeTab(null);
		
		nestBoxCWTFC = new BlockNestBoxCWTFC();
		GrainsBlock = new BlockGrains();
		mixingBowl = new BlockMixBowl();
		hopperCWTFC = new BlockHopperCWTFC();
		cookingPot = new BlockCookingPot();
		meatCWTFC = new BlockMeat();
		sandwichCWTFC = new BlockSandwich();
		bowlCWTFC = new BlockBowl();
		clayOven = new BlockClayOven();
		tableStorage = new BlockTableStorage();
		
		prepTableN = new BlockPrepTable();
		prepTable2N = new BlockPrepTable2();
		prepTableS = new BlockPrepTable();
		prepTable2S = new BlockPrepTable2();
		prepTableE = new BlockPrepTable();
		prepTable2E = new BlockPrepTable2();
		prepTableW = new BlockPrepTable();
		prepTable2W = new BlockPrepTable2();
		
		customGourd = new BlockGourd();
		customCrop = new BlockCrop();
	}
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(nestBoxCWTFC, ItemTerraBlock.class, "NestBox");
		GameRegistry.registerBlock(GrainsBlock, "GrainsBlock");
		GameRegistry.registerBlock(mixingBowl, ItemMixingBowl.class, "MixingBowl");
		GameRegistry.registerBlock(hopperCWTFC, "Hopper");
		GameRegistry.registerBlock(cookingPot, "CookingPot");
		GameRegistry.registerBlock(meatCWTFC, "meatCWTFC");
		GameRegistry.registerBlock(sandwichCWTFC, "sandwichCWTFC");
		GameRegistry.registerBlock(bowlCWTFC, "bowlCWTFC");
		GameRegistry.registerBlock(clayOven, "clayOven");
		GameRegistry.registerBlock(tableStorage, "tableStorage");
		GameRegistry.registerBlock(customGourd, "customGourd");
		GameRegistry.registerBlock(customCrop, "customCrop");
		
		GameRegistry.registerBlock(prepTableN, ItemPrepTable.class, "PrepTableN");
		GameRegistry.registerBlock(prepTable2N, ItemPrepTable2.class, "PrepTable2N");
		GameRegistry.registerBlock(prepTableS, ItemPrepTable.class, "PrepTableS");
		GameRegistry.registerBlock(prepTable2S, ItemPrepTable2.class, "PrepTable2S");
		GameRegistry.registerBlock(prepTableE, ItemPrepTable.class, "PrepTableE");
		GameRegistry.registerBlock(prepTable2E, ItemPrepTable2.class, "PrepTable2E");
		GameRegistry.registerBlock(prepTableW, ItemPrepTable.class, "PrepTableW");
		GameRegistry.registerBlock(prepTable2W, ItemPrepTable2.class, "PrepTable2W");
	}
}
