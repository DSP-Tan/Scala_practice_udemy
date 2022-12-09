// 1
printf("--------------------------------------\n")
printf("Question 1\n")
printf("%f\n", math.pow(2,5))
printf("--------------------------------------\n\n\n")

// 2
printf("--------------------------------------\n")
printf("Question 2\n")
printf("%d\n",180%7)
printf("--------------------------------------\n\n\n")

// 3
printf("--------------------------------------\n")
printf("Question 3\n")
var pet_name="Sammy"
printf("My dog's name is %s\n",pet_name)
val pet_string=f"My dog's name is ${pet_name}"
println(pet_string)
printf("--------------------------------------\n\n\n")

// 4
// Use scala to find out if the letter sequence "xyz" is contained in:
// "sadfjshfjyuyxyzjkfuidkjklhasyysdfk"
printf("--------------------------------------\n")
printf("Question 4\n")
val test_string   : String = "sadfjshfjyuyxyzjkfuidkjklhasyysdfk"
val search_string : String = "xyz"
val ans: Boolean = test_string contains search_string
printf("The search string is in the test string: %b\n", ans)
printf("--------------------------------------\n\n\n")

// 5
printf("--------------------------------------\n")
printf("Question 5\n")
printf("Question?\nWhat is the difference between a value and a variable?")
printf("Answer:\nA variable can be reassigned, a value cannot.")
// What is the difference between a value and a variable?
// A variable can be reassigned, a value cannot.
printf("--------------------------------------\n\n\n")

// 6
printf("--------------------------------------\n")
printf("Question 6\n")
val Tupelo : (Int, Int, Int, (Int, Int, Int ) ) = (1,2,3,(4,5,6))
printf("Here's the first element: %d\n", Tupelo._1)
val three_o_four = Tupelo._4._3
printf("Here's the third element of the fourth element, a tuple: %d\n", three_o_four )
printf("--------------------------------------\n\n\n")
printf("\n\n")
