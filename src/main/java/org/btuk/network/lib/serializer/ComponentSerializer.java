package org.btuk.network.lib.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;

import java.io.IOException;

public class ComponentSerializer extends StdSerializer<Component> {

    public ComponentSerializer() {
        this(null);
    }

    public ComponentSerializer(Class<Component> vc) {
        super(vc);
    }

    @Override
    public void serialize(Component component, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
        generator.writeString(GsonComponentSerializer.gson().serialize(component));
    }
}
