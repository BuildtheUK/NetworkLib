package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("FOCUS_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FocusEvent extends AbstractTransferObject {

    private String uuid;

    private boolean enable;
}
