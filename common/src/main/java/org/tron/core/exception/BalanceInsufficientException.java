package org.tron.core.exception;

public class BalanceInsufficientException extends HRNetworkException {

  public BalanceInsufficientException() {
    super();
  }

  public BalanceInsufficientException(String message) {
    super(message);
  }
}
