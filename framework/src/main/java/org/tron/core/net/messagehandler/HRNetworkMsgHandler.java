package org.tron.core.net.messagehandler;

import org.tron.core.exception.P2pException;
import org.tron.core.net.message.HRNetworkMessage;
import org.tron.core.net.peer.PeerConnection;

public interface HRNetworkMsgHandler {

  void processMessage(PeerConnection peer, HRNetworkMessage msg) throws P2pException;

}
