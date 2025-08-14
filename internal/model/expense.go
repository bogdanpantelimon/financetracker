package model

import "time"

type Expense struct {
	Id   int
	Date time.Time
	Sum  float32
	Name string
}
