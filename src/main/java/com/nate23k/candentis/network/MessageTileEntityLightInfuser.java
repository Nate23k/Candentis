package com.nate23k.candentis.network;

import com.nate23k.candentis.utility.LogHelper;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

/**
 * Created on 4/8/2015.
 */

public class MessageTileEntityLightInfuser implements IMessageHandler<MessageTileEntityLightInfuser.SimpleMessage, IMessage>
{

    @Override
    public IMessage onMessage(MessageTileEntityLightInfuser.SimpleMessage message, MessageContext ctx)
    {
        return null;
    }

    public static class SimpleMessage implements IMessage
    {
        private float light;

        // Constructor is required else terrible errors
        public SimpleMessage() {}

        public SimpleMessage(float light)
        {
            this.light = light;
        }

        @Override
        public void fromBytes(ByteBuf buf)
        {
            this.light = buf.readFloat();
        }

        @Override
        public void toBytes(ByteBuf buf)
        {
            buf.writeFloat(light);
        }
    }
}
