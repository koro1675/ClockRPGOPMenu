package clockrpg.jpn.ph;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command extends GUIUtil implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("this command is can executed by players only");
            return false;
        }
        Player player = (Player) sender;
        //引数がない場合
        if (args.length == 0) {
            player.sendMessage();
        }
        return false;
    }
}
