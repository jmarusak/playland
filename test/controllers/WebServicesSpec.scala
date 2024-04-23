package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

/**
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class WebServicesSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "GET" should {
    "new instance of controller should return NO_CONTENT" in {
      val controller = new WebServices(stubControllerComponents())
      val response = controller.listProduct().apply(FakeRequest(GET, "/v1/products"))

      status(response) mustBe NO_CONTENT 
      contentType(response) mustBe None 
    }

    "route shout return NO_CONTENT" in {
      val request = FakeRequest(GET, "/v1/products")
      val response = route(app, request).get

      status(response) mustBe NO_CONTENT 
      contentType(response) mustBe None 
    }
  }
}
