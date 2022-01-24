class Monads {
  val books = List(
    Book("Hunger Games", 374, Author("Suzanne", "Collins")),
    Book("Harry Potter and the Order of the Phoenix", 766, Author("JK", "Rowling")),
    Book("To Kill a Mockingbird", 281, Author("Harper", "Lee")),
    Book("Pride and Prejudice", 384, Author("Jane", "Austen")),
    Book("The Book Thief", 584, Author("Markus", "Zusak")),
    Book("Animal Farm", 112, Author("George", "Orwell"))
  )
}

case class Author(firstName: String, lastName: String)
case class Book(title: String, numberOfPages: Int, author: Author)
