package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.btuk.network.lib.deserializer.ComponentDeserializer;
import org.btuk.network.lib.enums.ModerationAction;
import org.btuk.network.lib.serializer.ComponentSerializer;
import net.kyori.adventure.text.Component;

@JsonTypeName("MODERATION_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ModerationEvent extends AbstractTransferObject {

    private ModerationAction moderationAction;

    private String senderUuid;

    private String uuid;

    private long endTime;

    @JsonSerialize(using = ComponentSerializer.class)
    @JsonDeserialize(using = ComponentDeserializer.class)
    private Component reason;

}