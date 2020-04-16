package pages;

import org.openqa.selenium.By;

public class YourProjectsPage {

    public By yourProjectsButton = (By.cssSelector("[data-ga-click='Header, go to projects, text:your projects']"));
    public By newProjectButton = (By.cssSelector("[class='btn btn-primary d-block d-md-inline-block float-md-right text-center'] "));
    public By queryField = (By.id("query"));
    public By sortButton = (By.cssSelector("[class='btn-link select-menu-button icon-only']"));
}
