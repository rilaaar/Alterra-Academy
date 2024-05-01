package starter.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    private By sideBar(){
        return By.id("react-burger-menu-btn");
    }
    private  By aboutButton(){
        return By.id("about_sidebar_link");
    }
    private By aboutPage(){
        return By.xpath("//h2[@class = 'title is-1']");
    }
    private By logoutButton(){
        return By.id("logout_sidebar_link");
    }
    private  By loginPage(){
        return By.xpath("//div[@class = 'bot_column']");
    }
    private By detailProduct(){
        return By.xpath("//div[@class = 'inventory_item_container']");
    }
    private By pProduct(){
        return By.id("item_4_img_link");
    }
    private By nProduct(){
        return By.xpath("//div[@class = 'inventory_item_name']");
    }
    private By cartButton(){
        return By.id("shopping_cart_container");
    }
    private By sortButton(){
        return By.xpath("//select[@class = 'product_sort_container']");
    }
    private By sortName(){
        return By.xpath("//option[@value ='az']");
    }
    private By sortPrice(){
        return By.xpath("//option[@value ='lohi']");
    }
    private By listProductAz(){
        return By.xpath("//div[@class = 'inventory_item_name']");
    }
    private By listProductPrice(){
        return By.xpath("//div[@class = 'inventory_item_price']");
    }
    private By cartLink(){
        return By.xpath("//a[@class = 'shopping_cart_link']");
    }
    private By cartPage(){
        return By.xpath("//div[@class = 'header_secondary_container']");
    }

    public void cartPageMenu(){
        $(cartPage()).isDisplayed();
    }
    public void clickCartLink(){
        $(cartLink()).click();
    }
    public void sortProductPrice(){
        $(listProductPrice()).isDisplayed();
    }
    public void sortProductAz(){
        $(listProductAz()).isDisplayed();
    }
    public void clickSortPrice(){
        $(sortPrice()).click();
    }
    public void clickSortName(){
        $(sortName()).click();
    }
    public void clickSortButton(){
        $(sortButton()).click();
    }
    public void clickCartButton(){
        $(cartButton()).click();
    }
    public void nameProduct(){
        $(nProduct()).click();
    }

    public void loginLogoPage(){
        $(loginPage()).isDisplayed();
    }
    public void photoProduct(){
        $(pProduct()).click();
    }
    public void detailPageProduct(){
        $(detailProduct()).isDisplayed();

    }
    public void clickLogoutButton(){
        $(logoutButton()).click();
    }
    public void clickSidebar(){
        $(sideBar()).click();
    }
    public void clickAboutButton(){
        $(aboutButton()).click();
    }
    public void aboutDisplayed(){
        $(aboutPage()).isDisplayed();
    }

}
