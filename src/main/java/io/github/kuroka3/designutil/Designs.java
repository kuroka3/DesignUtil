package io.github.kuroka3.designutil;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Designs {
    public static String chat;

    public static String join;

    public static String quit;

    private static String get(String key) {
        try {

            Properties designs = new Properties();

            File file = new File(DesignUtil.getPlugin(DesignUtil.class).getDataFolder() + "/designs.txt");

            if(!file.isFile()) {
                file.createNewFile();
                designs.setProperty("chat", "default");
                designs.setProperty("join", "default");
                designs.setProperty("quit", "default");
                designs.store(new FileWriter(file), null);
            }


            designs.load(new FileReader(file));

            String value = designs.getProperty(key);

            if (value == null) value = "default";

            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void load() {
        chat = get("chat");
        join = get("join");
        quit = get("quit");
    }
}
