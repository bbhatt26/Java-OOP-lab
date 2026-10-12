#!/bin/sh
# Run from inside this folder
rm -rf out
javac -d out company/employees/Employee.java company/main/Main.java
java -cp out company.main.Main
