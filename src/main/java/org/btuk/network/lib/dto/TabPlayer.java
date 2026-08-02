package org.btuk.network.lib.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.btuk.network.lib.deserializer.ComponentDeserializer;
import org.btuk.network.lib.serializer.ComponentSerializer;
import net.kyori.adventure.text.Component;

/**
 * Tab Player
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TabPlayer {

    private String uuid;

    private String name;
    
    /** The primary group of the player. */
    private String primaryGroup;

    private int ping;

    /** The prefix of the player. */
    @JsonSerialize(using = ComponentSerializer.class)
    @JsonDeserialize(using = ComponentDeserializer.class)
    private Component prefix;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof TabPlayer tabPlayer) {
            // Compare uuid only.
            return uuid.equals(tabPlayer.getUuid());
        }
        return false;
    }
}
