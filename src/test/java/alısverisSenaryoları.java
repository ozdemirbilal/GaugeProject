import com.thoughtworks.gauge.Step;

public class alısverisSenaryoları {

    @Step("login with valid <username> and <password>")
    public void kullanıcıGiris(String username, String password){

        System.out.println("user logged with valid "+username +" and "+ password+"...");

    }

    @Step("ürün ara")
    public void urunAra(){
        System.out.println("product searched...");

    }
    @Step("sepete ekle")
    public void sepeteEkle(){
        System.out.println("product added to cart");

    }
}
