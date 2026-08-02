package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.btuk.network.lib.enums.TeleportRequestType;

@JsonTypeName("TELEPORT_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeleportEvent extends AbstractTransferObject {
    private String requester;
    private String target;
    private TeleportRequestType type;
}
