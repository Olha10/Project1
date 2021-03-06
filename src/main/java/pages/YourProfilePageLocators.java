package pages;

import org.openqa.selenium.By;

public class YourProfilePageLocators {
    public By overviewProfileButton = (By.cssSelector("[class='UnderlineNav-body'] [aria-current='page']"));
    public By repositoriesButton = (By.cssSelector("[class='UnderlineNav-body'] [href='/Olha10?tab=repositories']"));
    public By editProfileButton = (By.cssSelector("[class='d-none d-md-block'] [class='hide-sm hide-md']"));
}
