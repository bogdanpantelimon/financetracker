type Income struct {
	Id     int       `json:"id"`
	Date   time.Time `json:"data"`
	Amount float32   `json:"amount"`
	Source string    `json:"source"`
}