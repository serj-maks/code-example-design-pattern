package edu.serjmaks.patterns.service_locator;

public class InitialContext {

    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailService")) {
            return new EmailService();
        } else if (serviceName.equalsIgnoreCase("SSMService")) {
            return new SMSService();
        }
        return null;
    }
}
