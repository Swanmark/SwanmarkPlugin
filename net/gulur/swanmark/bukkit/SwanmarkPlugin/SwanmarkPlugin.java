package net.gulur.swanmark.bukkit.SwanmarkPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class SwanmarkPlugin extends JavaPlugin {

	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
	}
	
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("Swan")) {
			sender.sendMessage(ChatColor.RED + "Hæ, " + ChatColor.DARK_RED + sender.getName() + ChatColor.RED + ".");
			sender.sendMessage(ChatColor.RED + "Swanmark sendir þér bestu kveðjur!");
			return true;
		} else {
			return false;
		}
	}
}
