package designpattern.templatemethod;

public class ContactPage extends PageTemplate {

    @Override
    protected void showContent() {
        System.out.println("Content of contact page");
    }
}
