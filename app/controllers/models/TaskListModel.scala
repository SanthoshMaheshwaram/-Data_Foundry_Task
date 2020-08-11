package controllers.models
import collection.mutable

object TaskListModel {

  private val users = mutable.Map[String, String]("Mark" -> "pass")
  def validateuser(username: String, password: String): Boolean = {
    users.get(username).map(_ == password).getOrElse(false)
  }

  def createuser(username: String, password: String): Boolean = ???

  def gettasks(username: String, password: String): Boolean = ???

  def addtasks(username: String, password: String): Boolean = ???

  def removetasks(username: String, password: String): Boolean = ???

}
