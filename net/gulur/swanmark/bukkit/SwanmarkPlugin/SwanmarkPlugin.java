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
	public final MyPlayerListener pl = new MyPlayerListener();

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
		this.logger.info(swan + "SHUTTING DOWN!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("Swan")) {
			sender.sendMessage(ChatColor.RED + "Hæ, " + ChatColor.DARK_RED + sender.getName() + ChatColor.RED + ".");
			sender.sendMessage(ChatColor.DARK_RED+"Swanmark"+ChatColor.RED+" segir hæ til baka. :)");
			return true;
		} else if(cmd.getName().equalsIgnoreCase("eregop")) {
			if(sender.isOp() == true) {
				sender.sendMessage(ChatColor.AQUA+"Já, "+ChatColor.DARK_AQUA+sender.getName()+ChatColor.AQUA+ " þú ert OP.");
				return true;
			} else if(sender.isOp() == false) {
				sender.sendMessage(ChatColor.AQUA+ "Nei, "+ChatColor.DARK_AQUA+sender.getName()+ChatColor.AQUA+" þú ert ekki OP.");
				return true;
			}
		}
		return false;
	}

}