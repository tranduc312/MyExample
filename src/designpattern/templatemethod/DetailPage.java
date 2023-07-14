package designpattern.templatemethod;

public class DetailPage extends PageTemplate {

    @Override
    protected void showContent() {
        System.out.println("Content of detail");
    }
}
