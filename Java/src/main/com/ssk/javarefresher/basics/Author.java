package main.com.ssk.javarefresher.basics;

import java.lang.annotation.Documented;


@Documented
public @interface Author {
    String author() default "Siva Rayal";
    String email() default "kuruva.siva8055@gmail.com";
    String date() ;
}
