package pw.amel.dungeonmod.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pw.amel.dungeonmod.DungeonMod;

public class ConfigReload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        DungeonMod.getConfigManager().reload();
        sender.sendMessage("Finished reloading.");
        return true;
    }
}
