package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.btuk.network.lib.deserializer.ComponentDeserializer;
import org.btuk.network.lib.serializer.ComponentSerializer;
import net.kyori.adventure.text.Component;

import java.util.Set;

@JsonTypeName("USER_UPDATE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserUpdate extends AbstractTransferObject {

    private String uuid;

    private Set<String> channels;

    private Boolean afk;

    private TabPlayer tabPlayer;

    @JsonSerialize(using = ComponentSerializer.class)
    @JsonDeserialize(using = ComponentDeserializer.class)
    private Component displayName;
}
