# jargo

build golang binary into a jar

## build

``` sh
go build -o out/app ./...
javac Main.java
jar cmvf META-INF/MANIFEST.MF main.jar Main.class out/app
java -jar main.jar
```
