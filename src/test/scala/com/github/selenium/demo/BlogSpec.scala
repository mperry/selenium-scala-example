package com.github.selenium.demo

import org.scalatest.{FlatSpec, ShouldMatchers}
import org.scalatest.selenium.HtmlUnit

/**
 * Created by MarkPerry on 2/08/2015.
 */
class BlogSpec extends FlatSpec with ShouldMatchers with HtmlUnit {

//	implicit val webDriver: WebDriver = new HtmlUnitDriver

	val host = "http://www.google.com/"

	"The blog app home page" should "have the correct title" in {
		go to (host)
		pageTitle should be ("Google")
	}


}