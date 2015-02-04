To download openblas simply do

git clone git://github.com/xianyi/OpenBLAS

and it will download openblas in ./OpenBLAS/ 
To install OpenBLAS you would normally go to ./OpenBLAS/ and run "make".

On one machine, I had problems because make used g77 as a fortran
compiler. To get useful information about make you can run "make -n",
which will just display the commands make would do, without actually
executing them. 

https://groups.google.com/forum/#!topic/openblas-users/DCtLunNlDzA
According to this you can specify which compiler to use by running
"make FC=gfortran" and it worked.
