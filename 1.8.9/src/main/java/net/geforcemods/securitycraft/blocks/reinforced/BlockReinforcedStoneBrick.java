package net.geforcemods.securitycraft.blocks.reinforced;

import java.util.Arrays;
import java.util.List;

import net.geforcemods.securitycraft.tileentity.TileEntityOwnable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockReinforcedStoneBrick extends BlockStoneBrick implements ITileEntityProvider, IReinforcedBlock {

	public BlockReinforcedStoneBrick(){
		super();
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		return getDefaultState().withProperty(VARIANT, BlockStoneBrick.EnumType.byMetadata(meta));
	}

	@Override
	public void breakBlock(World par1World, BlockPos pos, IBlockState state){
		super.breakBlock(par1World, pos, state);
		par1World.removeTileEntity(pos);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityOwnable();
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

	@Override
	public List<Block> getVanillaBlocks()
	{
		return Arrays.asList(new Block[] {
				Blocks.stonebrick
		});
	}

	@Override
	public int getAmount()
	{
		return 4;
	}
}
