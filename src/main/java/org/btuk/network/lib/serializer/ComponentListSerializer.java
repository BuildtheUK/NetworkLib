package org.btuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;
import java.util.List;

public class ComponentListSerializer extends StdSerializer<List<Component>> {

    public ComponentListSerializer() {
        this(null);
    }

    public ComponentListSerializer(Class<List<Component>> vc) {
        super(vc);
    }

    @Override
    public void serialize(List<Component> components, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
        generator.writeStartArray();
        for (Component component : components) {
            generator.writeString(GsonComponentSerializer.gson().serialize(component));
        }
        generator.writeEndArray();
    }
}