package net.geforcemods.securitycraft.network.packets;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.geforcemods.securitycraft.api.IPasswordProtected;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketSCheckPassword implements IMessage{

	private String password;
	private int x, y, z;

	public PacketSCheckPassword(){

	}

	public PacketSCheckPassword(int x, int y, int z, String code){
		this.x = x;
		this.y = y;
		this.z = z;
		password = code;
	}

	@Override
	public void toBytes(ByteBuf par1ByteBuf) {
		par1ByteBuf.writeInt(x);
		par1ByteBuf.writeInt(y);
		par1ByteBuf.writeInt(z);
		ByteBufUtils.writeUTF8String(par1ByteBuf, password);
	}

	@Override
	public void fromBytes(ByteBuf par1ByteBuf) {
		x = par1ByteBuf.readInt();
		y = par1ByteBuf.readInt();
		z = par1ByteBuf.readInt();
		password = ByteBufUtils.readUTF8String(par1ByteBuf);
	}

	public static class Handler extends PacketHelper implements IMessageHandler<PacketSCheckPassword, IMessage> {

		@Override
		public IMessage onMessage(PacketSCheckPassword packet, MessageContext ctx) {
			int x = packet.x;
			int y = packet.y;
			int z = packet.z;
			String password = packet.password;
			EntityPlayer player = ctx.getServerHandler().playerEntity;

			if(getWorld(player).getTileEntity(x, y, z) != null && getWorld(player).getTileEntity(x, y, z) instanceof IPasswordProtected)
				if(((IPasswordProtected) getWorld(player).getTileEntity(x, y, z)).getPassword().matches(password)){
					((EntityPlayerMP) player).closeScreen();
					((IPasswordProtected) getWorld(player).getTileEntity(x, y, z)).activate(player);
				}

			return null;
		}

	}

}
