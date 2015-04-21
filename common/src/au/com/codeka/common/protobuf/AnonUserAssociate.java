// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

/**
 *
 * Message to associate an empire with a "real" user account.
 */
public final class AnonUserAssociate extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_USER_EMAIL = "";

  @ProtoField(tag = 1, type = STRING)
  public final String user_email;

  public AnonUserAssociate(String user_email) {
    this.user_email = user_email;
  }

  private AnonUserAssociate(Builder builder) {
    this(builder.user_email);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AnonUserAssociate)) return false;
    return equals(user_email, ((AnonUserAssociate) other).user_email);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = user_email != null ? user_email.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<AnonUserAssociate> {

    public String user_email;

    public Builder() {
    }

    public Builder(AnonUserAssociate message) {
      super(message);
      if (message == null) return;
      this.user_email = message.user_email;
    }

    public Builder user_email(String user_email) {
      this.user_email = user_email;
      return this;
    }

    @Override
    public AnonUserAssociate build() {
      return new AnonUserAssociate(this);
    }
  }
}