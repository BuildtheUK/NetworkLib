package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("WAYPOINT_LOCATION_RESPONSE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WaypointLocationResponse extends AbstractTransferObject {
    private String playerUuid;
    private String world;
    private double x;
    private double y;
    private double z;
    private boolean success;
    private String errorMessage;
}
