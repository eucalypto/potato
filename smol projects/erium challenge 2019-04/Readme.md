# Erium Challenge

https://erium.de/2019/04/best-data-scientists-in-town/

## Question:

Find third 8-digit prime in consecutive digits of e


## Problem analysis

First, we need to generate the digits of the euler number e. Then we can find the prime in them.

### Generate digits of e

This [wikipedia page](https://en.wikipedia.org/wiki/List_of_representations_of_e) gives a list of representations of e.

#### Straight forward approach

The euler number can be defined as an infinite series (or sum). The most straight forward is the faculty series:
  e = Sum_(k=0) ^(infinity) 1/k!

The beauty of this series is that each term is smaller than the previous one. So if we take a specific digit of e and sum up enough terms, this digit should not change anymore.

##### Subtlety with this approach

We need to make sure that this specific digit does not change even if we summed up all other following terms of which there are an infinite amount of.

##### Why floats don't work

We could just use floating point numbers and run the series until it reaches the current precision of the float. But that would only give the number of digits as the precision of the float. That would be 32, 64 or maybe 100. But we probably need much more than that!

Also, we have rational numbers that a float can't represent like 1/3 = 0.333333... 

##### Alternative to floats

One python package that I found is [fractions](https://docs.python.org/3/library/fractions.html) that provides support for rational numbers.



### Find prime

#### Naive approach

We could take each 8-digit number and check if it's a prime. We would need a is_prime() function that checks if this number is a prime.

This solution feels like the most expensive one.

#### Generate primes first

Since we need explicitly 8-digit primes, I suggest the following:
 a) generate all 8-digit primes
 b) check the 8-digit numbers from e against this list

The advantage: The prime number generation has to be done only once. And the comparison of a nuber to this prime list should be way easier than checking if it is a prime.
