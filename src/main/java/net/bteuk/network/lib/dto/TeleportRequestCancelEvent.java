package net.bteuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("TELEPORT_REQUEST_CANCEL")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeleportRequestCancelEvent extends TeleportEvent { }
