package io.mcatlas.queueplus.util;

import io.mcatlas.queueplus.QueuedPlayer;
import org.jetbrains.annotations.NotNull;

public class NullStorage extends Storage {
    @Override
    public void loadPlayer(@NotNull QueuedPlayer player) {

    }

    @Override
    public void savePlayer(@NotNull QueuedPlayer player) {

    }
}