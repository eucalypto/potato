<?php
// this script is a trying of the things I learn from:
// http://onlinephpguide.com/
echo "Hello, this is me", " and me", "<br />";
echo $_SERVER['HTTP_USER_AGENT'], "<br />";
$user_name = "Gandalf the Grey";
// Concatenate strings with (.) dot:
print "I am called" . " " . $user_name;
echo "<br />";

// strlen() gives the length of a string:
echo strlen( "I am ". "Groot");
echo "<br />";

// strpos() will search for a string in another string and return the
// first position if found:
echo strpos( "Hello, I am Groot", "am");
echo "<br />";

// Conditionals:
if ($user_name == "Gandalf the Grey")
{
  echo "I know you, Gandalf! <br />";
}
else
{
  echo "I don't know you. Who are you? <br />";
}

// also with switch command:
switch($user_name)
{
  case "Gandalf the Grey": echo "Hello Gandalf, my friend! <br />";
                           break;
  case "Legolas": echo "Hello Legolas, long time no see! <br />";
                  break;
  default: echo "Go away, I have only two friends! <br />";
}

// arrays:
$friends = array ("Gandalf", "Legolas", "Gimli", "Aragorn");
print_r ($friends); // printing arrays
echo "<br />";
echo $friends[1]; // accessing a certain entry in array
echo "<br />";

// loops:
$var = 0;
while ($var < 10)
{
  echo "Var is: ", $var;
  echo "<br />";
  $var++;
}

echo "<br />";

// iterate through array elements with foreach():
$emails = array("gandalf@gmail.com", "legolas@yahoo.com", "gimlixxx@web.de");
foreach ($emails as $value)
{
  echo "Processing ". $value . "<br />";
}
// and with associative arrays:
$infos = array("Name" => "Legolas", "Age" => "823", "Adress" => "Nowhere street, 77");
foreach ($infos as $key => $value)
{
  echo "$key is $value <br />";
}

// definition of a function
function my_mult($num1, $num2)
{
  echo "This function returns the product of $num1 and $num2";
  echo "<br />";
  return $num1 * $num2;
}

// call of my function
echo my_mult(3, 4);
$var_mult1 = 3;
$var_mult2 = 5;
$var_mult_res = my_mult($var_mult1, $var_mult2);
echo $var_mult_res;


// now some constants, that cannot change during execution:
define("CONST1", "This thing cannot change!");
define("CONST2", "I am immovable like the flow of time.");

echo constant("CONST1") . "<br />";
echo constant("CONST2") . "<br />";

// date function
echo "Today is", date("D, d M Y"), "<br />";
echo "and there are ", 365-date("z"), "days left of this year", "<br />";
echo "And this is today in the only viable time format:", date("Y-m-d"), "<br />";

// filters

$int = '1234';
echo filter_var($int, FILTER_VALIDATE_INT);


?>
