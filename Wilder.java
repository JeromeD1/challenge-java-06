package challengeJava06;
public class Wilder {
    
    //atributes
    private String firstName;
    private boolean aware;

    //constructors
    public Wilder (String firstName , boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public Wilder (String firstName) {
        this.firstName = firstName;
        this.aware = false;
    }

    //getters
    public String getFirstName () {
        return this.firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    //instance methods
    public String whoAmI() {
        return "Je m'appelle " + this.firstName + (this.aware == true ? " et je suis aware." : " et je ne suis pas aware.");
    }

    //static methods
    public static String wilderMotto() {
        return "Wilder un jour, wilder toujours !";
    } 

}
