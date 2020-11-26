import org.springframework.context.annotation.Bean;

public class Cat {
    private String meow;

    public String getMeow() {
        return meow;
    }

    public void setMeow(String message) {
        this.meow = meow;
    }
}