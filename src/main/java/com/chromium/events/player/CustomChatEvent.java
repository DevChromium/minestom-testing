package com.chromium.events.player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.minestom.server.entity.Player;
import net.minestom.server.event.EventListener;
import net.minestom.server.event.player.PlayerChatEvent;
import org.jetbrains.annotations.NotNull;

public class CustomChatEvent implements EventListener<PlayerChatEvent> {
    @Override
    public @NotNull Class<PlayerChatEvent> eventType() {
        return PlayerChatEvent.class;
    }

    @Override
    public @NotNull Result run(@NotNull PlayerChatEvent event) {

        final Player player = event.getPlayer();
        final String message = event.getMessage();
        final Component component = Component.empty()
                .append(Component.text("> "))
                .append(Component.text(player.getUsername(), NamedTextColor.LIGHT_PURPLE))
                .append(Component.text(" "))
                .append(Component.text(message, NamedTextColor.WHITE));

        event.setChatFormat((e) -> component);

        return Result.SUCCESS;
    }
}
