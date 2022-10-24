package interview.naturalTransformationsBV.notifications

import interview.naturalTransformationsBV.notifications.ReadFile.{
  readFileFromResources,
  splitListStrings
}

/** Notification handler for users when question is posted.
  *
  * @constructor
  *   create a new handler for a set of users.
  * @param users
  *   a list of users
  */
class NotificationsSolution(users: List[List[String]]) {

  /** Finds users to notify.
    *
    * @param question
    *   the question to notify users about
    * @return
    *   a collection of users to notify
    */
  def getUsers(question: List[String]): List[List[String]] =
    users.filter(user =>
      user.last
        .split("\\|")
        .map(_.trim)
        .toList
        .exists(question.last.contains(_))
    )

  /** Notifies users of newly posted question.
    *
    * @param question
    *   the question to notify users about
    */
  def notifyUsers(question: List[String]): Unit =
    val notify = getUsers(question)

    for (user <- notify) {
      val name = user(1)
      println(f"notifying user $name...")
    }
}
