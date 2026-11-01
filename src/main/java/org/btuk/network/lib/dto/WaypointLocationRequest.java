package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("WAYPOINT_LOCATION_REQUEST")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WaypointLocationRequest extends AbstractTransferObject {
    private String playerUuid;
}
