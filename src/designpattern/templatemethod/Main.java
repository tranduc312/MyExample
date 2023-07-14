package designpattern.templatemethod;

public class Main {

    private static final String BREAK = "==================================================";

    public static void main(String[] args) {
        PageTemplate home = new HomePage();
        home.showPage();
        System.out.println(BREAK);
        PageTemplate detail = new DetailPage();
        detail.showPage();
        System.out.println(BREAK);
        PageTemplate contact = new ContactPage();
        contact.showPage();
    }
}
