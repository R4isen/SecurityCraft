package net.geforcemods.securitycraft.blocks.reinforced;

import java.util.List;
import java.util.Random;

import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.tileentity.TileEntityOwnable;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockReinforcedSlabs2 extends BlockSlab implements ITileEntityProvider {

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockReinforcedSlabs2.EnumType.class);

	private final boolean isDouble;

	public BlockReinforcedSlabs2(boolean isDouble, Material blockMaterial){
		super(blockMaterial);

		this.isDouble = isDouble;

		if(!isDouble())
			useNeighborBrightness = true;

		setDefaultState(blockState.getBaseState().withProperty(VARIANT, BlockReinforcedSlabs2.EnumType.RED_SANDSTONE));
	}

	@Override
	public void breakBlock(World par1World, BlockPos pos, IBlockState state){
		super.breakBlock(par1World, pos, state);
		par1World.removeTileEntity(pos);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return Item.getItemFromBlock(SCContent.reinforcedStoneSlabs2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list){
		BlockReinforcedSlabs2.EnumType[] aenumtype = BlockReinforcedSlabs2.EnumType.values();

		for(int i = 0; i < aenumtype.length; i++){
			BlockReinforcedSlabs2.EnumType enumtype = aenumtype[i];

			list.add(new ItemStack(itemIn, 1, enumtype.getMetadata()));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos){
		return Item.getItemFromBlock(SCContent.reinforcedStoneSlabs2);
	}

	@Override
	public int damageDropped(IBlockState state){
		return ((BlockReinforcedSlabs2.EnumType)state.getValue(VARIANT)).getMetadata();
	}

	@Override
	public String getUnlocalizedName(int meta){
		return super.getUnlocalizedName() + "." + BlockReinforcedSlabs2.EnumType.byMetadata(meta).getUnlocalizedName();
	}

	@Override
	public IProperty getVariantProperty(){
		return VARIANT;
	}

	@Override
	public Object getVariant(ItemStack stack) {
		return BlockReinforcedSlabs2.EnumType.byMetadata(stack.getMetadata() & 7);
	}

	@Override
	public IBlockState getStateFromMeta(int meta){
		IBlockState iblockstate = getDefaultState().withProperty(VARIANT, BlockReinforcedSlabs2.EnumType.byMetadata(meta & 7));

		iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);

		return iblockstate;
	}

	@Override
	public int getMetaFromState(IBlockState state){
		byte b0 = 0;
		int i = b0 | ((BlockReinforcedSlabs2.EnumType)state.getValue(VARIANT)).getMetadata();

		if(state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
			i |= 8;

		return i;
	}

	@Override
	protected BlockState createBlockState(){
		return new BlockState(this, new IProperty[] {HALF, VARIANT});
	}

	@Override
	public boolean isDouble(){
		return isDouble;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityOwnable();
	}


	public static enum EnumType implements IStringSerializable{
		RED_SANDSTONE(0, "red_sandstone");

		private static final BlockReinforcedSlabs2.EnumType[] META_LOOKUP = new BlockReinforcedSlabs2.EnumType[values().length];
		private final int meta;
		private final String name;
		private final String unlocalizedName;

		private EnumType(int meta, String name){
			this(meta, name, name);
		}

		private EnumType(int meta, String name, String unlocalizedName){
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}

		public int getMetadata(){
			return meta;
		}

		@Override
		public String toString(){
			return name;
		}

		public static BlockReinforcedSlabs2.EnumType byMetadata(int meta){
			if(meta < 0 || meta >= META_LOOKUP.length)
				meta = 0;

			return META_LOOKUP[meta];
		}

		@Override
		public String getName(){
			return name;
		}

		public String getUnlocalizedName(){
			return unlocalizedName;
		}

		static {
			BlockReinforcedSlabs2.EnumType[] var0 = values();
			int var1 = var0.length;

			for(int var2 = 0; var2 < var1; ++var2){
				BlockReinforcedSlabs2.EnumType var3 = var0[var2];
				META_LOOKUP[var3.getMetadata()] = var3;
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass)
	{
		return 0x999999;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderColor(IBlockState state)
	{
		return 0x999999;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBlockColor()
	{
		return 0x999999;
	}
}
