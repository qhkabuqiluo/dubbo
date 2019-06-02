package com.micheal.test;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.spi.Robot;
import org.junit.jupiter.api.Test;

public class DubboSPITest {
    @Test
    public void sayHello() {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
