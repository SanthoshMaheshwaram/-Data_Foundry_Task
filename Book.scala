package controllers.models
import scala.collection.immutable.HashSet

//case class Book {
//      var id:Int
//      var title:String
//      var price:Int
//      var author:String

//       def book(id: Int, title: String, price: Int, author: String) {
//         this.id = id
//         this.title = title
//         this.price = price
//         this.author = author
//       }

case class Book(id: Int, title: String, price: Int, author: String)
{

  //object Book {
    //def main(args: Array[String]) {
        //val book1 = new Book()
        //book1.Book(1,"Honor",20,"Robin")
        val books = List(Book(1,"honor",20,"Robin"), Book(2,"Pride",30,"Sharma"))
  //}}
    //def allbooks(): Unit ={
     //   books
    //}
  def allbooks(){
    books
  }
    def findbyid(id: Int): Unit = {
      for(i<- books){
          if(id.equals(i.id)){
            i
          }
        else{ return null}

      }

      def addbook(id: Int, title: String, price: Int, author: String): Unit ={
        val books = List.concat(List(Book(1,"honor",20,"Robin"), Book(2,"Pride",30,"Sharma")) , List(id, title, price, author))
      }

      //def removebook(id: Int, title: String, price: Int, author: String) = {
//        val books = books-List(id, title, price, author)

//      }

    }

}
