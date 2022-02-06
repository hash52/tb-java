public abstract class AbstractPerson {

    protected abstract String getGender();

    public void speak() {
        System.out.println("I'm a " + getGender());
    }
}