package udemy.performance.map;

import lombok.Builder;

//@Data
@Builder
public class Phone {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int rs = 1;
        rs = (int) (prime * rs + id);
        rs = prime * rs + (name == null ? 0 : name.hashCode());
        return rs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != getClass())
            return false;
        Phone phone = (Phone) obj;
        if (id == null) {
            if (phone.id != null)
                return false;
        } else if (id != phone.id)
            return false;
        if (!name.equals(phone.name))
            return false;

        return true;
    }
}
