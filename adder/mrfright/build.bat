@echo off
mkdir build
pushd build

REM be sure to have run vcvarsall.bat in the shell running this script
REM vcvarsall.bat at somewhere like "C:\Program Files (x86)\Microsoft Visual Studio Community 2013\VC\vcvarsall.bat"
cl -FC -Zi ..\test.c

popd