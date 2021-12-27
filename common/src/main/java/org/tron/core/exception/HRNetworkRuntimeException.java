package org.tron.core.exception;

public class HRNetworkRuntimeException extends RuntimeException {

  public HRNetworkRuntimeException() {
    super();
  }

  public HRNetworkRuntimeException(String message) {
    super(message);
  }

  public HRNetworkRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  public HRNetworkRuntimeException(Throwable cause) {
    super(cause);
  }

  protected HRNetworkRuntimeException(String message, Throwable cause,
      boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }


}
