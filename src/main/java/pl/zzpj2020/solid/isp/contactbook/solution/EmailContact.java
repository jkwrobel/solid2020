package pl.zzpj2020.solid.isp.contactbook.solution;

public class EmailContact extends Contact{
    public String emailAddress;

    public EmailContact(String name, String address, String emailAddress) {
        super(name, address);
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
