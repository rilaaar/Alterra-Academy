package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



public class LoginPage extends PageObject {
    private By fieldUsername(){
        return By.id("user-name");
    }
    private By password(){
        return By.id("password");
    }
    private By loginButton(){
        return By.id("login-button");
    }
    private By headerProduct(){
        return By.xpath("//span[@class = 'title']");
    }
    private By errorMessage(){
        return By.xpath("//h3");
    }
    public void openUrl(){
        openAt("/");
    }

    public void inputUsername(String username){
        $(fieldUsername()).type(username);

    }
    public void  inputPassword(String password){
        $(password()).type(password);

    }
    public void clickLoginBtn(){
        $(loginButton()).click();

    }
    public void headerDisplayed(){
        $(headerProduct()).isDisplayed();

    }
    public void errorMessageDisplayed(){
        $(errorMessage()).isDisplayed();

    }
}
