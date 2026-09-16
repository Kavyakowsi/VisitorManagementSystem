package com.example.visitormanagementsystem;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.*;

public class VisitorManagementSystemApplicationTests {

    private static Playwright playwright;
    private static Browser browser;
    private Page page;

    @BeforeAll
    static void setUp() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
    }

    @BeforeEach
    void createPage() {

        page = browser.newPage();
        page.setDefaultTimeout(30000);
    }

    @Test
    void test() {

        page.navigate("http://localhost:8085/VisitorSystem/");

        page.waitForTimeout(3000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visitor")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Name")).fill("Ashwanth");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Phone")).fill("7200834646");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).fill("ashu@gmail.com");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Address")).fill("pondi");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Id Proof")).fill("PAN-1234903");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Visit Date")).fill("17-09-2026");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Check In Time")).fill("12:00 AM");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Reason")).fill("Project Discussion");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Person To Meet")).fill("Dhivanan");

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ok")).click();

        page.waitForTimeout(3000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Menu")).click();

        page.waitForTimeout(1000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Manager")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Visitor Id")).fill("6");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Decision")).fill("ACCEPT");

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SUBMIT")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ok")).click();

        page.waitForTimeout(3000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Menu")).click();

        page.waitForTimeout(1000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visitor")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Id")).fill("6");

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Button")).click();

        page.waitForTimeout(3000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Menu")).click();

        page.waitForTimeout(1000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Manager")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();

        page.waitForTimeout(3000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Menu")).click();

        page.waitForTimeout(1000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Security")).click();

        page.waitForTimeout(3000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();

        page.waitForTimeout(3000);

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Visitor Id")).fill("6");

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SUBMIT")).click();

        page.waitForTimeout(2000);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ok")).click();

        page.waitForTimeout(3000);
    }

    @AfterEach
    void tearDown() {

        if (page != null) {
            page.close();
        }
    }

    @AfterAll
    static void closeBrowser() {

        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }
    }
}