package resource_manager;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceManager {

    private static final String RESOURCE_FILE = "messages";

    public ResourceBundle getResourceBundle() {
        return ResourceBundle.getBundle(ResourceManager.RESOURCE_FILE);
    }

    public ResourceBundle getResourceBundle(Locale locale) {
        return ResourceBundle.getBundle(ResourceManager.RESOURCE_FILE, locale);
    }

    private Locale getDefaultLocale() {
        return Locale.getDefault();
    }
}
