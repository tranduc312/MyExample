package designpattern.templatemethod;

public class ContactPage extends PageTemplate {

    @Override
    public void showContent() {
        System.out.println("Content of contact page");
    }
}
