package org.btuk.network.lib.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ComponentListDeserializer extends StdDeserializer<List<Component>> {

    public ComponentListDeserializer() {
        this(null);
    }

    public ComponentListDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public List<Component> deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonNode arrayNode = parser.getCodec().readTree(parser);
        List<Component> components = new ArrayList<>();
        for (JsonNode node : arrayNode) {
            components.add(GsonComponentSerializer.gson().deserialize(node.asText()));
        }
        return components;
    }
}