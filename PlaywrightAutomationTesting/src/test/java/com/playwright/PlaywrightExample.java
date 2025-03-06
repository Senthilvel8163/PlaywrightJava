package com.playwright;
import com.microsoft.playwright.*;

public class PlaywrightExample {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.google.com");
            
            // Keep browser open for a while to see the result
            Thread.sleep(5000);
            
            browser.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}