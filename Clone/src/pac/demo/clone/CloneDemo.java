package pac.demo.clone;

class CloneDemo implements Cloneable {
    int id;
    String name;

    public CloneDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Call the default implementation
    }

    @Override
    public String toString() {
        return "Demo{id=" + id + ", name='" + name + "'}";
    }
}



