package net.gulur.swanmark.bukkit.SwanmarkPlugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyPlayerListener {
	public static SwanmarkPlugin plugin;
	
	
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		event.setJoinMessage(ChatColor.YELLOW + player.getName() +" er kominn.");
	}


}
