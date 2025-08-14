package main

import (
	"fmt"
	"time"

	"github.com/bogdanpantelimon/financetracker/internal/model"
)

func main() {

	expense := model.Expense{
		Id:   1,
		Date: time.Now(),
		Sum:  100.50,
		Name: "Groceries",
	}

	fmt.Println("Expense created:", expense)
}
