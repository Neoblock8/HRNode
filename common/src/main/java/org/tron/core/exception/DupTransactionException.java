package org.tron.core.exception;

public class DupTransactionException extends HRNetworkException {

  public DupTransactionException() {
    super();
  }

  public DupTransactionException(String message) {
    super(message);
  }
}
