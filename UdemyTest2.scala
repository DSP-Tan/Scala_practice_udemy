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
    return sum
    }
val unlucky : List[Int] = List(1,2,3,4,5)
val lucky : List[Int]   = List(1,7)
println(lucky_seven(unlucky))
println(lucky_seven(lucky))
// 5.) Can you Balance?
// Given a non-empty list of integers, return true if there is a place to
// split the list so that the sum of the numbers on one side
// is equal to the sum of the numbers on the other side. For example, given the
// list (1,5,3,3) would return true, you can split it in the middle. Another
// example (7,3,4) would return true 3+4=7. Remember you just need to return the
// boolean, not the split index point.

// To do this we need to check every point in the list and see if the sum of the numbers
// before is equal to the sum of the numbers after. If we find this to be true, break,
// if not keep searching, and if never found by end of search, return false.

def balance(nums : List[Int]) : Boolean = {
    var count=0
    for(i<-nums){
       if(nums.slice(0,count).sum == nums.slice(count,nums.size).sum)
           return true
       count +=1
       }
    return false
    }
val blncd   : List[Int] = List(1,5,3,3)
val blncd2  : List[Int] = List(7,3,4)
val unblncd  : List[Int] = List(7,3,4,1)
println(balance(unlucky))
println(balance(blncd))
println(balance(blncd2))
println(balance(unblncd))

//6.) Palindrome Check
//Given a String, return a boolean indicating whether or not it is a palindrome.
//(Spelled the same forwards and backwards). Try exploring methods to help you.
def palindrome(word : String) : Boolean ={
    return word == word.reverse }