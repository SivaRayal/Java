package main.com.ssk.java.features.java8;

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
