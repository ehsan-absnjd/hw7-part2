public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected int rate;
    public abstract void setAddress(String address);
    public void setName(String name) {
        this.name = name;
    }
    public abstract String toString();
}
