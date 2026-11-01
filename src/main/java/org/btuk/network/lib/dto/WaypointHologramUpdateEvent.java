package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonTypeName("WAYPOINT_HOLOGRAM_UPDATE_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WaypointHologramUpdateEvent extends AbstractTransferObject {
    private boolean enabled;
    private String server;
    private String world;
    private double x;
    private double y;
    private double z;
    private List<String> lines;
}
