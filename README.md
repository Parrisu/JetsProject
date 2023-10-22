# JetsProject

## Description

### Technologies Used
Java, OOP, Eclipse

### Lessons Learned

In this project I learned how to access object data from inside of an `ArrayList`.

Using the `.` operator helped me look through the available options however, it does not do all of the work for you.
The main problem I had was with `loadCargo()`.

I tried multiple ways of accessing the method with no results. I was having trouble figuring out how how to call it from the `ArrayList`. It finally compiled after I did these three things.

1. Changed `CargoCarrier` to an instance instead of a class. 
2. Made `CargoPlane` implement `CargoCarrier`. 
3. Casted `jetAddition` to a cargo plane inside parenthesis so the compiler would evaluate the `cast` prior to calling the implemented method. 
	`((CargoPlane) jetAddition.get(i)).loadingCargo();`
	

This was probably my biggest breakthrough and longest portion of the entire project. A simple part it seems, but putting it all together can be a bit mind bending.

A big learning process for me was getting to understand the `Debug` system within Eclipse. Using the debugger allowed me to see the variables and whether or not they were being properly assigned with the correct data. This really helped when I was trying to find out why I was getting `null` variables in the early stages of the project.

### How To Use This Program

1. Run the program.
2. You are presented with 9 options.
	- select your choice with a single digit input from 1 - 9.
		1. Will list the current Jet's in the AirField.
		2. Will activate all of the Jets' flying command.
		3. Shows the fastest Jet.
		4. Shows the Jet with the longest range.
		5. Will tell the Cargo Planes to load cargo.
		6. Will tell the Fighter Jets to prepare for combat.
		7. Will allow you to add a Passenger Jet to the AirField.
		8. Will allow you to remove any Jet of your choice in the AirField.
		9. Will exit the program.
3. Have fun with it!

Thank you for checking out my program! 
-Parris