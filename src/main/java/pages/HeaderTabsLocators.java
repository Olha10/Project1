package pages;

import org.openqa.selenium.By;

public class HeaderTabsLocators {
    public By headerTabPullRequests = (By.cssSelector("[aria-label='Pull requests you created']"));
    public By headerTabIssues = (By.cssSelector("[aria-label='Issues you created']"));
    public By headerTabMarketplace = (By.cssSelector("[aria-label='Global'] [href='/marketplace']"));
    public By headerTabExplore = (By.cssSelector("[aria-label='Global'] [href='/explore']"));
    public By profileAndMoreMenuButton = (By.cssSelector("[aria-label='View profile and more']"));
}
