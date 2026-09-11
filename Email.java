package emailbuilder;

public class Email {
    private final String to;
    private final String subject;
    private final String body;

    Email(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getTo() { return to; }
    public String getSubject() { return subject; }
    public String getBody() { return body; }

    @Override
    public String toString() {
        return "Email{to='" + to + "', subject='" + subject + "', body='" + body + "'}";
    }
}