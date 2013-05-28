package net.gulur.swanmark.bukkit.SwanmarkPlugin;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class SwanmarkPlugin extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Stuff");
	public static SwanmarkPlugin swan;

	@Override
	public void onEnable() {
		PluginDescriptionFile configFile = this.getDescription();
		this.logger.info("--__--__--__--__--__--__--__--__--__--__--__--");
		this.logger.info("Name        : " +configFile.getName()+".");
		this.logger.info("Author      : " +configFile.getAuthors()+".");
		this.logger.info("Version     : " +configFile.getVersion()+".");
		this.logger.info("Description : " +configFile.getDescription()+".");
		this.logger.info("--__--__--__--__--__--__--__--__--__--__--__--");
	}
	
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		PluginDescriptionFile configFile = this.getDescription();
		if(cmd.getName().equalsIgnoreCase("Swan")) {
			sender.sendMessage(ChatColor.RED + "Hæ, " + ChatColor.DARK_RED + sender.getName() + ChatColor.RED + ".");
			sender.sendMessage(ChatColor.DARK_RED+configFile.getWebsite()+ChatColor.RED+" segir hæ til baka. :)");
			return true;
		} else {
			return false;
		}
	}
}