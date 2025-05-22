package Selenium_Studyings1Em;

public class general {
    /*
        //accept cookies
        WebElement cookies = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
        cookies.click();

        WebElement drop = driver.findElement(By.id("searchDropdownBox"));
        drop.click();

     driver.switchTo().alert().accept();//if we accept
    driver.switchTo().alert().dismiss();// if we ignore

        FRAME İÇİNE TEXT GÖNDERME
        //1 iframe locate et
        WebElement iframe = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframe);//DRİVER İFRAME İÇİNE GİRDİ

        WebElement sendtext = driver.findElement(By.tagName("p"));
        Thread.sleep(2000);
        sendtext.clear();//yazı varsa iinde siler önce

        Thread.sleep(2000);
        String text = "helllo world  again  ";
        Thread.sleep(2000);
        sendtext.sendKeys(text);
        //3 driveri iframeden çıkarma
        //3.1 bir üstdseviyede frame çıkartan
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        //3.2 bir EN üstdseviyede frame çıkartan
        driver.switchTo().defaultContent();
       //liste ata array olarak
        List<String> tabS = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabS.size());
        //ilk sayfaya geri döner 2 sayfa bile olsa sayfaalr 0 dan başlar
        driver.switchTo().window(tabS.get(0));
        Thread.sleep(2000);
        //ikinci sayfaya geçer
        driver.switchTo().window(tabS.get(1));
        //stands still on "hello" TEXT

        WebElement hellotext = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hellotext).perform();

            //to watch video
        // firstly, find iframe locator
        WebElement iframe = driver.findElement(By.xpath("//iframe[1]"));
        driver.switchTo().frame(iframe);//here Driver is inside IFRAME
            String html="https://admin:admin@the-internet.herokuapp.com";
        driver.get(html+parturl);
          WebElement upload = driver.findElement(By.id("file-upload"));

        //filepath will be chosen
        String chosenfilepath = "\\Downloads\\sampleFile.jpeg";
        String mainpath = System.getProperty("user.home") + chosenfilepath;
        //dosyasendkeys ile entegre edilcek
        upload.sendKeys(mainpath);
//upload edilcek
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);
//FİLE UPLOADED TEXTİNİ ALMA VE DOĞRULAMA
        String actual = driver.findElement(By.xpath("//h3[.='File Uploaded!']")).getText();
        String expected = "File Uploaded!";
        // it waits for definitly( Duration.ofSeconds)time if can't find but if finds it before definitly time it works
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  WebElement button = new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));

 */
}
