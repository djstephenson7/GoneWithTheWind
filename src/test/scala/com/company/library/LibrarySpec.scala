package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._


class LibrarySpec extends FunSuite {
  test("Display Books") {
    val library = new Library
    library.list_books shouldBe a [List[_]]
  }

  test("Find book by full name") {
    val mockBookList: List[Book] = List(Book("mockName1", "mockAuthor1", "ISBN1"), Book("mockName2", "mockAuthor2", "ISBN2"))
    val library = new Library
    library.search_title("mockName1", mockBookList) shouldBe Some(Book("mockName1", "mockAuthor1", "ISBN1"))
    library.search_title("mockName2", mockBookList) shouldBe Some(Book("mockName2", "mockAuthor2", "ISBN2"))
    library.search_title("mockName3", mockBookList) shouldBe None
  }

  test("Find book by author") {
    val mockBookList: List[Book] = List(Book("mockName1", "mockAuthor1", "ISBN1"), Book("mockName2", "mockAuthor2", "ISBN2"))
    val library = new Library
    library.search_author("mockAuthor1", mockBookList) shouldBe Some(Book("mockName1", "mockAuthor1", "ISBN1"))
    library.search_author("mockAuthor2", mockBookList) shouldBe Some(Book("mockName2", "mockAuthor2", "ISBN2"))
    library.search_author("mockAuthor3", mockBookList) shouldBe None
  }
}
