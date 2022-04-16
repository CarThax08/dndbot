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
        JDA jda = JDABuilder.createDefault(args[0]).setActivity(Activity.playing("Dungeons & Dragons")).build();
        jda.addEventListener(new Listeners());
    }

}
