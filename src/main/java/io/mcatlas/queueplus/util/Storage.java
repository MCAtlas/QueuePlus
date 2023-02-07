package io.mcatlas.queueplus.util;

import io.mcatlas.queueplus.QueuedPlayer;
import org.jetbrains.annotations.NotNull;

public abstract class Storage {
    abstract public void loadPlayer(@NotNull QueuedPlayer player);

    abstract public void savePlayer(@NotNull QueuedPlayer player);

    public void enable() {}

    public void disable() {}
}

