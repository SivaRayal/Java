package main.com.ssk.java.basics;

import java.lang.annotation.Documented;

@Documented
public @interface Author {
    String author();
    String email();
    String date();
}
