// Question 1.
def even(num : Int) : Boolean ={
    return num%2==0
}
even(1)
even(2)

// Question 2.
def contains_even(nums : List[Int]) : Boolean = {
    for(i<-nums){
        if(i%2 == 0)
           return true
    }
    return false
}
val nurms : List[Int] = List(1,2,3,4)
contains_even(nurms)
contains_even(List(1,1,1,3))

// Question 3
// Lucky number 7. Take in a list of numbers and calculate
// their sum. Unless it is a 7, 7s count twice because they
// are lucky, so when it's 7 you add 14.
def lucky_seven(nums : List[Int]) : Int = {
    var sum : Int = 0
    for(i<-nums){
    sum +=i
    if(i==7)       
       sum +=i
       }
   }
