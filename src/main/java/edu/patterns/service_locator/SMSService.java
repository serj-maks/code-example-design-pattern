package edu.patterns.service_locator;

public class SMSService implements MessagingService {
    @Override
    public String getMessageBody() {
        return "sms message";
    }

    @Override
    public String getServiceName() {
        return "SMSService";
    }
}
