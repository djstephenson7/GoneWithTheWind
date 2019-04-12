# Gone With The Wind

## Instructions

You have a library of books and are offering them to the world - you are lending so many books now that it is becoming hard to keep track of what you have.  You decided to use your programming fu to build an application which can keep track of them for you.

### Approach

* Read up on some of the principles of functional programming.
* Sought help and advice from the Makers online community and contacted other Makers to discuss our thought processes and answer each other's questions about Scala.
* Followed best Scala practices, such as keeping data as immutable as possible. For example, in the Book List, instead of adding the 'false' value to the end of every Book object in the list, I added a default value of false to the case class, as shown below:

<img width="603" alt="Screenshot 2019-04-12 at 11 13 38" src="https://user-images.githubusercontent.com/41509062/56030149-0cfac180-5d14-11e9-9838-d191fee4c67b.png">

### Challenges

* Getting stuck on getting Scala to do... anything! I tried to take the baby-est(?) of baby steps when writing functions, becoming increasingly basic in what I want them to achieve, eventually trying only to extract and display the book titles - Error! I try to interact with my code in the JVM to see how it's working - Error! I try to use a solution from StackOverflow - Error!

![Alt Text](https://media.giphy.com/media/l41m4JSpEcCX6jlUQ/giphy.gif)

In these scenarios, it really helped to discuss the problems and my thought process with other Makers, both my own personal contacts and reaching out to the Makers Alumni community on Slack! Stay awesome, guys!

#### Plans for implementing the remaining User Stories

I ran out  of time and hit a mental block. I know how I would solve the remaining challenges, it's just a matter of bending Scala to my will. Therefore, I included the steps I would take when implementing the remaining functions:

##### Lending books to visitors

This function is almost completed. The plan was to push an instance of the new, loaned book to a Loaned List, but I was unable to implement it without failing the tests:

<img width="703" alt="Screenshot 2019-04-12 at 11 02 29" src="https://user-images.githubusercontent.com/41509062/56030181-226feb80-5d14-11e9-9d56-e2b632274c6c.png">

##### Lending reference books

I can see no way of changing a few of the books to reflect their reference status without changing the immutable List to a ListBuffer. Therefore, I'd have to change it to a mutable list and include a case in the loan function that prevents a reference book from being borrowed:

<img width="740" alt="Screenshot 2019-04-12 at 11 04 32" src="https://user-images.githubusercontent.com/41509062/56030215-39164280-5d14-11e9-8f72-340a4b475c21.png">

<img width="486" alt="Screenshot 2019-04-12 at 11 08 52" src="https://user-images.githubusercontent.com/41509062/56030259-4df2d600-5d14-11e9-8b1e-666079f127c7.png">

<img width="686" alt="Screenshot 2019-04-12 at 11 08 14" src="https://user-images.githubusercontent.com/41509062/56030332-7c70b100-5d14-11e9-98fe-0f049b769c02.png">

##### Checking if a book is on loan

For this to work, the loanList val would have to removed from the loan method and placed in the Books.scala file. I would then implement a function that takes the book name as an argument and checks the loanList for the book and returns a Boolean:

<img width="424" alt="Screenshot 2019-04-12 at 11 30 01" src="https://user-images.githubusercontent.com/41509062/56031070-59470100-5d16-11e9-8326-817fe523435d.png">


##### Getting started

* clone the project
* import via IntelliJ IDEA

##### Requirements

* implements the user stories listed below (optional ones not required)
* compiles
* has tests
* frequent commits

##### User Stories

```text
As a visitor,
So that I can find books I am looking for,
I need to be able search books by partial title
```

```text
As a visitor,
So that I can find books I am looking for,
I need to be able search books by partial author
```

```text
As a visitor,
So that I can find books I am looking for,
I need to be able to search by full ISBN
```

```text
As a librarian,
So that I can help my community,
I need to be able to lend books to visitors
```

```text
As a librarian,
So that I can protect my expensive books,
I don't want to lend reference books
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know whether a book is available or on loan
```

---

##### Optional extra stories

```text
As a librarian,
So that I can update my stock levels,
I need to be able update the library when a book is returned
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know who has a book that is on loan
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know which books are late
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know who has a book that is late
```

```text
As a librarian,
So that I can manage my library correctly,
I want to fine users who are late returning their books

```
