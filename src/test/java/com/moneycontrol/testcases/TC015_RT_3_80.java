package com.moneycontrol.testcases;

import org.testng.annotations.Test;

import com.moneycontrol.init.CommonConfig;
import com.moneycontrol.pages.Hamburger;
import com.moneycontrol.pages.Homepage;
import com.moneycontrol.pages.NewsPage;

public class TC015_RT_3_80 extends CommonConfig{

	@Test(description = "Validate when user tap on Ad Creative")
	public void Test_RT_3_80() throws InterruptedException {
		Homepage homepage = new Homepage(aDriver);
		Hamburger hamburger = new Hamburger(aDriver);
		NewsPage newsPage = new NewsPage(aDriver);

		homepage.launchApp();
		
		//Tap on 'Hamburger' Menu in the 'Home' screen
		 homepage.tapOnHamburgerMenu();
		 
		 // Tap on 'Top News' under 'News' section
		 hamburger.tapOnTopNewsPresentInNews();
		 
		 //Tap on the 'Top banner' ad which is present under 'Top News' screen
		 String currentActivity = newsPage.tapOnTopBannerAd();
		 
		 /*Ad Creative landing page can be
		 a) URL or
		 b) Playstore or
		 c) Native app */
		 homepage.verifyAd(currentActivity);
	}
}
