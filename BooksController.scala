package controllers
import views.html.books.index
import  controllers.models.Book

import controllers.models.Book
import views.html.books

import javax.inject._
import play.api.mvc._
@Singleton
class BooksController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index_old() = Action { implicit request: Request[AnyContent] =>
    //var books = Book.allbooks()
    //return Ok(index(books))
    Ok(views.html.index())
  }


  def index() = Action { implicit request: Request[AnyContent] =>

    Ok("TODO")
  }
  def create() = Action { implicit request: Request[AnyContent] =>
    Ok("TODO")
  }
  def save() = Action { implicit request: Request[AnyContent] =>
    Ok("TODO")
  }
  def edit(Id: Integer) = Action { implicit request: Request[AnyContent] =>
    Ok("TODO")
  }
  def update() = Action { implicit request: Request[AnyContent] =>
    Ok("TODO")
  }
  def destroy(Id: Integer) = Action { implicit request: Request[AnyContent] =>
    Ok("TODO")
  }
  def show(Id: Integer) = Action { implicit request: Request[AnyContent] =>
    Ok("TODO")
  }





}
