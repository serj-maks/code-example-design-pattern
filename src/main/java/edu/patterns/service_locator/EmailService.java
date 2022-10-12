package edu.patterns.service_locator;

public class EmailService implements MessagingService {
    @Override
    public String getMessageBody() {
        return "email message";
    }

    @Override
    public String getServiceName() {
        return "EmailService";
    }
}
