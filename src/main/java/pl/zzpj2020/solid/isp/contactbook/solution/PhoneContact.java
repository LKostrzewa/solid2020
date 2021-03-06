package pl.zzpj2020.solid.isp.contactbook.solution;

public class PhoneContact extends Contact implements Phone{

    public String telephone;

    public PhoneContact(String name, String address, String telephone) {
        super(name, address);
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
