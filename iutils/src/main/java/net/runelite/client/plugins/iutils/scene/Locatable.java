package net.runelite.client.plugins.iutils.scene;

import net.runelite.api.Client;
import net.runelite.client.plugins.iutils.bot.Bot;

public interface Locatable {
    /**
     * The {@link Bot} instance this object belongs to.
     */
//    Bot bot();

    Client client();

    /**
     * The position in the world. In an instance, this is the actual
     * world position, not the position in the chunk template.
     */
    Position position();

    /**
     * If not in an instance, this is equal to {@link Locatable#position()}. In an instance, this returns
     * the position in the chunk template.
     */
//    default WorldPoint templatePosition() {
//        return bot().tile(position()).templatePosition();
//    }
}
