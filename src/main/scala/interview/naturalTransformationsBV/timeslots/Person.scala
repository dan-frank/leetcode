package interview.naturalTransformationsBV.timeslots

/** A person who has scheduled meetings.
  *
  * @constructor
  *   creates a new person with a name and schedule
  * @param name
  *   the person's name
  * @param schedule
  *   the person's schedule
  */
case class Person(name: String, schedule: List[(Int, Int)])
