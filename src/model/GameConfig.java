package model;

/**
 * Created by david on 25/08/14.
 */
public final class GameConfig extends Constants{
    private static GameConfig instance;
    private static Object lock = new Object();

    private int whoStarts;

    public GameConfig() {

    }

    public static GameConfig instance() {
        if (instance == null) {
            synchronized(lock) {
                if (instance == null) {
                    instance = new GameConfig();
                }
            }
        }
        return instance;
    }

    public GameConfig configureStart(int whoStarts) {
        this.whoStarts=whoStarts;
        return this;
    }

    public int whoStarts() {
        int start;
        if (whoStarts == START_RANDOM) {
            start = (int)Math.random();
        } else start=whoStarts;
        return (start<0) ? START_AGENT : START_PLAYER;
    }
}
