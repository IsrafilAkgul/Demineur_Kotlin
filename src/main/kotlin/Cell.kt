data class Cell(
    // A boolean that tells if this cell is a bomb.
    var isBomb: Boolean = false,

    // The number of bombs in the nearby cells.
    var numberBombNeighbor: Int = 0,

    // A boolean that tells if this cell was revealed by the player.
    var isRevealed: Boolean = false,

    // A boolean that tells if the player put a flag on this cell.
    var isFlagged: Boolean = false
)


// The Getters
fun getIsBomb(cell : Cell) : Boolean {
    return cell.isBomb
}

fun getBombNeighbor(cell : Cell) : Int {
    return cell.numberBombNeighbor
}

fun getIsRevealed(cell : Cell) : Boolean {
    return cell.isRevealed
}

fun getIsFlagged(cell : Cell) : Boolean {
    return cell.isFlagged
}


// The Setters
fun setIsBomb(cell: Cell) {
    cell.isBomb = true
}

fun setIsBomb(cell: Cell, number: Int) {
    cell.numberBombNeighbor = number
}

fun setIsRevealed(cell: Cell) {
    cell.isRevealed = true
}

fun setIsFlagged(cell: Cell) {
    cell.isFlagged = true
}