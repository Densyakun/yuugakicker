package io.github.densyakun.bukkit.yuugakicker;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class YuugaKicker extends JavaPlugin implements Listener {
	
	public static UUID UNIQUEID = UUID.fromString("5c6c3097-33a8-45cf-a1fc-14c9c194af34");
	public static String KICK_MESSAGE = "Kicked by YuugaKicker.";
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (/*e.getPlayer().getName().equals("yuugachannel")*/p.getUniqueId().equals(UNIQUEID)) {
			p.kickPlayer(KICK_MESSAGE);
		}
	}
}
