package businessobjects;

public class PassengerDetails {
    private String firstName;
    private String familyName;
    private String email;
    private String confirmEmail;
    private String areaCode;
    private String localNumber;

    public PassengerDetails(String firstName, String familyName, String email, String confirmEmail, String areaCode, String localNumber) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.email = email;
        this.confirmEmail = confirmEmail;
        this.areaCode = areaCode;
        this.localNumber = localNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }
}
