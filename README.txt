to initialize the database need to run the 4-21-2014.sql file to add the table 
(ex: mysql -u root clwtest < 4-21-2014.sql )

CONST.java  may need the connectionstring changed as it is currently and is used to 
in Add.java and Const.java 
jdbc:mysql://localhost/clwtest?user=root

Notes
I tired to get XML validation to work but it did not work so validation is done in the class
This is on github at https://github.com/chris-l-weber/jive if you wish to look at my commits 
the local git repo is also in this sourcecode zip file 

Extras
If I took more time I think most the work would be on the front end things like alternateing colors
on the tables, pageation, sorting. for the backend I would implment the remaining CRUD functions,
make it so it works as an API call for use in a AJAX/JS/mobile front end, or simular. 
   