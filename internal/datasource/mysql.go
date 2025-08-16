package datasource

import (
	"gorm.io/driver/mysql"
	"gorm.io/gorm"
)

func ConenctToMySQL(dsn string) (*gorm.DB, error) {
	db, err := gorm.Open(mysql.Open(dsn), &gorm.Config{})
	return db, err
}
