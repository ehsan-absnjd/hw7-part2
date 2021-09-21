public class OnlineNewspaperSubscription extends NewspaperSubscription{
    public void setAddress(String address){
        if(address.contains("@")){
            this.rate=9;
            this.address=address;
        }else{
            System.out.println("invalid address!");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("online newspaper subscriontion for: ").append(this.name)
                .append(" address: ").append(this.address).append(" rate: ").append(this.rate);
        return stringBuilder.toString();
    }
}
