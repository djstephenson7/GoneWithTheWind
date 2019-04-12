package com.company.library

class Library {
  def listBooks = Books.all

  def searchTitle(name: String, books: List[Book]): Option[Book] = {
    books.find(a => a.title == name)
  }

  def searchAuthor(name: String, books: List[Book]): Option[Book] = {
    books.find(a => a.author == name)
  }

  def searchISBN(name: String, books: List[Book]): Option[Book] = {
    books.find(a => a.ISBN == name)
  }

  def loan(name: String, books: List[Book]): Book = {
    books.find(a => a.title == name).getOrElse(Book("Title","Author","ISBN", false))
      .copy(onLoan = true)
  }
}

