package sk.demo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.stereotype.Service;

/**
 * Created by sengkai on 3/3/2017.
 */
@Service
public class NotificationService {

  public NotificationService() {
  }

  public void send() {

  }

  public void sendAsync() {

  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
        .append("output", "NotificationService")
        .toString();
  }
}
