package pac.demo.finalize;

class Demo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called for object: " + this);
    }
}



