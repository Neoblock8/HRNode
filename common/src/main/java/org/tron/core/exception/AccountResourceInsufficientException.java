package org.tron.core.exception;

public class AccountResourceInsufficientException extends HRNetworkException {

  public AccountResourceInsufficientException() {
    super("Insufficient bandwidth and balance to create new account");
  }

  public AccountResourceInsufficientException(String message) {
    super(message);
  }
}

