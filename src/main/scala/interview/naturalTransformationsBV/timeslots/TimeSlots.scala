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

/** Availability timetable between two people.
  *
  * @constructor
  *   create a new timetable based on availability of provided people
  * @param person1
  *   one of the people to compare timetable availabilty too
  * @param person2
  *   one of the people to compare timetable availabilty too
  */
case class TimeSlots(person1: Person, person2: Person):
  /** Calculates a free meeting slot from the availabiltiy of 2 people. This
    * processes only hours for simplity. We also assume only the use of
    * "working" hours of 09:00 -> 17:00.
    *
    * @return
    *   available meeting slots
    */
  def freetime: List[(Int, Int)] =
    val allMeetingsSlots = ((9 to 16) zip (10 to 17)).toList
    val usedMeetingsSlots: List[(Int, Int)] =
      (person1.schedule ::: person2.schedule)
        .flatMap((start, end) =>
          if end - start > 1 then
            ((start to end - 1) zip (start + 1 to end)).toList
          else List((start, end))
        )
        .toSet
        .toList
        .sortWith(_._1 < _._1)

    allMeetingsSlots diff usedMeetingsSlots
