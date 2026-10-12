#!/bin/sh
# Run from inside this folder.
# javac -d . creates the college/students/ directory structure automatically.
rm -rf college
javac -d . Student.java
javac -d . -cp . Main.java
java college.students.Main
