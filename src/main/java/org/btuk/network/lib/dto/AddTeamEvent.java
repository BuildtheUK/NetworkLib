package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event to add a player to a team based on their primary group.
 */
@JsonTypeName("ADD_TEAM_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddTeamEvent extends AbstractTransferObject {

    private String name;

    private String primaryGroup;

}
