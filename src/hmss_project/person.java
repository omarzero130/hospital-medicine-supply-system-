package hmss_project;

public class person {

    // ---------------------------- ATTRIBUTES -----------------------

    private String PersonUserName;

    private String PersonPassword;

    // ---------------------------- CONSTRUCTOR -----------------------

    public person() {
    }

    public person(String PersonUserName, String PersonPassword) {
        this.PersonUserName = PersonUserName;
        this.PersonPassword = PersonPassword;
    }

// ---------------------------- SETTER METHOD -----------------------

    public void setPersonUserName(String PersonUserName) {
        this.PersonUserName = PersonUserName;
    }

    public void setPersonPassword(String PersonPassword) {
        this.PersonPassword = PersonPassword;
    }

    

    // ---------------------------- GETTER METHOD -----------------------

    public String getPersonUserName() {
        return PersonUserName;
    }

    public String getPersonPassword() {
        return PersonPassword;
    }   


    




}
