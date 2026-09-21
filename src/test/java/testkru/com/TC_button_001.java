package testkru.com;

import org.testng.annotations.Test;

import testkruPages.ButtonPage;

public class TC_button_001 extends BaseClassTestKru {

    @Test
    public void sideBarButton() {

        logger.info("===== Test Started: sideBarButton =====");

        ButtonPage bp = new ButtonPage(driver);

        logger.info("ButtonPage object created");

        bp.sidebarElements();

        bp.sidebarButton();

        logger.info("===== Test Passed: sideBarButton =====");
    }
}