package interview.naturalTransformationsBV.notifications

import scala.io.Source

/** A collection of file reading methods.
  */
object ReadFile {

  /** Reads a file from notifications folder in resources.
    *
    * @param filename
    *   the name of the file to read
    * @return
    *   A list of strings containing each line of the file
    */
  def readFileFromResources(filename: String): List[String] =
    val file = Source.fromResource(
      "interview/naturalTransformationsBV/notifications/" + filename
    );
    file.getLines.toList

  /** Splits each line of the string into a List contining ID, Question/Name,
    * Tags.
    *
    * @param strings
    *   a read file as a List of strings
    * @param splitter
    *   what to split each line one
    * @return
    *   a List containing a List[String] of each user/question
    */
  def splitListStrings(
      strings: List[String],
      splitter: String
  ): List[List[String]] =
    strings.map(string => string.split(splitter).map(_.trim).toList)
}
