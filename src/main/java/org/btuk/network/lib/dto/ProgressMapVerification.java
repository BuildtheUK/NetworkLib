package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("PROGRESS_MAP_VERIFY")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProgressMapVerification extends AbstractTransferObject{

    private String Sender;

}
