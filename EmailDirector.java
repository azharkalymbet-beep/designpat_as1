package emailbuilder;

public class EmailDirector {

    public void makeWelcomeEmail(EmailBuilder builder, String userEmail) {
        builder.setTo(userEmail)
                .setSubject("Welcome to Our Platform!")
                .setBody("Hello! We are glad to have you with us.");
    }

    public void makePasswordResetEmail(EmailBuilder builder, String userEmail) {
        builder.setTo(userEmail)
                .setSubject("Password Reset Request")
                .setBody("Click the link below to reset your password.");
    }
}