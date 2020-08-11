package controllers
import controllers.models.TaskListModel
import javax.inject._
import play.api.mvc._

@Singleton
class TaskList1 @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def Task0() = TODO

  def Task1() = Action {
    Ok("I am from Action request")
  }

  def index1() = Action { implicit request: Request[AnyContent] =>
    val tasks = List("task1", "task2", "task3")
    Ok(views.html.TaskList1(tasks))
  }

  def login() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.Login1())
  }

  def validatelogin(username: String, password: String) = Action { implicit request: Request[AnyContent] =>
    Ok(s"you have logged in as: $username and your password: is $password")
  }

  def validatepost()= Action { request =>
    val postvals = request.body.asFormUrlEncoded
    postvals.map{ args =>
      val username =args("username").head
      val password =args("password").head
      Ok(s"you have logged in as: $username and your password: is $password")
      if (TaskListModel.validateuser(username, password)) {
        Redirect(routes.TaskList1.index1())
      } else
        Redirect(routes.TaskList1.login())
    }.getOrElse(Redirect(routes.TaskList1.login()))
  }

  def student(name: String, id: Int) = Action{
    Ok(s"Student name is: $name and id is: $id")
  }

}

