<?php
$username = "gandalf";
$password = "mellon";
$hostname = "localhost";
$dbname = "mithril";

// lets connect to mysql
$dbhandle = mysql_connect($hostname, $username, $password) or die("Unable to connect to mysql!");
echo "Connected to mysql<br />";

// $query = "CREATE DATABASE IF NOT EXISTS $dbname";

// if (mysql_query($query))
// {
//   echo "Database $dbname created successfully <br />";
// }
// else
// {
//   echo "Error in creating database: ", mysql_error();
// }


// select database
if (!mysql_select_db($dbname)) die (mysql_error());
echo "Successfully opened database <br />";

// add table to database
$query = "CREATE TABLE address_book (first_name VARCHAR(40), last_name VARCHAR(40), email_adress VARCHAR(60))";
if (!mysql_query($query)) echo "Error in creating table: ", mysql_error();



// close mysql connection
mysql_close($dbhandle);
?>
