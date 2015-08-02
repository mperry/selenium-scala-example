package com.github.selenium.demo

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, ShouldMatchers}
import org.scalatest.selenium.HtmlUnit

/**
 * Created by MarkPerry on 2/08/2015.
 */
@RunWith(classOf[JUnitRunner])
class BlogSpec extends FlatSpec with ShouldMatchers with HtmlUnit {

	"The Google home page" should "have the correct title" in {
		go to ("http://www.google.com/")
		pageTitle should be ("Google")
	}


}