package org.btuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class ComponentDeserializer extends StdDeserializer<Component> {

    public ComponentDeserializer() {
        this(null);
    }

    public ComponentDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Component deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonNode node = parser.getCodec().readTree(parser);
        return GsonComponentSerializer.gson().deserialize(node.asText());
    }
}
