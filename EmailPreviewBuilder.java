package emailbuilder;

public class EmailPreviewBuilder implements EmailBuilder {
    private final StringBuilder preview = new StringBuilder("=== EMAIL PREVIEW ===\n");

    @Override
    public EmailPreviewBuilder setTo(String to) {
        preview.append("TO:      ").append(to).append("\n");
        return this;
    }

    @Override
    public EmailPreviewBuilder setSubject(String subject) {
        preview.append("SUBJECT: ").append(subject).append("\n");
        return this;
    }

    @Override
    public EmailPreviewBuilder setBody(String body) {
        preview.append("BODY:\n").append(body).append("\n=====================");
        return this;
    }

    public String getResult() {
        return preview.toString();
    }
}