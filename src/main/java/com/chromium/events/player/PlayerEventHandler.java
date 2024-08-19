package com.chromium.events.player;


import com.chromium.core.interfaces.EventHandler;
import net.minestom.server.event.EventFilter;
import net.minestom.server.event.EventNode;
import net.minestom.server.event.trait.PlayerEvent;

public class PlayerEventHandler implements EventHandler<PlayerEvent> {

    private static final EventNode<PlayerEvent> EVENT_NODE = EventNode.type("player-listener", EventFilter.PLAYER);

    private static final CustomChatEvent CUSTOM_CHAT_EVENT = new CustomChatEvent();

    @Override
    public EventNode<PlayerEvent> eventNode() {

        EVENT_NODE.addListener(CUSTOM_CHAT_EVENT);
        return EVENT_NODE;
    }
}

