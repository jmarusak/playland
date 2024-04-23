package controllers

import javax.inject._

import play.api.mvc.{Action, AnyContent, AbstractController, ControllerComponents}

@Singleton
class WebServices @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def listProduct(): Action[AnyContent] = Action {
    play.api.mvc.Results.NoContent
  }
}
