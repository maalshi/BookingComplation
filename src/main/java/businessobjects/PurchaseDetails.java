package businessobjects;

public class PurchaseDetails {

    private String cardNumber;
    private String cardCVV;
    private String cardName;
    private String cardSurname;
    private String cardAddress1;
    private String cardAddress2;
    private String cardCity;
    private String cardPostalCode;

    public PurchaseDetails(String cardNumber, String cardCVV, String cardName, String cardSurname, String cardAddress1, String cardAddress2, String cardCity) {
        this.cardNumber = cardNumber;
        this.cardCVV = cardCVV;
        this.cardName = cardNumber;
        this.cardSurname = cardSurname;
        this.cardAddress1 = cardAddress1;
        this.cardAddress2 = cardAddress2;
        this.cardCity = cardCity;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardSurname() {
        return cardSurname;
    }

    public void setCardSurname(String cardSurname) {
        this.cardSurname = cardSurname;
    }

    public String getCardAddress1() {
        return cardAddress1;
    }

    public void setCardAddress1(String cardAddress1) {
        this.cardAddress1 = cardAddress1;
    }

    public String getCardAddress2() {
        return cardAddress2;
    }

    public void setCardAddress2(String cardAddress2) {
        this.cardAddress2 = cardAddress2;
    }

    public String getCardCity() {
        return cardCity;
    }

    public void setCardCity(String cardCity) {
        this.cardCity = cardCity;
    }

    public String getCardPostalCode() {
        return cardPostalCode;
    }

    public void setCardPostalCode(String cardPostalCode) {
        this.cardPostalCode = cardPostalCode;
    }

}
