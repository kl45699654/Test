package example.object;

/**
 * @program: springssm
 * @description: 联系方式
 * @author: Mr.Shu
 * @create: 2018-04-02 17:10
 **/
public class ContactInfo {
    private String phone;
    private String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
