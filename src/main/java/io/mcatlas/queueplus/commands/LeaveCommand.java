package io.mcatlas.queueplus.commands;

import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.proxy.Player;
import io.mcatlas.queueplus.Main;
import io.mcatlas.queueplus.QueuedPlayer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

import java.util.Collections;
import java.util.List;

public class LeaveCommand extends BaseCommand implements SimpleCommand {

    @Override
    public void execute(Invocation invocation) {
        if (!(invocation.source() instanceof Player player)) {
            invocation.source().sendMessage(Component.text("This command cannot be used by console.", NamedTextColor.RED));
            return;
        }

        QueuedPlayer queuedPlayer = Main.instance().queued(player);

        if (!queuedPlayer.isInQueue()) {
            player.sendMessage(Component.text("You are not in a queue.", NamedTextColor.RED));
            return;
        }

        queuedPlayer.queue().remove(queuedPlayer);
        queuedPlayer.queue(null);
        player.sendMessage(Component.text("You have left the queue.", NamedTextColor.GREEN));
    }

    @Override
    public List<String> suggest(Invocation invocation) {
        return Collections.emptyList();
    }
}
