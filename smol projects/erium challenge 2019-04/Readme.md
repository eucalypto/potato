# Erium Challenge

https://erium.de/2019/04/best-data-scientists-in-town/

## Question:

Find third 8-digit prime in consecutive digits of e


## Problem analysis

First, we need to generate the digits of the euler number e. Then we can find the prime in them.

### Generate digits of e

The euler number can be defined as an infinite series or sum.

### Find prime

#### Naive approach

We could take each 8-digit number and check if it's a prime. We would need a is_prime() function that checks if this number is a prime.

This solution feels like the most expensive one.

#### Generate primes first

Since we need explicitly 8-digit primes, I suggest the following:
 a) generate all 8-digit primes
 b) check the 8-digit numbers from e against this list

The advantage: The prime number generation has to be done only once. And the comparison of a nuber to this prime list should be way easier than checking if it is a prime.
