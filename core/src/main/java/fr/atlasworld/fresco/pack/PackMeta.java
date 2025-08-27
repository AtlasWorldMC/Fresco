package fr.atlasworld.fresco.pack;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

import static fr.atlasworld.fresco.processor.ProcessorOutput.GSON;

/**
 * Represents pack meta contained inside the resource packs.
 *
 * @param description description of the pack
 * @param packFormat pack format
 *
 * @see <a href="https://minecraft.wiki/w/Pack.mcmeta">Minecraft Wiki: Pack.mcmeta</a>
 */
public record PackMeta(String description, int packFormat) {

    @Override
    public @NotNull String toString() {
        JsonObject pack = new JsonObject();
        pack.addProperty("description", this.description);
        pack.addProperty("pack_format", this.packFormat);

        JsonObject root = new JsonObject();
        root.add("pack", pack);
        return GSON.toJson(root);
    }
}
