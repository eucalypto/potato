// This program calculates the quare root of a real number. For this
// it uses the Babylonian method, which is just a simplification of
// Newton's method.

#include <iostream>
#include <cmath>

using namespace std;

int main(){
  double a;
  double precision;

  cout << "Please enter the number to be squared:";
  cin >> a;
  cout << "Please enter the precision you want to have (e.g. 0.00001):";
  cin >> precision;
  cout << "number: " << a << endl
       << "precision:" << precision;
  double approx = a/4.0;
  double approx_old;


  
  do {
    approx_old = approx;
    approx = 0.5 * (approx + a/approx);
  } while ( abs(approx - approx_old) > precision );
  cout << "The square root of "
       << a << " is approximately "
       << approx << "." << endl;


  return 0;
}
