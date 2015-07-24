<?php
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
print_r ($friends) ;
echo "<br />";
echo $friends[1];
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
foreach ($emails as $value) {
  echo "Processing ". $value."<br />";
}
// and with associative arrays:
$infos = array("Name" => "Legolas", "Age" => "823", "Adress" => "Nowhere street, 77");
foreach ($infos as $key => $value) {
  echo "$key is $value <br />";
}

?>