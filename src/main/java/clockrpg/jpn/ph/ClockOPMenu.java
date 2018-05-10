package clockrpg.jpn.ph;

import org.bukkit.plugin.java.JavaPlugin;

public final class ClockOPMenu extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("opmenu").setExecutor(new ClockOPMenu());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
