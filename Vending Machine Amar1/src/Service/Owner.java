package Service;
import lombok.Getter;

@Getter

public class Owner {
    String name;
    String ContactInfo;

    public Owner(String name, String contactInfo) {
        this.name = name;
        ContactInfo = contactInfo;
    }


}
