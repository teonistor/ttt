package io.github.teonistor.ttt.ws;

import org.springframework.context.annotation.Import;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Import(WsConfig.class)
@Retention(RUNTIME)
public @interface EnableTtt {}
