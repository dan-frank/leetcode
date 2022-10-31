# Leetcode Questions

Personal archive for answered, unanswered, and failed leetcode and interview questions that I have attempted or want to attempt.

## Usage

The best method to use this archive is with the [archive section](#archive).
Here you can find quick links to my solutions and to the problem itself.
I have included the name of the Leetcode problem so you can easily find it with a search in your browser of choice.

If you hate documentation, you can also navigate to [`src/main/scala`](src/main/scala) and find all of the solutions.

I have written test cases for (most of) the solutions, and these can be found under [`src/test/scala`](src/test/scala/).

The majority of solutions have been resolved with Scala, managed and tested with `sbt` (which also handles Java solutions).
However, a few other languages can be found that cannot be handled by `sbt`; these will need to be run seperately, likely inside the Leetcode editor.

As the archive has been setup with `sbt`, you can use `sbt` commands.
Compile the code with `sbt compile`, test with `sbt test`, and `sbt console` will start a Scala 3 REPL.

Due to the nature of this project there are no main methods for running the code, and as such `sbt run` won't produce any meaningful results.
If you want to extend this project yourself, I recommend introducing and running more test cases.

## Archive Key

| :old_key:          | Description        | Completed |
| ------------------ | ------------------ | --------- |
| :white_check_mark: | Completed          | 20        |
| :construction:     | In Progress        | 2         |
| :x:                | Failed             | 0         |
| :green_circle:     | Easy Question      | 18        |
| :orange_circle:    | Medium Question    | 1         |
| :red_circle:       | Hard Question      | 0         |
| :speaking_head:    | Interview Question | 3         |

## Archive

| ID                                                                       | Status             | Name                                | Rigor           | File                                                                                                | Language | Attempted  | Completed  |
| ------------------------------------------------------------------------ | ------------------ | ----------------------------------- | --------------- | --------------------------------------------------------------------------------------------------- | -------- | ---------- | ---------- |
| [69](https://leetcode.com/problems/sqrtx/)                               | :construction:     | Sqrt(x)                             | :green_circle:  | [View](src/main/scala/easy/SqrtXSolution.scala)                                                     | Scala    | 2022-10-31 |            |
| [66](https://leetcode.com/problems/plus-one/)                            | :white_check_mark: | Plus One                            | :green_circle:  | [View](src/main/scala/easy/PlusOneSolution.scala)                                                   | Scala    | 2022-10-26 | 2022-10-26 |
| [26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | :white_check_mark: | Remove Duplicates from Sorted Array | :green_circle:  | [View](src/main/scala/easy/RemoveDuplicatesFromSortedArraySolution.scala)                           | Scala    | 2022-10-24 | 2022-10-25 |
| [21](https://leetcode.com/problems/merge-two-sorted-lists/)              | :white_check_mark: | Merge Two Sorted Lists              | :green_circle:  | [View](src/main/scala/easy/MergeTwoSortedListsSolution.scala)                                       | Scala    | 2022-10-24 | 2022-10-24 |
| [20](https://leetcode.com/problems/valid-parentheses/)                   | :white_check_mark: | Valid Parentheses                   | :green_circle:  | [View](src/main/scala/easy/ValidParenthesesSolution.scala)                                          | Scala    | 2022-10-23 | 2022-10-24 |
| [14](https://leetcode.com/problems/longest-common-prefix/description/)   | :white_check_mark: | Longest Common Prefix               | :green_circle:  | [View](src/main/scala/easy/LongestCommonPrefixSolution.scala)                                       | Scala    | 2022-10-23 | 2022-10-23 |
| [13](https://leetcode.com/problems/roman-to-integer/)                    | :white_check_mark: | Roman to Integer                    | :green_circle:  | [View](src/main/scala/easy/RomanToIntegerSolution.scala)                                            | Scala    | 2022-10-22 | 2022-10-22 |
| [136](https://leetcode.com/problems/single-number/)                      | :white_check_mark: | Single Number                       | :green_circle:  | [View](src/main/scala/easy/SingleNumberSolution.scala)                                              | Scala    | 2022-10-22 | 2022-10-22 |
| [1](https://leetcode.com/problems/two-sum/)                              | :white_check_mark: | Two Sum                             | :green_circle:  | [View](src/main/scala/easy/TwoSumSolution.scala)                                                    | Scala    | 2022-10-21 | 2022-10-21 |
| [PDF](src/main/scala/interview/naturalTransformationsBV/questions.pdf)   | :white_check_mark:️ | User Notifications                  | :speaking_head: | [View](src/main/scala/interview/naturalTransformationsBV/notifications/NotificationsSolution.scala) | Scala    | 2022-07-10 | 2022-07-10 |
| [PDF](src/main/scala/interview/naturalTransformationsBV/questions.pdf)   | :white_check_mark:️ | Concept of Availability             | :speaking_head: | [View](src/main/scala/interview/naturalTransformationsBV/timeslots/TimeSlotsSolution.scala)         | Scala    | 2022-07-10 | 2022-07-10 |
| N/A                                                                      | :white_check_mark:️ | Find Longest Subarray by Sum        | :speaking_head: | [View](src/main/scala/interview/unknown/findLongestSubarrayBySum.c)                                 | C        | 2021       | 2021       |
| [1534](https://leetcode.com/problems/count-good-triplets/)               | :white_check_mark: | Count Good Triplets                 | :green_circle:  | [View](src/main/scala/easy/CountGoodTriplets.java)                                                  | Java     | 2020-12-13 | 2020-12-18 |
| [2](https://leetcode.com/problems/add-two-numbers/)                      | :white_check_mark: | Add Two Numbers                     | :orange_circle: | [View](src/main/scala/medium/AddTwoNumbers.java)                                                    | Java     | 2020-12-11 | 2020-12-11 |
| [27](https://leetcode.com/problems/remove-element/)                      | :construction:     | Remove Element                      | :green_circle:  |                                                                                                     |          |            |            |
| [283](https://leetcode.com/problems/move-zeroes/)                        | :white_check_mark: | Move Zeroes                         | :green_circle:  | [View](src/main/scala/easy/MoveZeroes.java)                                                         | Java     | 2020-08-29 | 2020-08-29 |
| [326](https://leetcode.com/problems/power-of-three/)                     | :white_check_mark: | Power of Three                      | :green_circle:  | [View](src/main/scala/easy/PowerOfThree.java)                                                       | Java     | 2020-03-07 | 2020-03-07 |
| [344](https://leetcode.com/problems/reverse-string/)                     | :white_check_mark: | Reverse String                      | :green_circle:  | [View](src/main/scala/easy/ReverseString.java)                                                      | Java     | 2020-03-06 | 2020-03-06 |
| [350](https://leetcode.com/problems/intersection-of-two-arrays-ii/)      | :white_check_mark: | Intersection of Two Arrays II       | :green_circle:  | [View](src/main/scala/easy/IntersectionOfArraysII.java)                                             | Java     | 2020-03-06 | 2020-03-06 |
| [371](https://leetcode.com/problems/sum-of-two-integers/)                | :white_check_mark:️ | Sum of Two Integers                 | :green_circle:  | [View](src/main/scala/easy/SumOfTwoIntegersSolution.scala)                                          | Scala    | 2020-03-06 | 2022-10-21 |
| [387](https://leetcode.com/problems/first-unique-character-in-a-string/) | :white_check_mark: | First Unique Character in a String  | :green_circle:  | [View](src/main/scala/easy/FirstUniqueCharInString.java)                                            | Java     | 2020-03-05 | 2020-03-05 |
| [412](https://leetcode.com/problems/fizz-buzz/)                          | :white_check_mark: | Fizz Buzz                           | :green_circle:  | [View](src/main/scala/easy/Fizzbuzz.java)                                                           | Java     | 2020-03-05 | 2020-03-05 |

_All questions have been answered by me and me alone; shared to be used for referance._
