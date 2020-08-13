package xyz.nucleoid.plasmid.game;

import net.minecraft.server.MinecraftServer;
import xyz.nucleoid.plasmid.game.world.bubble.BubbleWorldConfig;

public final class GameOpenContext<C> {
    private final MinecraftServer server;
    private final ConfiguredGame<C> game;

    public GameOpenContext(MinecraftServer server, ConfiguredGame<C> game) {
        this.server = server;
        this.game = game;
    }

    public GameWorld openWorld(BubbleWorldConfig config) {
        return GameWorld.open(this.server, this.game, config);
    }

    public MinecraftServer getServer() {
        return this.server;
    }

    public C getConfig() {
        return this.game.getConfig();
    }
}
