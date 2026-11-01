package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("WAYPOINT_TELEPORT_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WaypointTeleportEvent extends AbstractTransferObject {
    private String playerUuid;
    private String world;
    private double x;
    private double y;
    private double z;
    private float yaw;
    private float pitch;
}
