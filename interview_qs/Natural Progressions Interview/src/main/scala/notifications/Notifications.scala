package notifications

import scala.io.Source

/** A collection of file reading methods.
 */
object ReadFile:
    /** Reads a file from notifications folder in resources.
     * 
     * @param filename the name of the file to read
     * @return A list of strings containing each line of the file
     */
    def readFileFromResources(filename: String): List[String] =
        val file = Source.fromResource("notifications/" + filename);
        file.getLines.toList

    /** Splits each line of the string into a List contining ID, Question/Name, Tags.
     * 
     * @param strings a read file as a List of strings
     * @param splitter what to split each line one
     * @return a List containing a List[String] of each user/question
     */
    def splitListStrings(strings: List[String], splitter: String): List[List[String]] =
        strings.map(
            string => string.split(splitter).map(_.trim).toList
        )

/** Notification handler for users when question is posted.
 * 
 * @constructor create a new handler for a set of users.
 * @param users a list of users
 */
class Notifications(users: List[List[String]]):
    /** Finds users to notify.
     * 
     * @param question the question to notify users about
     * @return a collection of users to notify
     */
    def getUsers(question: List[String]): List[List[String]] =
        users.filter(
            user => 
                user.last
                    .split("\\|").map(_.trim).toList
                    .exists(question.last.contains(_))
        )

    /** Notifies users of newly posted question.
     * 
     * @param question the question to notify users about
     */
    def notifyUsers(question: List[String]): Unit =
        val notify = getUsers(question)

        for (user <- notify) {
            val name = user(1)
            println(f"notifying user $name...")
        }
    
/** Demo | Finding users for questions.
 */
@main def run(): Unit =
    import ReadFile.{readFileFromResources, splitListStrings}

    val users = splitListStrings(readFileFromResources("users.txt"), ",")
    val questions = splitListStrings(readFileFromResources("questions.txt"), ",")

    val notifications = Notifications(users)
    notifications.notifyUsers(questions.head)
    