public class Wilder {
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    private boolean aware;


    public String whoAmI(){
        return "Je m'appelle " + firstname + " et " + ((aware) ?  "je suis aware" : "je ne suis pas aware");
    }

}
