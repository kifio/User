Simple pure kotlin programm without any dependencies.

compile: `kotlinc *.kt -include-runtime -d sample.jar`
run: `kotlin -cp sample.jar Sample foo bar`
out: 
```
This is sample app!
foo
bar
``` 