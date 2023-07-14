package efective.commonmethod.equals;

public final class Phone {

    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Phone && ((Phone) obj).name.equalsIgnoreCase(name);
    }
}
