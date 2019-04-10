package com.company.library

class Library {
  def list_books = Books.all

  def search_title(name: String, books: List[Book]): Option[Book] = {
    books.find(a => a.title == name)
  }

  def search_author(name: String, books: List[Book]): Option[Book] = {
    books.find(a => a.author == name)
  }

  def search_isbn(name: String, books: List[Book]): Option[Book] = {
    books.find(a => a.ISBN == name)
  }
}

