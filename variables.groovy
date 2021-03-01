// 1. define a variable without defining its type
name1 = "Rakibul"
println name1

// 2. define a variable with its type ** recomended
String name2 = "Hassan"
println name2

// 3. define a variable  *** recommended
def name3 = "Rony"
println name3

// 4. Both prints -> name is Rony
def name = "Rony"
println "name is ${name}" // By convention its preferable
println "name is $name"
 
// 5. Groovy is case sensitive
def var = "Hi there!"
def VAR = "Good Bye!"
println var // prints -> Hi there!
println VAR // prints -> Good Bye!


// 6. groovy is dynamically typed
String str = "this is a string"
str = 100
println str // 100

// 7.a can be used multiple assignments
 def (a,b,c) = [10,20,30]
 println a // 10
 println b // 20
 println c // 30

 // 7.b multiple assignments with DATA TYPES
 def (String x, int y,double z) = [10,20,30]
 println x // 10
 println y // 20
 println z // 30

 // 7.c multiple assignments with some missing values 
 def (m,n,o) = ["hi",20]
 println m // hi
 println n // 20
 println o // null

 // 7.d multiple assignments with some missing values 
 def (p,q) = ["Nice",20,"good"]
 println p // Nice
 println q // 20
