package com.github.carthax08.dndbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;

import javax.security.auth.login.LoginException;
import java.util.Random;

public class Main {
    public static String PREFIX_CHAR = "?";
    public static Main instance;
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder.createDefault("OTY0NzA1NzUzMTk5OTU2MDQ4.YloiPg.sKUKPy6f0KE47uUz4u-6m0Zik9w").setActivity(Activity.playing("Dungeons & Dragons")).build();
        jda.addEventListener(new Listeners());
    }

}
