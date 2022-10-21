package interview.naturalTransformationsBV.timeslots

import munit.FunSuite

class TimeSlotsSuite extends FunSuite:
  test("Free meetings") {
    val person1 = Person(
      "Dave #1",
      List(
        (9, 11),
        (14, 15)
      )
    )
    val person2 = Person(
      "Dave #2",
      List(
        (10, 11),
        (12, 13),
        (14, 15)
      )
    )

    val actualFreetime: List[(Int, Int)] = List(
      (11, 12),
      (13, 14),
      (15, 16),
      (16, 17)
    )

    val timeslots = TimeSlots(person1, person2)
    assert(timeslots.freetime == actualFreetime)
  }

  test("No free meetings one person") {
    val person1 = Person(
      "Dave #1",
      List(
        (9, 17)
      )
    )
    val person2 = Person("Dave #2", List())

    val actualFreetime: List[(Int, Int)] = List()

    val timeslots1 = TimeSlots(person1, person2)
    val timeslots2 = TimeSlots(person2, person1)

    assert(timeslots1.freetime == actualFreetime)
    assert(timeslots2.freetime == actualFreetime)
  }

  test("No free meetings 2 people") {
    val person1 = Person(
      "Dave #1",
      List(
        (9, 13)
      )
    )
    val person2 = Person(
      "Dave #2",
      List(
        (13, 17)
      )
    )
    val person3 = Person(
      "Dave #3",
      List(
        (9, 10),
        (12, 13),
        (14, 17)
      )
    )
    val person4 = Person(
      "Dave #4",
      List(
        (10, 12),
        (13, 14)
      )
    )

    val actualFreetime: List[(Int, Int)] = List()

    val timeslots1 = TimeSlots(person1, person2)
    val timeslots2 = TimeSlots(person3, person4)

    assert(timeslots1.freetime == actualFreetime)
    assert(timeslots2.freetime == actualFreetime)
  }
