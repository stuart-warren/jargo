# jargo

build golang binary into a jar

## build

``` sh
go build -o out/app ./...
javac Hello.java
jar cmvf META-INF/MANIFEST.MF hello.jar Hello.class out/app
java -jar hello.jar
```
