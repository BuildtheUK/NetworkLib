package org.btuk.network.lib.socket;

import org.btuk.network.lib.dto.AbstractTransferObject;

public interface SocketHandler {

    AbstractTransferObject handle(AbstractTransferObject transferObject);

}
