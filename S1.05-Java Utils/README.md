# How to Compile and Execute Java Files

Go to the directory with cd command where the `.java` files are.
Compile first all the files `.java` in order to run them in your command line (in case you have errors, try to put first in the order the Main file):

```bash
javac Main.java name_of_the_file2.java
```

There will be no output in the bash if it went all well. The compiler will create the name_of_the_file1.class in the current working directory.
To run the compiled file:

```bash
java Main.java
```

## Instructions

To run these exercises you have to add at the end the path of directory with which you want to work.
It's going to be the argument of the program (args[0]).
Add the absolute path: 
C:\Users\directory

```bash
javac Main.java Directory.java
java Main.java C:\Users\directory
```

Things to consider:
- If the directory's name has the space in the middle, you have to add
single quotes: 'C:\Users\S1.01-Inheritance and Polymorphism\'
- If the argument is going to be the file don't add at the end `\`
- If you have to compile 2 files, and you encountered `symbol not found` error, try this:

```bash
javac -d . Main.java Directory.java
```
