# Instructions  
### Description:
In this activity you will be learning how and when to use switch statements. You will create a menu and ordering system. Depending on what the customer orders you will print out different statements.

Please follow the steps below:

### Steps:
1. The first thing we will need is a Scanner object created. Recall that to use a scanner object, we need to import the Scanner class. Enter the following code into your **Main.java** file, above the class definition:
```Java
import java.util.Scanner;
```
2. In your **main()** method, create a Scanner object and save it into a variable. Refer to the Scanner Replit activity or lesson for an example of creating a Scanner object.
3. Next, let's add in a menu so that the user can see their menu options. Add the following code below what you have so far in your **main()** method:
```Java
System.out.println("Welcome to our Diner! Please select an entree:\n"
                   + "1) steak\n"
                   + "2) wings\n"
                   + "3) salad\n"
                   + "and any other number for nothing!");
```
 4. Let's give the user the ability to choose a menu option. Recall that we will use the scanner object to get user input. Use the scanner object's **nextInt()** method to get the user's choice and make sure to save it into a variable named **choice**. Refer to the Scanner Replit activity or lesson for an example of using a scanner object's methods.
 5. Now that the user can enter a menu choice, let's make a decision based off of that choice. Add in the following switch statement below what you have so far in your **main()** method:
```Java
switch(choice) {
  case 1: System.out.println("Here is your steak!");
          break;
  case 2: System.out.println("Here is your wings!");
          break;
  case 3: System.out.println("Here is your salad!");
          break;
  default: System.out.println("You want nothing?!");
          break;
}  
```
A **switch** statement takes in a value and tries to match it to a value in each of its **case clauses**. If there is a match, the case clause with the matching value will execute its statements. If the case clause doesn't contain a `break;` statement, **fallthrough** would occur, which is where each case that comes after the matching case clause will execute as well until a `break;` statement stops the execution. Note that each case clause in our example has a `break;` statement at the end of it to prevent fallthrough. 

At this point, it would be a good idea to run the program and test out its current functionality. The user should see a menu displayed in the console and they should be able to enter a choice and see the corresponding output printed out to the console.

6. Next, let's have the user make another decision. Add the following menu below what you have so far in your **main()** method:
```Java
System.out.println("\nPlease select a drink:\n"
                   + "1) iced tea\n"
                   + "2) soda\n"
                   + "3) lemonade\n"
                   + "and any other number for nothing!");
```
7. Next, get the user's choice again and create a switch statement that does the following:
  - prints `"Here is your iced tea!"` if the user chose option `1`
  - prints `"Here is your soda!"` if the user chose option `2`
  - prints `"Here is your lemonade!"` if the user chose option `3`
  - prints `"You want nothing?!"` if the user chose option `4`

8. Finally, close your Scanner object.
   
### Test:
Use the test provided.

#### Sample output if the user enters the input '1' and then '2':
```
Welcome to our Diner! Please select an entree:
1) steak
2) wings
3) salad
and any other number for nothing!
1
Here is your steak!

Please select a drink:
1) iced tea
2) soda
3) lemonade
and any other number for nothing!
2
Here is your soda!
```