package org.tron.core.exception;

public class TooBigTransactionException extends HRNetworkException {

  public TooBigTransactionException() {
    super();
  }

  public TooBigTransactionException(String message) {
    super(message);
  }
}
