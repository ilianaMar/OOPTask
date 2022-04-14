# OOPTask US007

Orders functionality task for OOP exercise
Variables declared in for the class:
year - numerical value ,showing the year till which the order is valid ;
amount -  numerical value showing the total price of the order (you can use different types than Integer);
isE-Order - Boolean value showing the type of order ;
maxNumOfPages - numerical value of the numbers of pages content ;
numberOfPages - numerical value of the numbers of pages content used (use different types than Integer);
numberOFPagesLeft - numerical value of the numbers of pages left to be used ;
employSignature - text field containing the name of the employ issued the order;

The class should define the following methods and actions:
- method void changeEmploySignature(String newEmploySignature) - which changes the value of the field  employSignature entered as parameter;
-  method void usedPages(double pages) - which decreases the value of numberOFPagesLeft with the amount of the entered value of the parameter ;
-if the value of the argument is higher than maxNumOfPages , print a warning message ;
- Create a class OrderSession with main method;
- In the scope of the main method , create 2 objects of type Order with values for the fields: year , amount ,maxNumOfPages , numberOfPages , numberOFPagesLeft and employSignature.
- One of the "orders" should be issued on paper;
- One of the orders should contain 4.5 pages (use method usedPages(double pages));
- Change the other orders operator (use  changeEmploySignature(String newEmploySignature));
- Print all the fields on the screen, accordingly for the both orders; 
