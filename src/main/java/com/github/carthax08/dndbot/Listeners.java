package com.github.carthax08.dndbot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class Listeners extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("Message Recieved");
        if (!event.getMessage().getContentRaw().startsWith(Main.PREFIX_CHAR)) return;
        Random random = new Random();
        String message = event.getMessage().getContentDisplay().replace(Main.PREFIX_CHAR, "");
        System.out.println(message);
        if(!message.startsWith("d")) return;
        int result = 0;
        switch (message){
            case "d4":
                result = random.nextInt(4);
                break;
            case "d6":
                result = random.nextInt(6);
                break;
            case "d8":
                result = random.nextInt(8);
                break;
            case "d10":
                result = random.nextInt(10);
                break;
            case "d12":
                result = random.nextInt(12);
                break;
            case "d20":
                result = random.nextInt(20);
                break;
            case "d100":
                result = random.nextInt(100);
                break;
        }
        event.getChannel().sendMessage("Dice roll result was " + (result == 0 ? 1 : result)).queue();


    }
}
