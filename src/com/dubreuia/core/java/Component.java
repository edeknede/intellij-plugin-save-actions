package com.dubreuia.core.java;

import com.dubreuia.core.SaveActionManager;
import org.jetbrains.annotations.NotNull;

/**
 * The plugin entry class for java based ide. This is not a singleton, the parent is also instanciated.
 */
public class Component extends com.dubreuia.core.Component {

    private static final String COMPONENT_NAME = "Save Actions Java";

    public static boolean JAVA_LOADED = false;

    public Component() {
        JAVA_LOADED = true;
    }

    @NotNull
    public String getComponentName() {
        return COMPONENT_NAME;
    }

    @NotNull
    @Override
    protected SaveActionManager getSaveActionManager() {
        return new com.dubreuia.core.java.SaveActionManager();
    }

}
