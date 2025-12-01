package at.tasks.consultation;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;

import java.lang.annotation.Repeatable;

public @interface HasLegs {
    String value();
}
