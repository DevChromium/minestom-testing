package com.chromium.core.interfaces;

import net.minestom.server.event.Event;
import net.minestom.server.event.EventNode;

public interface EventHandler<T extends Event> {

    EventNode<T> eventNode();

}
