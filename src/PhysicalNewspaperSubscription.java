public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String address){
        String digits = "1234567890";
        boolean containsDigits=false;
        for(char c : address.toCharArray()){
            if(digits.contains(String.valueOf(c)))
                containsDigits=true;
        }
        if (containsDigits){
            this.address=address;
            this.rate=15;
        }else{
            this.rate =0;
            System.out.println("invalid address!");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("physical newspaper subscriontion for: ").append(this.name)
                .append(" address: ").append(this.address).append(" rate: ").append(this.rate);
        return stringBuilder.toString();
    }
}
