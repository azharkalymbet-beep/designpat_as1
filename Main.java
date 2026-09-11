package emailbuilder;

public class Main {
    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();

        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objectBuilder, "azharkalymbet@icloud.com");
        Email emailObject = objectBuilder.getResult();
        System.out.println("--- RESULT 1 (Object) ---");
        System.out.println(emailObject);

        System.out.println();

        EmailPreviewBuilder previewBuilder = new EmailPreviewBuilder();
        director.makeWelcomeEmail(previewBuilder, "azharkalymbet@icloud.com");
        String emailPreview = previewBuilder.getResult();
        System.out.println("--- RESULT 2 (Text Preview) ---");
        System.out.println(emailPreview);
    }
}