# /usr/bin/env python

import math


def e_faculty_series(m: int):
    """ Return E(m) = Sum_n=0^m (1/m!) It's the finite part of the
series that defines e. """
    result = 0
    for i in range(m):
        result += 1.0/(math.factorial(i))
    return result
