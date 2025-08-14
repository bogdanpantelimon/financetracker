package main

import (
	"fmt"
	"time"

	"github.com/bogdanpantelimon/financetracker/internal/datasource"
	"github.com/bogdanpantelimon/financetracker/internal/model"
)

func main() {

	dsn := "user:password@tcp(127.0.0.1:3307)/db?charset=utf8mb4&parseTime=True&loc=Local"
	db, err := datasource.ConenctToMySQL(dsn)
	if err != nil {
		panic("failed to connect to database: " + err.Error())
	}

	db.AutoMigrate(&model.Expense{})
	db.AutoMigrate(&model.Income{})

	expense := model.Expense{
		Id:   1,
		Date: time.Now(),
		Sum:  100.50,
		Name: "Groceries",
	}

	fmt.Println("Expense created:", expense)
}
