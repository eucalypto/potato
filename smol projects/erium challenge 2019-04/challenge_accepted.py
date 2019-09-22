# /usr/bin/env python

import math
import numpy as np


def e_faculty_series(m: int):
    """ Return E(m) = Sum_n=0^m (1/m!) It's the finite part of the
series that defines e. """
    result = 0
    for i in range(m):
        result += 1.0 / (math.factorial(i))
    return result


def prime_gen(maxdigits: int):
    maxnumber = 10 ** maxdigits
    candidates = np.array(range(0, maxnumber))
    for remove_multiples_of in range(2, int(maxnumber / 2)):
        index = 2 * remove_multiples_of
        while index < maxnumber:
            candidates[index] = 0
            index += remove_multiples_of

    return [number for number in candidates if number != 0]


if __name__ == '__main__':
    primes = prime_gen(7)
    print(primes[-10:])
    # [99999787, 99999821, 99999827, 99999839, 99999847, 99999931, 99999941, 99999959, 99999971, 99999989]
