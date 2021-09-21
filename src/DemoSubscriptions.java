public class DemoSubscriptions {
    public static void main(String[] args) {
        NewspaperSubscription physical1 = new PhysicalNewspaperSubscription();
        physical1.setName("ali");
        physical1.setAddress("no 10");
        NewspaperSubscription physical2 = new PhysicalNewspaperSubscription();
        physical2.setName("reza");
        physical2.setAddress("tehran, amirabad");
        NewspaperSubscription online1 = new OnlineNewspaperSubscription();
        online1.setName("vahid");
        online1.setAddress("vahid@gmail.com");
        NewspaperSubscription online2 = new OnlineNewspaperSubscription();
        online2.setName("hamed");
        online2.setAddress("adfj.com");
        System.out.println(physical1);
        System.out.println(physical2);
        System.out.println(online1);
        System.out.println(online2);


    }
}
