package com.github.mperry.selenium.demo

//import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver


import org.scalatest.ShouldMatchers
import org.scalatest.selenium.WebBrowser
import org.scalatest.FlatSpec

/**
 * Created by MarkPerry on 2/08/2015.
 */
class BlogSpec extends FlatSpec with ShouldMatchers with WebBrowser {

	implicit val webDriver: WebDriver = new HtmlUnitDriver

	val host = "http://localhost:9000/"

	"The blog app home page" should "have the correct title" in {
		go to (host + "index.html")
		pageTitle should be ("Awesome Blog")
	}
}