package edu.serjmaks.patterns.service_locator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<MessagingService> services = new ArrayList<>();

    public MessagingService getService(String serviceName) {
        //retrieve from the list
        return null;
    }

    public void addService(MessagingService newService) {
        // add to the list
    }
}
