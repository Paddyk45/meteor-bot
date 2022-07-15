package meteordevelopment.meteorbot.utils;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class Utils {
    private static final Color EMBED_COLOR = new Color(145, 61, 226);

    public static EmbedBuilder embedTitle(String title, String format, Object... args) {
        return new EmbedBuilder()
                .setColor(EMBED_COLOR)
                .setTitle(title)
                .setDescription(String.format(format, args));
    }

    public static EmbedBuilder embed(String format, Object... args) {
        return embedTitle(null, format, args);
    }
}
