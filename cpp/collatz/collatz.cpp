#include <iostream>
#include <vector>

using namespace std;


vector<unsigned long long> collatz(unsigned long long start);

int main()
{
  unsigned long long startnumber;
  cout << "Please give an Integer:";
  cin >> startnumber;

  vector<unsigned long long> result = collatz(startnumber);
  cout << "The sequence is " << result.size() << " long." << endl;
  
  return 0;
}


vector<unsigned long long> collatz(unsigned long long start)
{
  vector<unsigned long long> collatz_sequence;
  collatz_sequence.push_back(start);

  unsigned long long temp = start;

  while (temp != 1)
  {
    if (temp%2 == 0) temp = temp/2;
    else temp = 3*temp + 1;
    collatz_sequence.push_back(temp);
  }

  return collatz_sequence;
}
