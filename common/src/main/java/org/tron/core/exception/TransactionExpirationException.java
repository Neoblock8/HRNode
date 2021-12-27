package org.tron.core.exception;

public class TransactionExpirationException extends HRNetworkException {

  public TransactionExpirationException() {
    super();
  }

  public TransactionExpirationException(String message) {
    super(message);
  }

}