package main.com.ssk.javarefresher.features.java8;

import java.lang.annotation.Repeatable;

public class RepeatingAnnotations {
    @Repeatable(Notifications.class)
   public @interface Notify{
       String email();
   }

   public @interface Notifications{
       Notify[] value();
   }
}
