public class Visitor extends Person {
    private Boolean membershipStatus; // Is the visitor a member?
    private String favoriteRide;      //  Favorite amusement equipment name.

    public Visitor (){}
    public Visitor(String name, String id, int age, Boolean membershipStatus, String favoriteRide){
        super(name,id,age);
        this.membershipStatus = membershipStatus;
        this.favoriteRide = favoriteRide;
    }

    public Boolean getMembershipStatus(){return membershipStatus;}
    public void setMembershipStatus(Boolean membershipStatus){this.membershipStatus = membershipStatus;}

    public String getFavoriteRide(){return favoriteRide;}
    public void setFavoriteRide(String favoriteRide){this.favoriteRide = favoriteRide;}

    public void printDetails(){
        super.printDetails();
        System.out.print("Membership Status :" + membershipStatus + "\t");
        System.out.print("Favorite Ride :" + favoriteRide+ "\t");
    }

}