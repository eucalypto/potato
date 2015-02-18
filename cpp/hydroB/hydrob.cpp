#include <iostream>
#include <armadillo>
#include <vector>
#include "../../../gnuplott/gnuplott.h"


using namespace std;
using namespace arma;


int
main(int argc, char** argv)
{
  cout << "Armadillo version: " << arma_version::as_string() << endl;
  
  double Bmin = 0;
  double Bmax = 3;
  double Bstep = 0.01;

  mat H1 = zeros<mat>(4,4);
  H1(1,2) = 1.0/6000;
  H1(2,1) = H1(1,2);

  H1.print("H1:");

  colvec q1;
  q1 << 1.0/2000 - 1
    << 1.0/2000 + 1
    << -1.0/2000 - 1
    << -1.0/2000 + 1;
  mat Hdiag1 = zeros(4,4);
  Hdiag1.diag() = q1;

  Hdiag1.print("Hdiag1:");

  mat Hdiag2 = zeros(4,4);
  colvec q2;
  q2 << 1.0/12000
     << -1.0/12000
     << -1.0/12000
     << 1.0/12000;
  Hdiag2.diag() = q2;
  Hdiag2.print("Hdiag2:");
  
  mat eigs;
  vector<double> Bs;
  for(double B = Bmin; B <= Bmax; B += Bstep)
  {
    mat H = H1 + 0.5 * B * Hdiag1 + Hdiag2;
    vec eigval = eig_sym(H);
    eigs = join_rows(eigs,eigval);
    Bs.push_back(B);
  }
      

  gnuplott plotting;


  for(int j = 0; j < 4; j++)
  {
    for(int i = 0; i < Bs.size(); i++)
    {
      plotting.addPoint( Bs[i], eigs(j,i) );
    }
    plotting.endoffunction();
  }
  
  plotting.plot();
  
  return 0;
}

