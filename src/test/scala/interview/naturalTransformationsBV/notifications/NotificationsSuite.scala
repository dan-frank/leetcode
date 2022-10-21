package interview.naturalTransformationsBV.notifications

import munit.FunSuite
import ReadFile.{readFileFromResources, splitListStrings}

class NotificationsSuite extends FunSuite:
  test("Scala & Java tagged question returns Scala & Java users") {
    val users = splitListStrings(readFileFromResources("users.txt"), ",")
    val questions =
      splitListStrings(readFileFromResources("questions.txt"), ",")

    val notifications = Notifications(users)

    val expectedUsers: List[List[String]] = List(
      List("1", "Dave", "scala|java"),
      List("3", "Eric", "scala")
    )

    assert(notifications.getUsers(questions.head) == expectedUsers)
  }

  test("HTML & CSS tagged question returns HTML & CSS users") {
    val users = splitListStrings(readFileFromResources("users.txt"), ",")
    val questions =
      splitListStrings(readFileFromResources("questions.txt"), ",")

    val notifications = Notifications(users)

    val expectedUsers: List[List[String]] = List(
      List("2", "Steve", "css")
    )

    assert(notifications.getUsers(questions(2)) == expectedUsers)
  }

  test("Java tagged question returns Java users") {
    val users = splitListStrings(readFileFromResources("users.txt"), ",")
    val questions =
      splitListStrings(readFileFromResources("questions.txt"), ",")

    val notifications = Notifications(users)

    val expectedUsers: List[List[String]] = List(
      List("1", "Dave", "scala|java")
    )

    assert(notifications.getUsers(questions(3)) == expectedUsers)
  }
