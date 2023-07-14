package designpattern.templatemethod;

public class HomePage extends PageTemplate {

    @Override
    protected void showContent() {
        System.out.println("Content Page");
    }
}
