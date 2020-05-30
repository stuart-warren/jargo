package main

import (
	"fmt"
	"os"
)

func main() {
	fmt.Printf("Hello world from GO!\n")
	fmt.Printf("Args:\n")
	for i, a := range os.Args {
		fmt.Printf("\t[%d] %s\n", i, a)
	}
	fmt.Printf("Environ:\n")
	for _, e := range os.Environ() {
		fmt.Printf("\t%s\n", e)
	}
}
