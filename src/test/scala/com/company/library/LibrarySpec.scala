package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._


class LibrarySpec extends FunSuite {
  test("Display Books") {
    val library = new Library
    library.listBooks shouldBe a [List[_]]
  }

  test("Find book by full name") {
    val mockBookList: List[Book] = List(Book("mockName1", "mockAuthor1", "ISBN1"), Book("mockName2", "mockAuthor2", "ISBN2"))
    val library = new Library
    library.searchTitle("mockName1", mockBookList) shouldBe Some(Book("mockName1", "mockAuthor1", "ISBN1"))
    library.searchTitle("mockName2", mockBookList) shouldBe Some(Book("mockName2", "mockAuthor2", "ISBN2"))
    library.searchTitle("mockName3", mockBookList) shouldBe None
  }

  test("Find book by author") {
    val mockBookList: List[Book] = List(Book("mockName1", "mockAuthor1", "ISBN1"), Book("mockName2", "mockAuthor2", "ISBN2"))
    val library = new Library
    library.searchAuthor("mockAuthor1", mockBookList) shouldBe Some(Book("mockName1", "mockAuthor1", "ISBN1"))
    library.searchAuthor("mockAuthor2", mockBookList) shouldBe Some(Book("mockName2", "mockAuthor2", "ISBN2"))
    library.searchAuthor("mockAuthor3", mockBookList) shouldBe None
  }

  test("Find by full ISBN") {
    val mockBookList: List[Book] = List(Book("mockName1", "mockAuthor1", "ISBN1"), Book("mockName2", "mockAuthor2", "ISBN2"))
    val library = new Library
    library.searchISBN("ISBN1", mockBookList) shouldBe Some(Book("mockName1", "mockAuthor1", "ISBN1"))
    library.searchISBN("ISBN2", mockBookList) shouldBe Some(Book("mockName2", "mockAuthor2", "ISBN2"))
    library.searchISBN("ISBN3", mockBookList) shouldBe None
  }

  test("Loan book") {
    val mockBookList: List[Book] = List(Book("mockName1", "mockAuthor1", "ISBN1"), Book("mockName2", "mockAuthor2", "ISBN2"))
    val library = new Library
    library.loan("mockName1", mockBookList) shouldBe Book("mockName1", "mockAuthor1", "ISBN1", true)
  }
}
